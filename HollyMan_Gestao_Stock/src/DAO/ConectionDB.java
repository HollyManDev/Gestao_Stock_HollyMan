/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author HOLLY MAN
 */
public class ConectionDB {
  
    public Connection connecting (){
       
        Connection conn = null;
        try {
            String url = "jdbc:mysql://localhost:3306/super_mercado?user=root&password=";
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, e.getMessage());

        }
        return conn;
    }
}
