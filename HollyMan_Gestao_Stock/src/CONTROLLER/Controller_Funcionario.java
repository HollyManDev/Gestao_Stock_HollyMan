/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CONTROLLER;

import DAO.DAO_Funcionario;
import MODEL.DTO.Funcionario;
import javax.swing.JOptionPane;

/**
 *
 * @author HOLLY MAN
 */
public class Controller_Funcionario {
      DAO_Funcionario Dao_Fun = new DAO_Funcionario();
       
    public void  Verificacao(String apelido, String nome, String bi, String genero, String data_nascimento, String email, String password, int contacto
    , String  data_Contratacao, String perfil, String endereco, String funcao, String status,  double salario){
            
        if((apelido.equals("")) || (nome.equals("")) || (bi.equals("")) || (genero.equals("")) || (data_nascimento.equals(""))|| (email.equals(""))
                || (password.equals("")) || (data_Contratacao.equals("")) || (perfil.equals("")) || (endereco.equals("")) || (funcao.equals("")) || (status.equals(""))
                || (salario == 0))
           
            JOptionPane.showMessageDialog(null, "Certifique-se de ter preenchido todos campos");
        
        else{
            //Criando uma instancia da classe Controller_Funcionario para ter acesso aos getters and setters
            Funcionario fun  = new Funcionario();
                        
        }
            
    }
    
}
