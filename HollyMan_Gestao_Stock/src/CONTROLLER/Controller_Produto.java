/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CONTROLLER;

import DAO.DAO_Produtos;
import MODEL.DTO.Produtos;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.sql.Date;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author HOLLY MAN
 */
public class Controller_Produto {
    DAO_Produtos dao_p = new DAO_Produtos();
    byte[] imagemBytes;

    public byte[] CarregarImagem(JLabel lblFoto) {

        JFileChooser jfc = new JFileChooser();
        jfc.setDialogTitle("Selecionar um arquivo");
        jfc.setFileFilter(new FileNameExtensionFilter("Arquivo de imagens (*.PNG, *.JPG,*.JPEG)", "png", "jpg", "jpeg"));
        int resultado = jfc.showOpenDialog(jfc);

        if (resultado == JFileChooser.APPROVE_OPTION) {
            try {

                Image imagem = ImageIO.read(jfc.getSelectedFile()).getScaledInstance(150, 150, Image.SCALE_SMOOTH);

                // Converta a imagem para um array de bytes
                BufferedImage bufferedImage = new BufferedImage(imagem.getWidth(null), imagem.getHeight(null), BufferedImage.TYPE_INT_ARGB);
                Graphics g = bufferedImage.getGraphics();
                g.drawImage(imagem, 0, 0, null);
                g.dispose();

                ByteArrayOutputStream baos = new ByteArrayOutputStream();

                ImageIO.write(bufferedImage, "png", baos);

                imagemBytes = baos.toByteArray();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao carregar a imagem!!!");
            }
        }
        return imagemBytes;
    }

    public void Verificacao_Save(Long codigo_categoria, String codigo, String nome, long codigo_barra, Date validade, int lote, String tipo_produto, int numero_Embalagens, int qtd_emEmbalagem, int total_Produtos, String estado, String marca, String medida, double peso_volume, double preco_compra, double preco_venda, String nivel_disponibilidade, Double total_custo, double lucro,String descricao,byte[] img) {
             
        if(codigo_categoria.equals("") || codigo.equals("") || nome.equals("") || validade.equals("") || tipo_produto.equals("") || estado.equals("") || marca.equals("") || medida.equals("") || descricao.equals("") || img.equals("")){
                    
                  JOptionPane.showMessageDialog(null, "Certifique-se de ter preenchido todos os campos!!!");
              
              }else{
                  Produtos p = new Produtos();
                  
                  p.setCodigo_categoria(codigo_categoria);
                  p.setCodigo_produto(codigo);
                  p.setNome_produto(nome);
                  p.setCodigo_barra(codigo_barra);
                  p.setValidade(validade);
                  p.setLote(lote);
                  p.setTipo_Produto(tipo_produto);
                  p.setQuantidade_embalada(numero_Embalagens);
                  p.setQuantidade_emEmbalagem(qtd_emEmbalagem);
                  p.setQuantidade_Adicionar(total_Produtos);
                  p.setStatus(estado);
                  p.setMarca(marca);
                  p.setUnidadeMedida(medida);
                  p.setPeso_volume(peso_volume);
                  p.setPreco_compra(preco_compra);
                  p.setPreco_venda(preco_venda);
                  p.setNivelMinimo_Disponibilidade(nivel_disponibilidade);
                  p.setTotal_custos(total_custo);
                  p.setDescricao(descricao);
                  p.setLucro_unidade(lucro);
                  p.setImagem(img);
                  
                  dao_p.save_Produtos(p);
              }
    }
    public void Verificacao_UPdate(Long codigo_categoria, String codigo, String nome, long codigo_barra, Date validade, int lote, String tipo_produto, Double numero_Embalagens, Double qtd_emEmbalagem, Double total_Produtos, String marca, String medida, double peso_volume, double preco_compra, double preco_venda, Double total_custo, double lucro,String descricao,byte[] img) {
             
        if(codigo_categoria.equals("") || codigo.equals("") || nome.equals("") || validade.equals("") || tipo_produto.equals("") || marca.equals("") || medida.equals("") || descricao.equals("") || img.equals("")){
                    
                  JOptionPane.showMessageDialog(null, "Certifique-se de ter preenchido todos os campos!!!");
              
              }else{
                  Produtos p = new Produtos();
                  
                  p.setCodigo_categoria(codigo_categoria);
                  p.setCodigo_produto(codigo);
                  p.setNome_produto(nome);
                  p.setCodigo_barra(codigo_barra);
                  p.setValidade(validade);
                  p.setLote(lote);
                  p.setTipo_Produto(tipo_produto);
                  p.setQuantidade_embalada(numero_Embalagens);
                  p.setQuantidade_emEmbalagem(qtd_emEmbalagem);
                  p.setQuantidade_Adicionar(total_Produtos);
                  p.setMarca(marca);
                  p.setUnidadeMedida(medida);
                  p.setPeso_volume(peso_volume);
                  p.setPreco_compra(preco_compra);
                  p.setPreco_venda(preco_venda);
                  p.setTotal_custos(total_custo);
                  p.setDescricao(descricao);
                  p.setLucro_unidade(lucro);
                  p.setImagem(img);
                  
                  dao_p.Update_Produtos(p);
              }
    }

}
