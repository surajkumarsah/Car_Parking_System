
//import com.mysql.jdbc.PreparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class Javaconnect {
    
    Connection conn = null;
    ResultSet rs;
    PreparedStatement pst;
    
    public static Connection ConnectDb(){
        try{
            Class.forName("org.sqlite.JDBC");
            Connection conn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\SURAJ KUMAR\\Documents\\NetBeansProjects\\Automatic Car Parking System\\acps.sqlite");
            //JOptionPane.showMessageDialog(null, conn);
            return conn;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }

    }
}
