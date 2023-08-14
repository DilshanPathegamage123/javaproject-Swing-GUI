/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproject;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Acer
 */
public class DBconnection {
    
    public static Connection connect(){
       Connection conn= null;
       
        try {
            Class.forName("com.mysql.jdbc.Driver");
           try {
               conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/javaprojecttest","root", "");
           } catch (SQLException ex) {
               Logger.getLogger(DBconnection.class.getName()).log(Level.SEVERE, null, ex);
           }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DBconnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
       return conn; 
    }

    
    
}
