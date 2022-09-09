/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;
import java.sql.*;

/**
 *
 * @author Lenovo
 */
public class ConnectionProvider {
    
    public static String user= "";
    public static String pass= "";
    
    public static boolean testCredentials(String u, String p) {
        try {
            user = u;
            pass = p;
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/qems", user, pass);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    public static Connection getCon() {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/qems", user, pass);
            
            return con;
        }catch(Exception e) {
            return null;
        }
    }
    
}
