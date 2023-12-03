/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CONTROLLER;

import DAO.DAO_Categoria;
import MODEL.DTO.Categorias;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.sql.Date;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author HOLLY MAN
 */
public class Controller_Categoria {

    DAO_Categoria dao_c = new DAO_Categoria();

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

    public void Verificacao_Save(String codigo, String nome, Date data, byte[] img, String estado) {
        Categorias c = new Categorias();
        if (codigo.equals("") || nome.equals("") || data.equals("") || img.equals("") || estado.equals("")) {
            JOptionPane.showMessageDialog(null, "Certifique-se de ter preenchido todos os campos!");
        } else {

            c.setCodigoCategoria(codigo);
            c.setNome_categoria(nome);
            c.setData_cadastro(data);
            c.setImagem(img);
            c.setStatus(estado);
            dao_c.save_Categoria(c);

        }

    }

    public void Verificacao_Update(String codigo, String nome, Date data, byte[] img) {
        Categorias c = new Categorias();
        if (nome.equals("") || data.equals("") || img.equals("")) {

            JOptionPane.showMessageDialog(null, "Certifique-se de ter preenchido todos os campos!");
        } else {
          
           c.setCodigoCategoria(codigo);
            c.setNome_categoria(nome);
            c.setData_cadastro(data);
            c.setImagem(img);

            dao_c.Update_Manager_Categoria(c);
        }

    }
}
