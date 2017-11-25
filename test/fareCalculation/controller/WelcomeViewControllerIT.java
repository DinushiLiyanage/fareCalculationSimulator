/*
 * IT15018960
 * D.U. Liyanage  * 
 * CSSE-02  * 
 */
package fareCalculation.controller;

import fareCalculation.model.UserAccount;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author USER
 */
public class WelcomeViewControllerIT {
    
    public WelcomeViewControllerIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of checkValidity method, of class WelcomeViewController.
     */
    @Test
    public void testCheckValidity() {
        System.out.println("checkValidity");
        UserAccount user = null;
        boolean expResult = false;
        boolean result = WelcomeViewController.checkValidity(user);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of verifyToken method, of class WelcomeViewController.
     */
    @Test
    public void testVerifyToken() {
        System.out.println("verifyToken");
        int userID = 0;
        boolean expResult = false;
        boolean result = WelcomeViewController.verifyToken(userID);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
