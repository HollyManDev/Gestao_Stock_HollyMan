/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CONTROLLER;

import java.awt.Image;
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
    Image img;
    
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
