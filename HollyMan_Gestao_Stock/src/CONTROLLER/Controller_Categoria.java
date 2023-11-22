/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CONTROLLER;

import MODEL.DTO.Categorias;
import java.awt.Image;
import java.io.FileInputStream;
import java.util.Date;
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

    Image img;

    Categorias c = new Categorias();

    public void ValidarCampos(String nome, Date data, String status, Image foto) {
        
        if (nome.equals("") || (data.equals("") || (status.equals("")))) 
            JOptionPane.showMessageDialog(null, "Certifique-se de ter preenchido todos campos!!!");
        else{
            //Criando uma instancia do objecto da classe categoria para poder ter acesso aos getters e setters
            Categorias c = new Categorias();
        }

    }

    public Image CarregarImagem(JLabel lblFoto) {

        JFileChooser jfc = new JFileChooser();
        jfc.setDialogTitle("Selecionar um arquivo");
        jfc.setFileFilter(new FileNameExtensionFilter("Arquivo de imagens (*.PNG, *.JPG,*.JPEG)", "png", "jpg", "jpeg"));
        int resultado = jfc.showOpenDialog(jfc);

        if (resultado == JFileChooser.APPROVE_OPTION) {
            try {

                img = ImageIO.read(jfc.getSelectedFile()).getScaledInstance(150, 150, Image.SCALE_SMOOTH);

            } catch (Exception e) {

                JOptionPane.showMessageDialog(null, "Erro ao carregar a imagem!!!");

            }
        }
        return img;

    }
}
