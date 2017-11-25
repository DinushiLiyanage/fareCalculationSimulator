/*
 * IT15018960
 * D.U. Liyanage  * 
 * CSSE-02  * 
 */
package fareCalculation.model;

import java.util.Date;

/**
 *
 * @author D.U.Liyanage *
 */
public class Journey {

    private int journeyId;
    private int userId;
    private int journeyRoute;
    private String journeyStartTime;
    private String journeyStartLocation;
    private String journeyEndTime;
    private String journeyEndLocation;
    private int passengerNo;
    private float journeyFare;
    private Date journeyDate;
    private String journeyStatus;

    public Journey(String journeyStartLocation, int routeNo, int passengers) {
        this.journeyStartLocation = journeyStartLocation;
        this.journeyRoute = routeNo;
        this.passengerNo = passengers;
    }

    public Journey(int userID, String journeyEndLocation) {
        this.userId = userID;
        this.journeyEndLocation = journeyEndLocation;
    }

    public String getJourneyStatus() {
        return journeyStatus;
    }

    public int getJourneyRoute() {
        return journeyRoute;
    }

    public float getJourneyFare() {
        return journeyFare;
    }

    public int getJourneyId() {
        return journeyId;
    }

    public int getUserId() {
        return userId;
    }

    public void setJourneyFare(float journeyFare) {
        this.journeyFare = journeyFare;
    }

    public int getPassengerNo() {
        return passengerNo;
    }

    public void setPassengerNo(int passengerNo) {
        this.passengerNo = passengerNo;
    }

    public Date getJourneyDate() {
        return journeyDate;
    }

    public void setJourneyDate(Date journeyDate) {
        this.journeyDate = journeyDate;
    }

    public String getJourneyStartTime() {
        return journeyStartTime;
    }

    public void setJourneyStartTime(String journeyStartTime) {
        this.journeyStartTime = journeyStartTime;
    }

    public String getJourneyEndTime() {
        return journeyEndTime;
    }

    public void setJourneyEndTime(String journeyEndTime) {
        this.journeyEndTime = journeyEndTime;
    }

    public String getJourneyStartLocation() {
        return journeyStartLocation;
    }

    public void setJourneyStartLocation(String journeyStartLocation) {
        this.journeyStartLocation = journeyStartLocation;
    }

    public String getJourneyEndLocation() {
        return journeyEndLocation;
    }

    public void setJourneyEndLocation(String journeyEndLocation) {
        this.journeyEndLocation = journeyEndLocation;
    }

}
