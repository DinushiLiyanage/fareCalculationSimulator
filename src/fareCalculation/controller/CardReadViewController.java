/*
 * IT15018960
 * D.U. Liyanage  * 
 * CSSE-02  * 
 */
package fareCalculation.controller;

import fareCalculation.model.Journey;
import java.awt.Color;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import static java.util.concurrent.TimeUnit.SECONDS;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author D.U.Liyanage *
 */
public class CardReadViewController {

    private static int userID, tokenID, packageID;
    private static final Logger CARD_READ_VIEW_LOG = Logger.getLogger(CardReadViewController.class.getName());
    private static PreparedStatement pStatement = null;
    private static ResultSet resultSet = null;
    private static String journeyDetailsQuery;
    private static String startLocation = "";
    private static int totalFare;
    private static int fare;
    private static int passengers;
    private static String end_location = "";
    private static final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
    public static int second = 10;

    public static void setJourneyInfo(int userId, int tokenId, int packageId, String start) {
        userID = userId;
        tokenID = tokenId;
        packageID = packageId;
        startLocation = start;
    }

    public static void showJourneyInfo(JLabel[] labels) {
        labels[0].setText(Integer.toString(userID));
        labels[1].setText(Integer.toString(tokenID));
        if (packageID == 1) {
            labels[2].setText("Traveller");
        }
        if (packageID == 2) {
            labels[2].setText("Explorer");
        }
        labels[3].setText(startLocation);
    }

    public static synchronized void redirectHandler(JLabel redirect_label, JLabel redirect_count_label, JPanel ticketPanel) {
        redirect_label.setVisible(true);
        redirect_count_label.setVisible(true);
        ticketPanel.setVisible(true);

        final Runnable beeper = new Runnable() {
            @Override
            public void run() {
                redirect_count_label.setText(Integer.toString(second));
                second--;
            }
        };
        final ScheduledFuture<?> beeperHandle = scheduler.scheduleAtFixedRate(beeper, 1, 1, SECONDS);
        scheduler.schedule(new Runnable() {
            @Override
            public void run() {
                MainController.actionPanelNavigation("WELCOME");
            }
        }, 10, SECONDS);
    }

    public static void startJourney(Journey journey) {

        Calendar now = Calendar.getInstance();
        int month = now.get(Calendar.MONTH);
        int date = now.get(Calendar.DATE);
        int year = now.get(Calendar.YEAR);
        String full_date = date + "/" + month + "/" + year;

        int seconds = now.get(Calendar.SECOND);
        int min = now.get(Calendar.MINUTE);
        int hr = now.get(Calendar.HOUR_OF_DAY);
        String time = String.format("%02d:%02d:%02d", hr, min, seconds);
        String journeyEndTime = "-";
        String journeyEndLocation = "-";
        String journeyPayStatus = "pending";
        float journeyFare = 0;

        //insert journey details to the database
        try {
            journeyDetailsQuery = "INSERT INTO `journey`(`tokenId`, `userId`, `journeyRoute`, `journeyStartTime`, `journeyStartLocation`, `journeyEndTime`, `journeyEndLocation`, `passengerNo`, `journeyFare`, `journeyDate`, `journeyPayStatus`) VALUES (" + tokenID + "," + userID + "," + journey.getJourneyRoute() + ",'" + time + "','" + journey.getJourneyStartLocation() + "','" + journeyEndTime + "','" + journeyEndLocation + "'," + journey.getPassengerNo() + "," + journeyFare + ",'" + full_date + "','" + journeyPayStatus + "')";
            pStatement = MainController.CONNECTION.prepareStatement(journeyDetailsQuery);
            pStatement.execute();

        } catch (SQLException sql_exception) {
            CARD_READ_VIEW_LOG.log(Level.SEVERE, sql_exception.getMessage());
        }
    }

    public static void calculateFare(Journey endJourney) {

        end_location = endJourney.getJourneyEndLocation();
        int userId = endJourney.getUserId();
        int packageId = 0;

        try {

            String getPackageQuery = "SELECT `packageId` FROM `token` WHERE `userId`=" + userId;
            pStatement = MainController.CONNECTION.prepareStatement(getPackageQuery);
            resultSet = pStatement.executeQuery();
            while (resultSet.next()) {
                packageId = resultSet.getInt("packageId");
            }
        } catch (SQLException ex) {
            Logger.getLogger(CardReadViewController.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            String getFareQuery = "SELECT `journeyFare` FROM `journeydetails` WHERE `startLocation`='" + startLocation + "' AND `endLocation`='" + end_location + "'";
            pStatement = MainController.CONNECTION.prepareStatement(getFareQuery);
            resultSet = pStatement.executeQuery();
            while (resultSet.next()) {
                fare = resultSet.getInt("journeyFare");
            }

            String getPassengersQuery = "SELECT `passengerNo` FROM `journey` WHERE `userId`= " + userId + " AND `journeyPayStatus`= 'pending'";
            pStatement = MainController.CONNECTION.prepareStatement(getPassengersQuery);
            resultSet = pStatement.executeQuery();
            while (resultSet.next()) {
                passengers = resultSet.getInt("passengerNo");
            }
            totalFare = passengers * fare;

            updateJourney(totalFare, userId);
            MainController.actionPanelNavigation("FEEDBACK");

        } catch (SQLException ex) {
            Logger.getLogger(CardReadViewController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void updateJourney(int totalFare, int userId) {

        Calendar now = Calendar.getInstance();
        int seconds = now.get(Calendar.SECOND);
        int min = now.get(Calendar.MINUTE);
        int hr = now.get(Calendar.HOUR_OF_DAY);
        String time = String.format("%02d:%02d:%02d", hr, min, seconds);

        int balance = 0;

        try {
            String updateJourneyQuery = "UPDATE `journey` SET `journeyEndTime`= '" + time + "' , `journeyEndLocation` = '" + end_location + "', `journeyFare` = " + totalFare + ",`journeyPayStatus` = 'paid' WHERE `userId` = " + userId + " AND `journeyPayStatus` = 'pending'";
            pStatement = MainController.CONNECTION.prepareStatement(updateJourneyQuery);
            pStatement.execute();

            String getBalanceQuery = "SELECT `balance` FROM `token` WHERE `userId` = " + userId;
            pStatement = MainController.CONNECTION.prepareStatement(getBalanceQuery);
            resultSet = pStatement.executeQuery();
            while (resultSet.next()) {
                balance = resultSet.getInt("balance");
            }

            balance = balance - totalFare;
            String updateTokenQuery = "UPDATE `token` SET `balance` = " + balance + " WHERE `userId` = " + userId + "";
            pStatement = MainController.CONNECTION.prepareStatement(updateTokenQuery);
            pStatement.execute();

        } catch (SQLException ex) {
            Logger.getLogger(CardReadViewController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void feedbackControl(JLabel[] labels) {

        if (checkBalance(userID) == false) {
            labels[0].setForeground(Color.red);
            labels[0].setText("Warning");
            labels[1].setForeground(Color.red);
            labels[1].setText("Not Enough Credit. Your Token Is Now Invalid");
        } else {
            labels[0].setForeground(Color.green);
            labels[0].setText("Success");
            labels[1].setText("");
        }

        labels[2].setText(Integer.toString(tokenID));
        if (packageID == 1) {
            labels[3].setText("Traveller");
        } else {
            labels[3].setText("Explorer");
        }
        labels[4].setText(fare + "*" + passengers + "=" + totalFare + ".00");
        labels[5].setText(startLocation);
        labels[6].setText(end_location);
        MainController.swapped_flag = false;
        FeedBackViewController.redirectToHome();

    }

    public static boolean checkBalance(int id) {

        int balance = 0;
        try {
            int user = id;
            String getBalanceQuery = "SELECT `balance` FROM `token` WHERE `userId` = " + userID;
            pStatement = MainController.CONNECTION.prepareStatement(getBalanceQuery);
            resultSet = pStatement.executeQuery();
            while (resultSet.next()) {
                balance = resultSet.getInt("balance");
            }

        } catch (SQLException ex) {
            Logger.getLogger(CardReadViewController.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (balance <= 0) {
            return false;
        }
        return true;
    }

}
