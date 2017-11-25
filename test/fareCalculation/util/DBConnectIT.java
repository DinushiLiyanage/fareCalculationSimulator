/*
 * IT15018960
 * D.U. Liyanage  * 
 * CSSE-02  * 
 */
package fareCalculation.util;

import java.sql.Connection;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author D.U.Liyanage
 */
public class DBConnectIT {
    
    private static Connection connection;
    
    public DBConnectIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        connection = DBConnect.ConnectDB();
    }
    
    @AfterClass
    public static void tearDownClass() {
        DBConnect.closeConnetion(connection);
    }

    /**
     * Test of ConnectDB method, of class DBConnect.
     * null will be returned if connection attempt fails
     */
    @Test
    public void testConnectDB() {
        System.out.println("Test ConnectDB");
        assertNotNull(connection);
    }

    /**
     * Test of closeConnetion method, of class DBConnect.
     * closeConnetion method will return null upon a successful connection close
     */
    @Test
    public void testCloseConnetion() {
        System.out.println("Test closeConnetion");
        Connection conn = DBConnect.closeConnetion(connection);
        assertEquals(null, conn);
    }    
}
