/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author HOLLY MAN
 */
public class ConectionDB {
    Connection conn;
    public Connection ConectingDB(){
        String url = "jdbc:mysql://localhost:3306/gestao_stock?user=root&password=";
        try {
            conn = DriverManager.getConnection(url);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ConnectingDB" + e.getMessage());
        }
        return conn;
    }
    
}
