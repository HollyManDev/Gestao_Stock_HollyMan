/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import MODEL.DTO.Produtos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author HOLLY MAN
 */
public class DAO_Produtos {
    
    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    
    byte[] imagemBytes;
    
    ArrayList<Produtos> lista = new ArrayList<>();
    
    public void save_Produtos(Produtos p) {
        String sql = "INSERT INTO produtos (Descricao, Marca, Status, codigo_barra, codigo_produto, imagem, lote, lucro_unidade, nivelMinimo_Disponibilidade, nome_produto, peso_volume, preco_compra, preco_venda, quantidade_Adicionar, quantidade_emEmbalagem, quantidade_embalada, tipo_produto, total_custos, unidadeMedida, validade, id_categoria) VALUES (?, ?, ?, ?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        
        try (Connection conn = new ConectionDB().connecting(); PreparedStatement pstm = conn.prepareStatement(sql)) {
            
            pstm.setString(1, p.getDescricao());
            pstm.setString(2, p.getMarca());
            pstm.setString(3, p.getStatus());
            pstm.setLong(4, p.getCodigo_barra());
            pstm.setString(5, p.getCodigo_produto());
            pstm.setBytes(6, p.getImagem());
            pstm.setInt(7, p.getLote());
            pstm.setDouble(8, p.getLucro_unidade());
            pstm.setString(9, p.getNivelMinimo_Disponibilidade());
            pstm.setString(10, p.getNome_produto());
            pstm.setDouble(11, p.getPeso_volume());
            pstm.setDouble(12, p.getPreco_compra());
            pstm.setDouble(13, p.getPreco_venda());
            pstm.setDouble(14, p.getQuantidade_Adicionar());
            pstm.setDouble(15, p.getQuantidade_emEmbalagem());
            pstm.setDouble(16, p.getQuantidade_embalada());
            pstm.setString(17, p.getTipo_Produto());
            pstm.setDouble(18, p.getTotal_custos());
            pstm.setString(19, p.getUnidadeMedida());
            pstm.setDate(20, p.getValidade());
            pstm.setLong(21, p.getCodigo_categoria());
            
            pstm.execute();
            pstm.close();
            JOptionPane.showMessageDialog(null, "Produto cadastrado");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar produto: " + e.getMessage());
            e.printStackTrace();
        }
    }
    
    public void Update_Produtos(Produtos p) {
        String sql = "update produtos set Descricao = ?, Marca = ?, codigo_barra = ?,imagem = ?, lote =?, lucro_unidade=?, nome_produto =?, peso_volume = ?, preco_compra =?, preco_venda =?, quantidade_Adicionar =?, quantidade_emEmbalagem =?, quantidade_embalada =?, tipo_produto =?, total_custos =?, unidadeMedida =?, validade =?, id_categoria =? where codigo_produto = ?";
        
        try (Connection conn = new ConectionDB().connecting(); PreparedStatement pstm = conn.prepareStatement(sql)) {
            
            pstm.setString(1, p.getDescricao());
            pstm.setString(2, p.getMarca()); 
            pstm.setLong(3, p.getCodigo_barra());         
            pstm.setBytes(4, p.getImagem());
            pstm.setInt(5, p.getLote());
            pstm.setDouble(6, p.getLucro_unidade());            
            pstm.setString(7, p.getNome_produto());
            pstm.setDouble(8, p.getPeso_volume());
            pstm.setDouble(9, p.getPreco_compra());
            pstm.setDouble(10, p.getPreco_venda());
            pstm.setDouble(11, p.getQuantidade_Adicionar());
            pstm.setDouble(12, p.getQuantidade_emEmbalagem());
            pstm.setDouble(13, p.getQuantidade_embalada());
            pstm.setString(14, p.getTipo_Produto());
            pstm.setDouble(15, p.getTotal_custos());
            pstm.setString(16, p.getUnidadeMedida());
            pstm.setDate(17, p.getValidade());
            pstm.setLong(18, p.getCodigo_categoria());
            pstm.setString(19, p.getCodigo_produto());
            
            pstm.executeUpdate();
            pstm.close();
            JOptionPane.showMessageDialog(null, "Produto Actualizado!!!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao Actualizar produto: " + e.getMessage());
            e.printStackTrace();
        }
    }
    
    public ArrayList<Produtos> FindAll_Produtos() {
        String sql = "select * from produtos";
        conn = new ConectionDB().connecting();
        
        try {
            
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();
            
            while (rs.next()) {
                Produtos produto = new Produtos();
                
                produto.setId(rs.getLong(1));
                produto.setData_cadastro(rs.getDate(2));
                produto.setDescricao(rs.getString(3));
                produto.setMarca(rs.getString(4));
                produto.setStatus(rs.getString(5));
                produto.setCodigo_barra(rs.getLong(6));
                produto.setCodigo_produto(rs.getString(7));                
                produto.setImagem(rs.getBytes(8));
                produto.setLote(rs.getInt(9));
                produto.setLucro_unidade(rs.getDouble(10));
                produto.setNivelMinimo_Disponibilidade(rs.getString(11));
                produto.setNome_produto(rs.getString(12));
                produto.setPeso_volume(rs.getDouble(13));
                produto.setPreco_compra(rs.getDouble(14));
                produto.setPreco_venda(rs.getDouble(15));
                produto.setQuantidade_Adicionar(rs.getInt(16));
                produto.setQuantidade_emEmbalagem(rs.getInt(17));
                produto.setQuantidade_embalada(rs.getInt(18));
                produto.setTipo_Produto(rs.getString(19));
                produto.setTotal_custos(rs.getDouble(20));
                produto.setUnidadeMedida(rs.getString(21));
                produto.setValidade(rs.getDate(22));
                produto.setCodigo_categoria(rs.getLong(23));
                
                lista.add(produto);
                
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Buscando todos registros de Produtos" + ex);
            
        }
        
        return lista;
    }
     public void Estado_Produto(Produtos p) {

        String sql = "update produtos set  Status = ? where codigo_produto = ?";
        conn = new ConectionDB().connecting();
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, p.getStatus());
            pstm.setString(2, p.getCodigo_produto());
            pstm.executeUpdate();
            pstm.close();

            if (p.getStatus().equalsIgnoreCase("Inactivo")) {
                JOptionPane.showMessageDialog(null, "Produto Inactivo!!!");
            } else {
                JOptionPane.showMessageDialog(null, "Produto Activo!!!");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao Eliminar Produto" + e.getMessage());
        }

    }
}
