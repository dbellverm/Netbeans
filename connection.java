/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package base.de.datos;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author dani_
 */
public class connection {
    static private Connection con_db;
    static private Statement ins_db;
    static private ResultSet view_db;
    
    
    
    void setConex(){
    
        try {
            con_db=DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/juegos"
                    ,"root","");
        } catch (SQLException ex) {
            Logger.getLogger(connection.class.getName()).log(Level.SEVERE, null, ex);
        }
    
        try {
            ins_db=con_db.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(connection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
    
    
    
    
    
}
