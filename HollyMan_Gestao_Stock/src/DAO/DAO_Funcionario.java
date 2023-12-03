/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import MODEL.DTO.Funcionario;
import java.sql.Connection;
import java.util.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.ListModel;

/**
 *
 * @author HOLLY MAN
 */
public class DAO_Funcionario {

    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<Funcionario> lista = new ArrayList<>();

    public void save_Fun(Funcionario fun) {
        String sql = "insert into funcionario (codigo_fun, apelido, nome, genero, data_nascimento, numero_bi, contacto, email, password, endereco, foto, funcao, nivel_acesso"
                + ", salario, data_contratacao, estado) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,?)";

        conn = new ConectionDB().connecting();
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, fun.getCodigo_Fun());
            pstm.setString(2, fun.getApelido());
            pstm.setString(3, fun.getNome());
            pstm.setString(4, fun.getGenero());
            pstm.setDate(5, fun.getData_nascimento());
            pstm.setString(6, fun.getNumero_BI_Nuit());
            pstm.setInt(7, fun.getContacto());
            pstm.setString(8, fun.getEmail());
            pstm.setString(9, fun.getPassword());
            pstm.setString(10, fun.getEndereco());
            pstm.setBytes(11, fun.getFoto());
            pstm.setString(12, fun.getFuncao());
            pstm.setString(13, fun.getNivel_acesso());
            pstm.setDouble(14, fun.getSalario());
            pstm.setDate(15, fun.getData_contratacao());
            pstm.setString(16, fun.getEstado());

            pstm.execute();
            pstm.close();
            JOptionPane.showMessageDialog(null, "Funcionario Cadastrado");
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Cadastro" + e);
        }

    }

    public ArrayList<Funcionario> FindAll_Login() {
        String sql = "select id, email,password, estado, nivel_acesso, funcao from funcionario";
        conn = new ConectionDB().connecting();

        try {

            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();

            while (rs.next()) {
                Funcionario fun = new Funcionario();
                fun.setId(rs.getInt(1));
                fun.setEmail(rs.getString(2));
                fun.setPassword(rs.getString(3));
                fun.setEstado(rs.getString(4));
                fun.setNivel_acesso(rs.getString(5));
                fun.setFuncao(rs.getString(6));

                lista.add(fun);

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Buscando registros" + ex);

        }
        System.out.println(lista.size());
        return lista;
    }

    public ArrayList<Funcionario> FindAll() {
        String sql = "select * from funcionario";
        conn = new ConectionDB().connecting();

        try {

            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();

            while (rs.next()) {
                Funcionario fun = new Funcionario();
                fun.setId(rs.getInt(1));
                fun.setCodigo_Fun(rs.getString(2));
                fun.setApelido(rs.getString(3));
                fun.setNome(rs.getString(4));
                fun.setGenero(rs.getString(5));
                fun.setData_nascimento(rs.getDate(6));
                fun.setNumero_BI_Nuit(rs.getString(7));
                fun.setContacto(rs.getInt(8));
                fun.setEmail(rs.getString(9));
                fun.setPassword(rs.getString(10));
                fun.setEndereco(rs.getString(11));
                fun.setFoto(rs.getBytes(12));
                fun.setFuncao(rs.getString(13));
                fun.setNivel_acesso(rs.getString(14));
                fun.setSalario(rs.getDouble(15));
                fun.setData_contratacao(rs.getDate(16));
                fun.setEstado(rs.getString(17));

                lista.add(fun);

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Buscando todos registros" + ex);

        }
        return lista;
    }

    public ArrayList<Funcionario> Find_Fun(Funcionario fun) {
        String sql = "select * from funcionario where id = " + fun.getId();
        conn = new ConectionDB().connecting();

        try {

            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();

            while (rs.next()) {

                fun.setId(rs.getLong(1));
                fun.setCodigo_Fun(rs.getString(2));
                fun.setApelido(rs.getString(3));
                fun.setNome(rs.getString(4));
                fun.setGenero(rs.getString(5));
                fun.setData_nascimento(rs.getDate(6));
                fun.setNumero_BI_Nuit(rs.getString(7));
                fun.setContacto(rs.getInt(8));
                fun.setEmail(rs.getString(9));
                fun.setPassword(rs.getString(10));
                fun.setEndereco(rs.getString(11));
                fun.setFoto(rs.getBytes(12));
                fun.setFuncao(rs.getString(13));
                fun.setNivel_acesso(rs.getString(14));
                fun.setSalario(rs.getDouble(15));
                fun.setData_contratacao(rs.getDate(16));
                fun.setEstado(rs.getString(17));

                lista.add(fun);

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Buscando todos registros" + ex);

        }
        System.out.println("A lista tem o tamanho: " + lista.size());
        return lista;
    }

    public void Update_Manager(Funcionario fun) {

        String sql = "update funcionario set  apelido = ?, nome = ?, genero = ?,data_nascimento = ?, numero_bi = ?,contacto = ?,email = ?,password = ?,endereco = ?,foto = ?,funcao = ?,  nivel_acesso = ?,salario = ?,data_contratacao = ?,estado = ? where id = " + fun.getId();
        conn = new ConectionDB().connecting();
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, fun.getApelido());
            pstm.setString(2, fun.getNome());
            pstm.setString(3, fun.getGenero());
            pstm.setDate(4, fun.getData_nascimento());
            pstm.setString(5, fun.getNumero_BI_Nuit());
            pstm.setInt(6, fun.getContacto());
            pstm.setString(7, fun.getEmail());
            pstm.setString(8, fun.getPassword());
            pstm.setString(9, fun.getEndereco());
            pstm.setBytes(10, fun.getFoto());
            pstm.setString(11, fun.getFuncao());
            pstm.setString(12, fun.getNivel_acesso());
            pstm.setDouble(13, fun.getSalario());
            pstm.setDate(14, fun.getData_contratacao());
            pstm.setString(15, fun.getEstado());

            pstm.executeUpdate();
            pstm.close();

            JOptionPane.showMessageDialog(null, "Actualizado com sucesso!!!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao actualizar" + e.getMessage());
        }
    }

   public void update_profile(Funcionario fun) {
    String sql = "UPDATE funcionario SET contacto = ?, email = ?, password = ?, endereco = ?, foto = ? WHERE id = ?";
    conn = new ConectionDB().connecting();

    try {
        pstm = conn.prepareStatement(sql);
        pstm.setInt(1, fun.getContacto());
        pstm.setString(2, fun.getEmail());
        pstm.setString(3, fun.getPassword());
        pstm.setString(4, fun.getEndereco());
        pstm.setBytes(5, fun.getFoto());
        pstm.setLong(6, fun.getId());

        pstm.executeUpdate();
        pstm.close();

        JOptionPane.showMessageDialog(null, "Dados Atualizados!!!");
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Erro ao atualizar: " + e.getMessage());
    }
}


    public void Estado_Fun(Funcionario fun) {

        String sql = "update funcionario set  estado = ? where id = ? ";
        conn = new ConectionDB().connecting();
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, fun.getEstado());
            pstm.setLong(2, fun.getId());
            pstm.executeUpdate();
            pstm.close();

            if (fun.getEstado().equalsIgnoreCase("Inactivo")) {
                JOptionPane.showMessageDialog(null, "Funcionario Desactivado!!!");
            } else {
                JOptionPane.showMessageDialog(null, "Funcionario Activo!!!");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao Eliminar" + e.getMessage());
        }

    }
      DefaultListModel model;
      
      public DefaultListModel<Funcionario> GoogleSearch(JTextField txtpesquisa) {
        String sql = "select * from funcionario where nome or apelido like '" +txtpesquisa.getText() + "%'" + "order by nome";
        conn = new ConectionDB().connecting();

        try {

            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();

            while (rs.next()) {
                Funcionario fun = new Funcionario();
                fun.setId(rs.getInt(1));
                fun.setCodigo_Fun(rs.getString(2));
                fun.setApelido(rs.getString(3));
                fun.setNome(rs.getString(4));
                fun.setGenero(rs.getString(5));
                fun.setData_nascimento(rs.getDate(6));
                fun.setNumero_BI_Nuit(rs.getString(7));
                fun.setContacto(rs.getInt(8));
                fun.setEmail(rs.getString(9));
                fun.setPassword(rs.getString(10));
                fun.setEndereco(rs.getString(11));
                fun.setFoto(rs.getBytes(12));
                fun.setFuncao(rs.getString(13));
                fun.setNivel_acesso(rs.getString(14));
                fun.setSalario(rs.getDouble(15));
                fun.setData_contratacao(rs.getDate(16));
                fun.setEstado(rs.getString(17));

                model.addElement(fun);

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Pesquisa Google" + ex);

        }
        return model;
    }
      
    }
