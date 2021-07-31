/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evm;
import java.sql.*;
import javax.swing.*;

/**
 *
 * @author RhIeyAaD
 */
public class SqlConnector {

    static PreparedStatement prepareStatement(String query) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    Connection conn=null;
    public static Connection dbConnector()
    {
        try{
            Class.forName("org.sqlite.JDBC");
            Connection conn=DriverManager.getConnection("jdbc:sqlite:C:\\Users\\RhIeyAaD\\Documents\\NetBeansProjects\\EVM\\Voter_Info.sqlite");
          //  JOptionPane.showMessageDialog(null, "Connection Successful!");
            return conn;
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
            
        }
    }
}
