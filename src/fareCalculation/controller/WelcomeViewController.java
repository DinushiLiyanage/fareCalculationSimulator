/*
 * IT15018960
 * D.U. Liyanage  * 
 * CSSE-02  * 
 */
package fareCalculation.controller;

import fareCalculation.model.UserAccount;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author D.U.Liyanage *
 */
public class WelcomeViewController {

    private static final Logger WELCOME_VIEW_CONTROLLER_LOG = Logger.getLogger(WelcomeViewController.class.getName());
    private static PreparedStatement pStatement = null;
    private static ResultSet resultSet = null;
    private static String checkUserQuery, checkTokenQuery, getPackageQuery;
    private static int tokenID = 0;

    public static boolean checkValidity(UserAccount user) {
        String user_status = "";
        int packageId;
        boolean token_validity = false;

        try {
            checkUserQuery = "SELECT `Status` FROM `permanent` WHERE `User Id`=" + user.getUserId();
            pStatement = MainController.CONNECTION.prepareStatement(checkUserQuery);
            resultSet = pStatement.executeQuery();
            while (resultSet.next()) {
                user_status = resultSet.getString("Status");
            }
            if (user_status.equals("available")) {
                token_validity = verifyToken(user.getUserId());
                if (token_validity) {
                    //identify package
                    getPackageQuery = "SELECT `packageId` FROM `token` WHERE `userId`=" + user.getUserId();
                    pStatement = MainController.CONNECTION.prepareStatement(getPackageQuery);
                    resultSet = pStatement.executeQuery();
                    while (resultSet.next()) {
                        packageId = resultSet.getInt("packageId");
                        CardReadViewController.setJourneyInfo(user.getUserId(), tokenID, packageId, "Battaramulla");
                    }
                }
            }
        } catch (SQLException sql_ex) {
            WELCOME_VIEW_CONTROLLER_LOG.log(Level.SEVERE, sql_ex.getMessage());
        }

        //if user is not available
        return token_validity;
    }

    //checking token validity
    public static boolean verifyToken(int userID) {
        try {
            checkTokenQuery = "SELECT `tokenId` FROM `token` WHERE `userId` = '" + userID + "' AND `tokenStatus` = 'available'";
            pStatement = MainController.CONNECTION.prepareStatement(checkTokenQuery);
            resultSet = pStatement.executeQuery();

            while (resultSet.next()) {
                tokenID = resultSet.getInt("tokenId");
            }
            if (tokenID > 0) //valid token
            {
                return true;
            }
        } catch (SQLException sql_exception) {
            WELCOME_VIEW_CONTROLLER_LOG.log(Level.SEVERE, sql_exception.getMessage());
        }

        //if token is invalid
        return false;
    }

}
