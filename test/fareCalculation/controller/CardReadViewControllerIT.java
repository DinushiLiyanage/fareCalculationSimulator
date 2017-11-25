/*
 * IT15018960
 * D.U. Liyanage  * 
 * CSSE-02  * 
 */
package Tests;

import fareCalculation.controller.CardReadViewController;
import fareCalculation.model.Journey;
import javax.swing.JLabel;
import javax.swing.JPanel;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author USER
 */
public class CardReadViewControllerIT {
    
    public CardReadViewControllerIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of setJourneyInfo method, of class CardReadViewController.
     */
    @Test
    public void testSetJourneyInfo() {
        System.out.println("setJourneyInfo");
        int userId = 0;
        int tokenId = 0;
        int packageId = 0;
        String start = "";
        CardReadViewController.setJourneyInfo(userId, tokenId, packageId, start);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of showJourneyInfo method, of class CardReadViewController.
     */
    @Test
    public void testShowJourneyInfo() {
        System.out.println("showJourneyInfo");
        JLabel[] labels = null;
        CardReadViewController.showJourneyInfo(labels);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of redirectHandler method, of class CardReadViewController.
     */
    @Test
    public void testRedirectHandler() {
        System.out.println("redirectHandler");
        JLabel redirect_label = null;
        JLabel redirect_count_label = null;
        JPanel ticketPanel = null;
        CardReadViewController.redirectHandler(redirect_label, redirect_count_label, ticketPanel);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of startJourney method, of class CardReadViewController.
     */
    @Test
    public void testStartJourney() {
        System.out.println("startJourney");
        Journey journey = null;
        CardReadViewController.startJourney(journey);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calculateFare method, of class CardReadViewController.
     */
    @Test
    public void testCalculateFare() {
        System.out.println("calculateFare");
        Journey endJourney = null;
        CardReadViewController.calculateFare(endJourney);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateJourney method, of class CardReadViewController.
     */
    @Test
    public void testUpdateJourney() {
        System.out.println("updateJourney");
        int totalFare = 0;
        int userId = 0;
        CardReadViewController.updateJourney(totalFare, userId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of feedbackControl method, of class CardReadViewController.
     */
    @Test
    public void testFeedbackControl() {
        System.out.println("feedbackControl");
        JLabel[] labels = null;
        CardReadViewController.feedbackControl(labels);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkBalance method, of class CardReadViewController.
     */
    @Test
    public void testCheckBalance() {
        System.out.println("checkBalance");
        int id = 0;
        boolean expResult = false;
        boolean result = CardReadViewController.checkBalance(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
