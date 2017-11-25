/*
 * IT15018960
 * D.U. Liyanage  * 
 * CSSE-02  * 
 */
package fareCalculation.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 * @author D.U.Liyanage *
 */
public class DBConnect {

    public static final Connection CONNECTION = null;
    public static final Logger DB_LOG = Logger.getLogger(DBConnect.class.getName());

    public static Connection ConnectDB() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/csse_assignment", "root", "");
            return conn;
        } catch (SQLException sql_exception) {
            JOptionPane.showMessageDialog(null, "Database Error!", "Error", JOptionPane.ERROR_MESSAGE);
            DB_LOG.log(Level.SEVERE, sql_exception.getMessage());
            return null;
        } catch (ClassNotFoundException class_exception) {
            JOptionPane.showMessageDialog(null, "Driver Not Found!", "Error", JOptionPane.ERROR_MESSAGE);
            DB_LOG.log(Level.SEVERE, class_exception.getMessage());
            return null;
        }
    }

    public static Connection closeConnetion(Connection conn) {
        try {
            if (null != conn) {
                conn.close();
                conn = null;
            }
        } catch (SQLException sql_exception) {
            JOptionPane.showMessageDialog(null, "Database Connection Error!", "Error", JOptionPane.ERROR_MESSAGE);
            DB_LOG.log(Level.SEVERE, sql_exception.getMessage());
        }
        return conn;
    }
}
