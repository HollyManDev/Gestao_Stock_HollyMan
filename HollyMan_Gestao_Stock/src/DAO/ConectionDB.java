/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;

/**
 *
 * @author HOLLY MAN
 */
public class ConectionDB {
  EntityManager em;
    public EntityManager connecting (){
        try {
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("seuPU");
        em = emf.createEntityManager();
        
     
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
            return em;
    }
   
}
