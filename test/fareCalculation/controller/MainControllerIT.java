/*
 * IT15018960
 * D.U. Liyanage  * 
 * CSSE-02  * 
 */
package fareCalculation.controller;

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
public class MainControllerIT {
    
    public MainControllerIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getPanel method, of class MainController.
     */
    @Test
    public void testGetPanel() {
        System.out.println("getPanel");
        JPanel panel = null;
        MainController.getPanel(panel);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDateTime method, of class MainController.
     */
    @Test
    public void testSetDateTime() {
        System.out.println("setDateTime");
        JLabel dayLabel = null;
        JLabel timeLabel = null;
        MainController.setDateTime(dayLabel, timeLabel);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of actionPanelNavigation method, of class MainController.
     */
    @Test
    public void testActionPanelNavigation() {
        System.out.println("actionPanelNavigation");
        String buttonName = "";
        MainController.actionPanelNavigation(buttonName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
