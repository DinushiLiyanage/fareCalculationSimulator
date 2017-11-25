/*
 * IT15018960
 * D.U. Liyanage  * 
 * CSSE-02  * 
 */
package fareCalculation.view;

import fareCalculation.controller.MainController;
import fareCalculation.controller.CardReadViewController;
import fareCalculation.model.Journey;
import java.awt.Color;
import java.util.Random;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author D.U.Liyanage *
 */
public class CardReadView extends javax.swing.JPanel {

    private static final Logger CARD_READ_VIEW_LOG = Logger.getLogger(CardReadView.class.getName());
    public static int SECOND = 10;

    public CardReadView() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        passengerNoLabel = new javax.swing.JLabel();
        passengerNoTextBox = new javax.swing.JTextField();
        cardReadConfirmButton = new javax.swing.JButton();
        cardReadDemoButton = new javax.swing.JButton();
        cardReadCancelButton = new javax.swing.JButton();
        ticketDetailsPanel = new javax.swing.JPanel();
        userIdShowLabel = new javax.swing.JLabel();
        TokenIdShowLabel = new javax.swing.JLabel();
        cardTypeShowLabel = new javax.swing.JLabel();
        journeyStartShowLabel = new javax.swing.JLabel();
        journeyStartLabel = new javax.swing.JLabel();
        cardTypeLabel = new javax.swing.JLabel();
        TokenIdLabel = new javax.swing.JLabel();
        userIdLabel = new javax.swing.JLabel();
        ticketDetailsLabel = new javax.swing.JLabel();
        passengersLabel = new javax.swing.JLabel();
        passengersShowLabel = new javax.swing.JLabel();
        redirectedInLabel = new javax.swing.JLabel();
        secondsLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(255, 255, 255));
        setToolTipText("");
        setMaximumSize(new java.awt.Dimension(500, 300));
        setMinimumSize(new java.awt.Dimension(500, 300));
        setPreferredSize(new java.awt.Dimension(500, 300));

        passengerNoLabel.setBackground(new java.awt.Color(255, 255, 255));
        passengerNoLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        passengerNoLabel.setForeground(new java.awt.Color(51, 153, 255));
        passengerNoLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        passengerNoLabel.setText("Enter Number of Passengers");

        passengerNoTextBox.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        passengerNoTextBox.setForeground(new java.awt.Color(51, 153, 255));
        passengerNoTextBox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                passengerNoTextBoxKeyTyped(evt);
            }
        });

        cardReadConfirmButton.setBackground(new java.awt.Color(42, 135, 235));
        cardReadConfirmButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cardReadConfirmButton.setForeground(new java.awt.Color(255, 255, 255));
        cardReadConfirmButton.setText("Confirm");
        cardReadConfirmButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cardReadConfirmButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cardReadConfirmButtonMouseExited(evt);
            }
        });
        cardReadConfirmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cardReadConfirmButtonActionPerformed(evt);
            }
        });

        cardReadDemoButton.setBackground(new java.awt.Color(42, 135, 235));
        cardReadDemoButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cardReadDemoButton.setForeground(new java.awt.Color(255, 255, 255));
        cardReadDemoButton.setText("DEMO");
        cardReadDemoButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cardReadDemoButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cardReadDemoButtonMouseExited(evt);
            }
        });
        cardReadDemoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cardReadDemoButtonActionPerformed(evt);
            }
        });

        cardReadCancelButton.setBackground(new java.awt.Color(42, 135, 235));
        cardReadCancelButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cardReadCancelButton.setForeground(new java.awt.Color(255, 255, 255));
        cardReadCancelButton.setText("Cancel");
        cardReadCancelButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cardReadCancelButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cardReadCancelButtonMouseExited(evt);
            }
        });
        cardReadCancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cardReadCancelButtonActionPerformed(evt);
            }
        });

        ticketDetailsPanel.setBackground(new java.awt.Color(255, 255, 255));

        userIdShowLabel.setBackground(new java.awt.Color(255, 255, 255));
        userIdShowLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        userIdShowLabel.setForeground(new java.awt.Color(51, 153, 255));
        userIdShowLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        userIdShowLabel.setText("UID");

        TokenIdShowLabel.setBackground(new java.awt.Color(255, 255, 255));
        TokenIdShowLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        TokenIdShowLabel.setForeground(new java.awt.Color(51, 153, 255));
        TokenIdShowLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        TokenIdShowLabel.setText("TID");

        cardTypeShowLabel.setBackground(new java.awt.Color(255, 255, 255));
        cardTypeShowLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cardTypeShowLabel.setForeground(new java.awt.Color(51, 153, 255));
        cardTypeShowLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        cardTypeShowLabel.setText("CT");

        journeyStartShowLabel.setBackground(new java.awt.Color(255, 255, 255));
        journeyStartShowLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        journeyStartShowLabel.setForeground(new java.awt.Color(51, 153, 255));
        journeyStartShowLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        journeyStartShowLabel.setText("JS");

        journeyStartLabel.setBackground(new java.awt.Color(255, 255, 255));
        journeyStartLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        journeyStartLabel.setForeground(new java.awt.Color(51, 153, 255));
        journeyStartLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        journeyStartLabel.setText("Journey Start");

        cardTypeLabel.setBackground(new java.awt.Color(255, 255, 255));
        cardTypeLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cardTypeLabel.setForeground(new java.awt.Color(51, 153, 255));
        cardTypeLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        cardTypeLabel.setText("Card Type");

        TokenIdLabel.setBackground(new java.awt.Color(255, 255, 255));
        TokenIdLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        TokenIdLabel.setForeground(new java.awt.Color(51, 153, 255));
        TokenIdLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        TokenIdLabel.setText("Token ID");

        userIdLabel.setBackground(new java.awt.Color(255, 255, 255));
        userIdLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        userIdLabel.setForeground(new java.awt.Color(51, 153, 255));
        userIdLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        userIdLabel.setText("User ID  ");

        ticketDetailsLabel.setBackground(new java.awt.Color(255, 255, 255));
        ticketDetailsLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ticketDetailsLabel.setForeground(new java.awt.Color(51, 153, 255));
        ticketDetailsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ticketDetailsLabel.setText("Journey Details");

        passengersLabel.setBackground(new java.awt.Color(255, 255, 255));
        passengersLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        passengersLabel.setForeground(new java.awt.Color(51, 153, 255));
        passengersLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        passengersLabel.setText("Passengers");

        passengersShowLabel.setBackground(new java.awt.Color(255, 255, 255));
        passengersShowLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        passengersShowLabel.setForeground(new java.awt.Color(51, 153, 255));
        passengersShowLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        passengersShowLabel.setText("PN");

        redirectedInLabel.setBackground(new java.awt.Color(255, 255, 255));
        redirectedInLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        redirectedInLabel.setForeground(new java.awt.Color(51, 153, 255));
        redirectedInLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        redirectedInLabel.setText("redirected in ");

        secondsLabel.setBackground(new java.awt.Color(255, 255, 255));
        secondsLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        secondsLabel.setForeground(new java.awt.Color(51, 153, 255));
        secondsLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout ticketDetailsPanelLayout = new javax.swing.GroupLayout(ticketDetailsPanel);
        ticketDetailsPanel.setLayout(ticketDetailsPanelLayout);
        ticketDetailsPanelLayout.setHorizontalGroup(
            ticketDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ticketDetailsPanelLayout.createSequentialGroup()
                .addGroup(ticketDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ticketDetailsPanelLayout.createSequentialGroup()
                        .addComponent(journeyStartLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(journeyStartShowLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ticketDetailsPanelLayout.createSequentialGroup()
                        .addComponent(cardTypeLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cardTypeShowLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ticketDetailsPanelLayout.createSequentialGroup()
                        .addGroup(ticketDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ticketDetailsLabel)
                            .addGroup(ticketDetailsPanelLayout.createSequentialGroup()
                                .addGroup(ticketDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(userIdLabel)
                                    .addComponent(TokenIdLabel))
                                .addGap(274, 274, 274)
                                .addGroup(ticketDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TokenIdShowLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(userIdShowLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(ticketDetailsPanelLayout.createSequentialGroup()
                        .addComponent(passengersLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(passengersShowLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(ticketDetailsPanelLayout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addComponent(redirectedInLabel)
                .addGap(29, 29, 29)
                .addComponent(secondsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ticketDetailsPanelLayout.setVerticalGroup(
            ticketDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ticketDetailsPanelLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(ticketDetailsLabel)
                .addGap(18, 18, 18)
                .addGroup(ticketDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(userIdLabel)
                    .addComponent(userIdShowLabel))
                .addGap(13, 13, 13)
                .addGroup(ticketDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TokenIdLabel)
                    .addComponent(TokenIdShowLabel))
                .addGap(11, 11, 11)
                .addGroup(ticketDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cardTypeLabel)
                    .addComponent(cardTypeShowLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ticketDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(journeyStartShowLabel)
                    .addComponent(journeyStartLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ticketDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(passengersShowLabel)
                    .addComponent(passengersLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(ticketDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(redirectedInLabel)
                    .addComponent(secondsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cardReadDemoButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cardReadCancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(cardReadConfirmButton))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(passengerNoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(88, 88, 88)
                        .addComponent(passengerNoTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(18, 18, 18)
                    .addComponent(ticketDetailsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(9, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(passengerNoTextBox)
                    .addComponent(passengerNoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cardReadConfirmButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cardReadCancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cardReadDemoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(217, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(101, Short.MAX_VALUE)
                    .addComponent(ticketDetailsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cardReadConfirmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cardReadConfirmButtonActionPerformed

        CardReadViewController.second = 10;
        if (passengerNoTextBox.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter number of passengers  to continue.", "Incomplete Request!", JOptionPane.WARNING_MESSAGE);
        } else {
            int passengers = Integer.parseInt(passengerNoTextBox.getText());
            //checking passenger number
            if (passengers > 42) {
                JOptionPane.showMessageDialog(null, "Invalid Number", "Invalid Request!", JOptionPane.WARNING_MESSAGE);
            }
            else
            {
                cardReadCancelButton.setEnabled(false);
                passengerNoTextBox.setEditable(false);
                cardReadDemoButton.setEnabled(false);
                JLabel[] labels = new JLabel[]{userIdShowLabel, TokenIdShowLabel, cardTypeShowLabel, journeyStartShowLabel};
                //show journey details
                CardReadViewController.showJourneyInfo(labels);
                journeyStartShowLabel.setText("Battaramulla");
                Journey journey = new Journey("Battaramulla", 177, passengers);
                CardReadViewController.startJourney(journey);
                passengersShowLabel.setText(passengerNoTextBox.getText());
                CardReadViewController.redirectHandler(redirectedInLabel, secondsLabel, ticketDetailsPanel);            
            }            
        }
    }//GEN-LAST:event_cardReadConfirmButtonActionPerformed

    private void cardReadDemoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cardReadDemoButtonActionPerformed
        Random r = new Random();
        int random_passengers = r.nextInt((10 - 1) + 1) + 1;
        passengerNoTextBox.setText(Integer.toString(random_passengers));
    }//GEN-LAST:event_cardReadDemoButtonActionPerformed

    private void cardReadCancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cardReadCancelButtonActionPerformed
        int confirm = JOptionPane.showConfirmDialog(null, "Are you sure you want to cancel?", "Cancel", 0, 3);
        //if yes
        if (confirm == 0) {
            MainController.actionPanelNavigation("WELCOME");
        }
    }//GEN-LAST:event_cardReadCancelButtonActionPerformed

    private void cardReadDemoButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cardReadDemoButtonMouseEntered
        cardReadDemoButton.setBackground(new Color(38, 37, 114));
    }//GEN-LAST:event_cardReadDemoButtonMouseEntered

    private void cardReadCancelButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cardReadCancelButtonMouseEntered
        cardReadCancelButton.setBackground(new Color(38, 37, 114));
    }//GEN-LAST:event_cardReadCancelButtonMouseEntered

    private void cardReadConfirmButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cardReadConfirmButtonMouseEntered
        cardReadConfirmButton.setBackground(new Color(38, 37, 114));
    }//GEN-LAST:event_cardReadConfirmButtonMouseEntered

    private void cardReadDemoButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cardReadDemoButtonMouseExited
        cardReadDemoButton.setBackground(new Color(42, 135, 235));
    }//GEN-LAST:event_cardReadDemoButtonMouseExited

    private void cardReadCancelButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cardReadCancelButtonMouseExited
        cardReadCancelButton.setBackground(new Color(42, 135, 235));
    }//GEN-LAST:event_cardReadCancelButtonMouseExited

    private void cardReadConfirmButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cardReadConfirmButtonMouseExited
        cardReadConfirmButton.setBackground(new Color(42, 135, 235));
    }//GEN-LAST:event_cardReadConfirmButtonMouseExited

    private void passengerNoTextBoxKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passengerNoTextBoxKeyTyped
        //allow only digits to be entered
        if (!Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }
        if (passengerNoTextBox.getText().length() >= 2) {
            evt.consume();
        }
    }//GEN-LAST:event_passengerNoTextBoxKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TokenIdLabel;
    private javax.swing.JLabel TokenIdShowLabel;
    private javax.swing.JButton cardReadCancelButton;
    private javax.swing.JButton cardReadConfirmButton;
    private javax.swing.JButton cardReadDemoButton;
    private javax.swing.JLabel cardTypeLabel;
    private javax.swing.JLabel cardTypeShowLabel;
    private javax.swing.JLabel journeyStartLabel;
    private javax.swing.JLabel journeyStartShowLabel;
    private javax.swing.JLabel passengerNoLabel;
    private javax.swing.JTextField passengerNoTextBox;
    private javax.swing.JLabel passengersLabel;
    private javax.swing.JLabel passengersShowLabel;
    public javax.swing.JLabel redirectedInLabel;
    public javax.swing.JLabel secondsLabel;
    private javax.swing.JLabel ticketDetailsLabel;
    public javax.swing.JPanel ticketDetailsPanel;
    private javax.swing.JLabel userIdLabel;
    private javax.swing.JLabel userIdShowLabel;
    // End of variables declaration//GEN-END:variables
}
