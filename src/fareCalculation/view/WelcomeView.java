/*
 * IT15018960
 * D.U. Liyanage  * 
 * CSSE-02  * 
 */
package fareCalculation.view;

import fareCalculation.controller.CardReadViewController;
import fareCalculation.controller.MainController;
import static fareCalculation.controller.MainController.swapped_flag;
import fareCalculation.controller.WelcomeViewController;
import fareCalculation.model.Journey;
import fareCalculation.model.UserAccount;
import java.awt.Color;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JOptionPane;

/**
 *
 * @author D.U.Liyanage *
 */
public class WelcomeView extends javax.swing.JPanel {

    private static final Logger WELCOME_VIEW_LOG = Logger.getLogger(WelcomeView.class.getName());

    int swapped_user;

    public WelcomeView() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelLabel = new javax.swing.JLabel();
        headerLabel = new javax.swing.JLabel();
        swipeDemoButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(500, 300));
        setMinimumSize(new java.awt.Dimension(500, 300));
        setPreferredSize(new java.awt.Dimension(500, 300));

        panelLabel.setBackground(new java.awt.Color(255, 255, 255));
        panelLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        panelLabel.setForeground(new java.awt.Color(51, 153, 255));
        panelLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panelLabel.setText("Please swap your travel card ");

        headerLabel.setBackground(new java.awt.Color(255, 255, 255));
        headerLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        headerLabel.setForeground(new java.awt.Color(51, 153, 255));
        headerLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        headerLabel.setText("Welcome!");

        swipeDemoButton.setBackground(new java.awt.Color(42, 135, 235));
        swipeDemoButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        swipeDemoButton.setForeground(new java.awt.Color(255, 255, 255));
        swipeDemoButton.setText("SWIPE DEMO");
        swipeDemoButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                swipeDemoButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                swipeDemoButtonMouseExited(evt);
            }
        });
        swipeDemoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                swipeDemoButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(194, 194, 194)
                .addComponent(headerLabel))
            .addGroup(layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(panelLabel))
            .addGroup(layout.createSequentialGroup()
                .addGap(180, 180, 180)
                .addComponent(swipeDemoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(headerLabel)
                .addGap(51, 51, 51)
                .addComponent(panelLabel)
                .addGap(47, 47, 47)
                .addComponent(swipeDemoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void swipeDemoButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_swipeDemoButtonMouseEntered
        swipeDemoButton.setBackground(new Color(38, 37, 114));
    }//GEN-LAST:event_swipeDemoButtonMouseEntered

    private void swipeDemoButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_swipeDemoButtonMouseExited
        swipeDemoButton.setBackground(new Color(42, 135, 235));
    }//GEN-LAST:event_swipeDemoButtonMouseExited

    private void swipeDemoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_swipeDemoButtonActionPerformed

        UserAccount userAcc = new UserAccount(1, "available");
        //if card is swiped for the second time - end journey
        if (swapped_flag) {
            Journey end_journey = new Journey(1, "Borella");
            CardReadViewController.calculateFare(end_journey);
        } else {

            boolean validity_flag = WelcomeViewController.checkValidity(userAcc);
            boolean card_flag = CardReadViewController.checkBalance(userAcc.getUserId());

            if (validity_flag && card_flag) {
                this.setVisible(false);
                if (swapped_flag == false) //if card is being swiped for the first time
                {
                    swapped_flag = true;
                    swapped_user = 1;
                }
                MainController.actionPanelNavigation("READ");
            } else {
                //invalid token
                try {
                    //open an audio input stream           
                    File soundFile = new File("C:\\Users\\USER\\Documents\\NetBeansProjects\\FareCalculation\\src\\fareCalculation\\resources\\Alarm.wav");
                    AudioInputStream audioIn = AudioSystem.getAudioInputStream(soundFile);
                    //get a sound clip resource
                    Clip clip = AudioSystem.getClip();
                    //open audio clip and load samples from the audio input stream
                    clip.open(audioIn);
                    clip.start();
                } catch (UnsupportedAudioFileException unsupported_exception) {
                    WELCOME_VIEW_LOG.log(Level.SEVERE, unsupported_exception.getMessage());
                } catch (IOException io_exception) {
                    WELCOME_VIEW_LOG.log(Level.SEVERE, io_exception.getMessage());
                } catch (LineUnavailableException line_exception) {
                    WELCOME_VIEW_LOG.log(Level.SEVERE, line_exception.getMessage());
                }
                JOptionPane.showMessageDialog(null, "Invalid Token!", "Error", JOptionPane.WARNING_MESSAGE);
            }

        }

    }//GEN-LAST:event_swipeDemoButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel headerLabel;
    private javax.swing.JLabel panelLabel;
    private javax.swing.JButton swipeDemoButton;
    // End of variables declaration//GEN-END:variables
}
