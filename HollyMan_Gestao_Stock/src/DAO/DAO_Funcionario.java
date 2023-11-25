/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;


import MODEL.DTO.Funcionario;
import java.util.ArrayList;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;

/**
 *
 * @author HOLLY MAN
 */
public class DAO_Funcionario  {

  EntityManagerFactory emf = Persistence.createEntityManagerFactory("seuPU");
EntityManager em = emf.createEntityManager();

    ArrayList<Funcionario> lista = null;

    public void save_Fun(Object fun) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("seuPU");

        em = new ConectionDB().connecting();

        try {

            em.getTransaction().begin();
            em.persist(fun);
            em.getTransaction().commit();

        } catch (Exception e) {
            em.getTransaction().rollback();
        } finally {
            em.close();
            emf.close();
            JOptionPane.showMessageDialog(null, "Funcionario Cadastrado!!!");
        }

    }


    public ArrayList<Funcionario> FindAll() {

        em = new ConectionDB().connecting();

        lista = null;

        try {
        lista = (ArrayList<Funcionario>) em.createQuery("FROM Funcionario", Funcionario.class).getResultList();

            em.close();

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Erro ao Buscar Funcionarios : " + e.getMessage());
        }

        return lista;
    }

    public ArrayList<Funcionario> SearchFun(Funcionario fun) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("seuPU");
        em = new ConectionDB().connecting();
        try {
            fun = em.find(Funcionario.class, fun.getId());

            lista.add( fun);
            em.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao Buscar Funcionarios : " + e.getMessage());
        }

        return lista;
    }

  
    public void Update(Object fun) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("seuPU");

        em = new ConectionDB().connecting();

        try {

            em.getTransaction().begin();
            em.merge(fun);
            em.getTransaction().commit();

        } catch (Exception e) {
            em.getTransaction().rollback();
        } finally {
            em.close();
            emf.close();
            JOptionPane.showMessageDialog(null, "Funcionario Actualizado!!!");
        }
    }


    public ArrayList Search(Object fun) {

        return null;

    }
}
