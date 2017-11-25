/*
 * IT15018960
 * D.U. Liyanage  * 
 * CSSE-02  * 
 */
package fareCalculation.view;

import fareCalculation.controller.MainController;
import java.awt.GridBagConstraints;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;

/**
 *
 * @author D.U.Liyanage *
 */
public class MainView extends javax.swing.JFrame {

    private static final Logger MAIN_VIEW_LOG = Logger.getLogger(MainView.class.getName());
    //for actionPanel navigation
    JPanel[] panelArray;
    //external panel variables
    WelcomeView welcomeView = new WelcomeView();
    GridBagConstraints panel_cordinates = new GridBagConstraints();

    public MainView() {

        initComponents();
        this.setLocationRelativeTo(null); //setting to display in the center of screen
        MainController.setDateTime(dayLabel, timeLabel);
        panel_cordinates.gridx = 0;
        panel_cordinates.gridy = 0;

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException class_exception) {
            MAIN_VIEW_LOG.log(Level.SEVERE, class_exception.getMessage());
        } catch (InstantiationException insantiation_exception) {
            MAIN_VIEW_LOG.log(Level.SEVERE, insantiation_exception.getMessage());
        } catch (IllegalAccessException illegal_exception) {
            MAIN_VIEW_LOG.log(Level.SEVERE, illegal_exception.getMessage());
        } catch (javax.swing.UnsupportedLookAndFeelException unsupported_exception) {
            MAIN_VIEW_LOG.log(Level.SEVERE, unsupported_exception.getMessage());
        }

        //show welcome view on application start
        actionPanel.add(welcomeView, panel_cordinates);
        MainController.getPanel(actionPanel);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fareCalculationMainDesktopPane = new javax.swing.JDesktopPane();
        wizardMainPanel = new javax.swing.JPanel();
        mainPanelHeader = new javax.swing.JPanel();
        dayLabel = new javax.swing.JLabel();
        timeLabel = new javax.swing.JLabel();
        actionPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(600, 400));
        setMinimumSize(new java.awt.Dimension(600, 400));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fareCalculationMainDesktopPane.setBackground(new java.awt.Color(255, 255, 255));
        fareCalculationMainDesktopPane.setPreferredSize(new java.awt.Dimension(600, 400));

        wizardMainPanel.setBackground(new java.awt.Color(255, 255, 255));
        wizardMainPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(42, 135, 235), 2));
        wizardMainPanel.setMaximumSize(new java.awt.Dimension(600, 400));
        wizardMainPanel.setMinimumSize(new java.awt.Dimension(600, 400));
        wizardMainPanel.setPreferredSize(new java.awt.Dimension(600, 400));
        wizardMainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mainPanelHeader.setBackground(new java.awt.Color(255, 255, 255));
        mainPanelHeader.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dayLabel.setBackground(new java.awt.Color(255, 255, 255));
        dayLabel.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        dayLabel.setForeground(new java.awt.Color(51, 153, 255));
        dayLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dayLabel.setText("date");
        mainPanelHeader.add(dayLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 12, 121, 19));

        timeLabel.setBackground(new java.awt.Color(255, 255, 255));
        timeLabel.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        timeLabel.setForeground(new java.awt.Color(51, 153, 255));
        timeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        timeLabel.setText("time");
        mainPanelHeader.add(timeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(409, 11, 120, 20));

        wizardMainPanel.add(mainPanelHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 580, 40));

        actionPanel.setBackground(new java.awt.Color(255, 255, 255));
        actionPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(42, 135, 235), 2, true));
        actionPanel.setMaximumSize(new java.awt.Dimension(500, 300));
        actionPanel.setMinimumSize(new java.awt.Dimension(500, 300));
        actionPanel.setPreferredSize(new java.awt.Dimension(500, 300));
        actionPanel.setLayout(new java.awt.GridBagLayout());
        wizardMainPanel.add(actionPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 580, 340));

        fareCalculationMainDesktopPane.setLayer(wizardMainPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout fareCalculationMainDesktopPaneLayout = new javax.swing.GroupLayout(fareCalculationMainDesktopPane);
        fareCalculationMainDesktopPane.setLayout(fareCalculationMainDesktopPaneLayout);
        fareCalculationMainDesktopPaneLayout.setHorizontalGroup(
            fareCalculationMainDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
            .addGroup(fareCalculationMainDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(fareCalculationMainDesktopPaneLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(wizardMainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        fareCalculationMainDesktopPaneLayout.setVerticalGroup(
            fareCalculationMainDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
            .addGroup(fareCalculationMainDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(fareCalculationMainDesktopPaneLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(wizardMainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        getContentPane().add(fareCalculationMainDesktopPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel actionPanel;
    private javax.swing.JLabel dayLabel;
    private javax.swing.JDesktopPane fareCalculationMainDesktopPane;
    private javax.swing.JPanel mainPanelHeader;
    private javax.swing.JLabel timeLabel;
    private javax.swing.JPanel wizardMainPanel;
    // End of variables declaration//GEN-END:variables
}
