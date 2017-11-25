/*
 * IT15018960
 * D.U. Liyanage  * 
 * CSSE-02  * 
 */
package fareCalculation.controller;

import fareCalculation.view.CardReadView;
import fareCalculation.view.FeedBackView;
import fareCalculation.view.WelcomeView;
import java.awt.GridBagConstraints;
import fareCalculation.util.DBConnect;
import java.util.Calendar;
import javax.swing.JLabel;
import javax.swing.JPanel;
import static java.lang.Thread.sleep;
import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author D.U.Liyanage *
 */
public class MainController {

    public static final Connection CONNECTION = DBConnect.ConnectDB();
    private static final Logger MAIN_CONTROLLER_LOG = Logger.getLogger(MainController.class.getName());
    public static boolean swapped_flag = false;

    //for actionPanel navigation
    static JPanel actionPanel;
    static GridBagConstraints panel_cordinates = new GridBagConstraints();

    public static void getPanel(JPanel panel) {
        actionPanel = panel;
    }

    //handling date and time
    public static void setDateTime(JLabel dayLabel, JLabel timeLabel) {
        Calendar now = Calendar.getInstance();
        int month = now.get(Calendar.MONTH);
        int date = now.get(Calendar.DATE);
        int year = now.get(Calendar.YEAR);
        String full_date = date + "/" + month + "/" + year;
        dayLabel.setText(full_date);

        Thread clock = new Thread() {
            @Override
            public void run() {
                for (;;) {
                    Calendar now = Calendar.getInstance();
                    int second = now.get(Calendar.SECOND);
                    int min = now.get(Calendar.MINUTE);
                    int hr = now.get(Calendar.HOUR_OF_DAY);
                    String time = String.format("%02d:%02d:%02d", hr, min, second);
                    timeLabel.setText(time);
                    try {
                        sleep(1000);
                    } catch (InterruptedException ex) {
                        System.out.println(ex);
                    }
                }
            }
        };
        clock.start();
    }

    //handling panel navigation
    public static void actionPanelNavigation(String buttonName) {

        WelcomeView welcomeView = new WelcomeView();
        CardReadView cardReadView = new CardReadView();
        FeedBackView feedbackView = new FeedBackView();
        panel_cordinates.gridx = 0;
        panel_cordinates.gridy = 0;

        switch (buttonName) {
            case "WELCOME":
                actionPanel.removeAll();
                actionPanel.add(welcomeView, panel_cordinates);
                break;
            case "READ":
                actionPanel.removeAll();
                actionPanel.add(cardReadView, panel_cordinates);
                cardReadView.redirectedInLabel.setVisible(false);
                cardReadView.secondsLabel.setVisible(false);
                cardReadView.ticketDetailsPanel.setVisible(false);
                break;
            case "FEEDBACK":
                actionPanel.removeAll();
                actionPanel.add(feedbackView, panel_cordinates);
                JLabel[] labels = new JLabel[]{feedbackView.messageHeaderLabel, feedbackView.messageLabel,
                    feedbackView.tokenIdShowLabel, feedbackView.packageTypeShowLabel, feedbackView.TotalAmountShowLabel, feedbackView.journeyStartShowLabel, feedbackView.journeyEndShowLabel};
                CardReadViewController.feedbackControl(labels);
                break;
            default:
                MAIN_CONTROLLER_LOG.log(Level.SEVERE, "Transition Error");
                break;
        }
    }
}
