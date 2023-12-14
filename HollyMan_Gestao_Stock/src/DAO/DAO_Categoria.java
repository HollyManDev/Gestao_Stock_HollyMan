package DAO;

import CONTROLLER.Controller_Categoria;

import MODEL.DTO.Categorias;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author HOLLY MAN
 */
public class DAO_Categoria {

    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<Categorias> lista = new ArrayList<>();

    public void save_Categoria(Categorias c) {
        String sql = "insert into categorias (codigoCategoria, nome_categoria, data_cadastro, imagem, status) values (?, ?, ?, ?, ?)";

        conn = new ConectionDB().connecting();
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, c.getCodigoCategoria());
            pstm.setString(2, c.getNome_categoria());
            pstm.setDate(3, c.getData_cadastro());
            pstm.setBytes(4, c.getImagem());
            pstm.setString(5, c.getStatus());
            pstm.execute();
            pstm.close();
            JOptionPane.showMessageDialog(null, "Categoria Adicionada!!!");
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Cadastro categoria" + e);
        }

    }

    public ArrayList<Categorias> FindAll_Categoria() {
        String sql = "select * from categorias";
        conn = new ConectionDB().connecting();

        try {

            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();

            while (rs.next()) {
                Categorias c = new Categorias();
                c.setId(rs.getInt(1));
                c.setCodigoCategoria(rs.getString(2));
                c.setNome_categoria(rs.getString(3));
                c.setData_cadastro(rs.getDate(4));
                c.setImagem(rs.getBytes(5));
                c.setStatus(rs.getString(6));

                lista.add(c);

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Buscando todos registros de Categorias" + ex);

        }

        return lista;
    }

    public void Update_Manager_Categoria(Categorias c) {

        String sql = "update categorias set  nome_categoria = ?, data_cadastro = ?,imagem = ?  where codigoCategoria = ?";
        conn = new ConectionDB().connecting();
        try {

            pstm = conn.prepareStatement(sql);
            pstm.setString(1, c.getNome_categoria());
            pstm.setDate(2, c.getData_cadastro());
            pstm.setBytes(3, c.getImagem());
            pstm.setString(4, c.getCodigoCategoria());
            pstm.executeUpdate();
            pstm.close();

            JOptionPane.showMessageDialog(null, "Actualizado com sucesso!!!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao actualizar Categoria : " + e.getMessage());
        }
    }

    public void Estado_Categoria(Categorias c) {

        String sql = "update categorias set  status = ? where codigoCategoria = ?";
        conn = new ConectionDB().connecting();
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, c.getStatus());
            pstm.setString(2, c.getCodigoCategoria());
            pstm.executeUpdate();
            pstm.close();

            if (c.getStatus().equalsIgnoreCase("Inactivo")) {
                JOptionPane.showMessageDialog(null, "Categoria Desactivada!!!");
            } else {
                JOptionPane.showMessageDialog(null, "Categoria Activa!!!");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao Eliminar Categoria" + e.getMessage());
        }

    }
}
