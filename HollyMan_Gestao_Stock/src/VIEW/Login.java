/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VIEW;

import java.awt.Color;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 *
 * @author HOLLY MAN
 */
public class Login extends javax.swing.JFrame {
    public Login(){
        this.setSize(950, 600);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);//permite com que a janela do login nao seja redimensionada
        this.setLayout(null);
        this.setUndecorated(true);
       // O codigo acima é referente a janela de login, sem nenhuma componente.
        this.setVisible(true);
    }
    
}
