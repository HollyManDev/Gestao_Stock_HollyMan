/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VIEW;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author HOLLY MAN
 */
public class Gerente extends JFrame {
                 JPanel pnlPrincipal = new JPanel();
    public Gerente() {
        
        this.setSize(1200, 700);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        
     
        pnlPrincipal.setLayout(null);
        pnlPrincipal.setBounds(0, 0, 1200, 700);
        pnlPrincipal.setBackground(Color.white);
        
         JPanel pnlMenu_Botoes = new JPanel();
        pnlMenu_Botoes.setBounds(0, 0, 280, 700);
        pnlMenu_Botoes.setLayout(null);
        pnlMenu_Botoes.setBackground(new Color(102, 102, 255));


        this.add(pnlPrincipal);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new Gerente().setVisible(true);
    }
}
