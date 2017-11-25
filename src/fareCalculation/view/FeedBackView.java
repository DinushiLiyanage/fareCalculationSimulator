/*
 * IT15018960
 * D.U. Liyanage  * 
 * CSSE-02  * 
 */
package fareCalculation.view;

/**
 *
 * @author D.U.Liyanage *
 */
public class FeedBackView extends javax.swing.JPanel {

    public FeedBackView() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        paymentTicketDetailsPanel = new javax.swing.JPanel();
        tokenIdShowLabel = new javax.swing.JLabel();
        packageTypeShowLabel = new javax.swing.JLabel();
        TotalAmountShowLabel = new javax.swing.JLabel();
        journeyStartShowLabel = new javax.swing.JLabel();
        journeyStartLabel = new javax.swing.JLabel();
        passengersLabel = new javax.swing.JLabel();
        ticketTypeLabel = new javax.swing.JLabel();
        ticketIdLabel = new javax.swing.JLabel();
        ticketDetailsLabel = new javax.swing.JLabel();
        journeyEndLabel = new javax.swing.JLabel();
        journeyEndShowLabel = new javax.swing.JLabel();
        messageHeaderLabel = new javax.swing.JLabel();
        messageLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(500, 300));
        setMinimumSize(new java.awt.Dimension(500, 300));

        paymentTicketDetailsPanel.setBackground(new java.awt.Color(255, 255, 255));

        tokenIdShowLabel.setBackground(new java.awt.Color(255, 255, 255));
        tokenIdShowLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tokenIdShowLabel.setForeground(new java.awt.Color(51, 153, 255));
        tokenIdShowLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        tokenIdShowLabel.setText("TID");

        packageTypeShowLabel.setBackground(new java.awt.Color(255, 255, 255));
        packageTypeShowLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        packageTypeShowLabel.setForeground(new java.awt.Color(51, 153, 255));
        packageTypeShowLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        packageTypeShowLabel.setText("PT");

        TotalAmountShowLabel.setBackground(new java.awt.Color(255, 255, 255));
        TotalAmountShowLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        TotalAmountShowLabel.setForeground(new java.awt.Color(51, 153, 255));
        TotalAmountShowLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        TotalAmountShowLabel.setText("TA");

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

        passengersLabel.setBackground(new java.awt.Color(255, 255, 255));
        passengersLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        passengersLabel.setForeground(new java.awt.Color(51, 153, 255));
        passengersLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        passengersLabel.setText("Total Amount");

        ticketTypeLabel.setBackground(new java.awt.Color(255, 255, 255));
        ticketTypeLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ticketTypeLabel.setForeground(new java.awt.Color(51, 153, 255));
        ticketTypeLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ticketTypeLabel.setText("Package Type");

        ticketIdLabel.setBackground(new java.awt.Color(255, 255, 255));
        ticketIdLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ticketIdLabel.setForeground(new java.awt.Color(51, 153, 255));
        ticketIdLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ticketIdLabel.setText("Token ID");

        ticketDetailsLabel.setBackground(new java.awt.Color(255, 255, 255));
        ticketDetailsLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ticketDetailsLabel.setForeground(new java.awt.Color(51, 153, 255));
        ticketDetailsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ticketDetailsLabel.setText("Journey Details");

        journeyEndLabel.setBackground(new java.awt.Color(255, 255, 255));
        journeyEndLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        journeyEndLabel.setForeground(new java.awt.Color(51, 153, 255));
        journeyEndLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        journeyEndLabel.setText("Journey End");

        journeyEndShowLabel.setBackground(new java.awt.Color(255, 255, 255));
        journeyEndShowLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        journeyEndShowLabel.setForeground(new java.awt.Color(51, 153, 255));
        journeyEndShowLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        journeyEndShowLabel.setText("JE");

        javax.swing.GroupLayout paymentTicketDetailsPanelLayout = new javax.swing.GroupLayout(paymentTicketDetailsPanel);
        paymentTicketDetailsPanel.setLayout(paymentTicketDetailsPanelLayout);
        paymentTicketDetailsPanelLayout.setHorizontalGroup(
            paymentTicketDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paymentTicketDetailsPanelLayout.createSequentialGroup()
                .addGroup(paymentTicketDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paymentTicketDetailsPanelLayout.createSequentialGroup()
                        .addGroup(paymentTicketDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ticketTypeLabel)
                            .addComponent(passengersLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 241, Short.MAX_VALUE)
                        .addGroup(paymentTicketDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(packageTypeShowLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TotalAmountShowLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(paymentTicketDetailsPanelLayout.createSequentialGroup()
                        .addComponent(ticketDetailsLabel)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(paymentTicketDetailsPanelLayout.createSequentialGroup()
                        .addComponent(ticketIdLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tokenIdShowLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(paymentTicketDetailsPanelLayout.createSequentialGroup()
                        .addComponent(journeyStartLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 241, Short.MAX_VALUE)
                        .addComponent(journeyStartShowLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(paymentTicketDetailsPanelLayout.createSequentialGroup()
                        .addComponent(journeyEndLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(journeyEndShowLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        paymentTicketDetailsPanelLayout.setVerticalGroup(
            paymentTicketDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paymentTicketDetailsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ticketDetailsLabel)
                .addGap(18, 18, 18)
                .addGroup(paymentTicketDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ticketIdLabel)
                    .addComponent(tokenIdShowLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(paymentTicketDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(packageTypeShowLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ticketTypeLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(paymentTicketDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TotalAmountShowLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(passengersLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(paymentTicketDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(journeyStartShowLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(journeyStartLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(paymentTicketDetailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(journeyEndLabel)
                    .addComponent(journeyEndShowLabel))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        messageHeaderLabel.setBackground(new java.awt.Color(255, 255, 255));
        messageHeaderLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        messageHeaderLabel.setForeground(new java.awt.Color(51, 153, 255));
        messageHeaderLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        messageHeaderLabel.setText("Success/Unsuccessful Message Header");

        messageLabel.setBackground(new java.awt.Color(255, 255, 255));
        messageLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        messageLabel.setForeground(new java.awt.Color(51, 153, 255));
        messageLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        messageLabel.setText("Success/Unsuccessful Message");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(paymentTicketDetailsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(messageHeaderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 15, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(messageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(messageHeaderLabel)
                .addGap(15, 15, 15)
                .addComponent(messageLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(paymentTicketDetailsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel TotalAmountShowLabel;
    private javax.swing.JLabel journeyEndLabel;
    public javax.swing.JLabel journeyEndShowLabel;
    private javax.swing.JLabel journeyStartLabel;
    public javax.swing.JLabel journeyStartShowLabel;
    public javax.swing.JLabel messageHeaderLabel;
    public javax.swing.JLabel messageLabel;
    public javax.swing.JLabel packageTypeShowLabel;
    private javax.swing.JLabel passengersLabel;
    private javax.swing.JPanel paymentTicketDetailsPanel;
    private javax.swing.JLabel ticketDetailsLabel;
    private javax.swing.JLabel ticketIdLabel;
    private javax.swing.JLabel ticketTypeLabel;
    public javax.swing.JLabel tokenIdShowLabel;
    // End of variables declaration//GEN-END:variables
}
