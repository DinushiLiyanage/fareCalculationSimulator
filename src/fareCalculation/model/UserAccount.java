/*
 * IT15018960
 * D.U. Liyanage  * 
 * CSSE-02  * 
 */
package fareCalculation.model;

/**
 *
 * @author D.U.Liyanage *
 */
public class UserAccount {

    private Integer userId;
    private final String userAvailability;

    public UserAccount(String username, String password, String userAvail) {
        this.userAvailability = userAvail;
    }

    public UserAccount(int userID, String userAvail) {
        this.userId = userID;
        this.userAvailability = userAvail;
    }

    //getters
    public Integer getUserId() {
        return userId;
    }

    public String getUserAvailability() {
        return userAvailability;
    }

}
