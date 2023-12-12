
package db;

import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author rahulchauhan
 */
public class DbConnect {
    static public Connection c;
    static public Statement st;
    public DbConnect(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver"); //Optional
            c=DriverManager.getConnection("jdbc:mysql://localhost:3306/electro","root","Incapp@123");
            st=c.createStatement();
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }
}
