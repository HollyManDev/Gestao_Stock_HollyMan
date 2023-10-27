/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CSS;

/**
 *
 * @author HOLLY MAN
 */

import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.RoundRectangle2D;
public class JLabelComBordaRedonda extends JLabel {
    private int cornerRadius = 30; // Raio dos cantos arredondados
    private Color borderColor = new Color(0,102,255); // Cor da borda branca

    public JLabelComBordaRedonda() {
        super();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        int width = getWidth();
        int height = getHeight();

        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Desenho do retângulo arredondado com fundo transparente
        RoundRectangle2D.Float background = new RoundRectangle2D.Float(0, 0, width - 1, height - 1, cornerRadius, cornerRadius);
        g2.setColor(Color.white); // Cor de fundo do JLabel
        g2.fill(background);

        // Desenho da borda branca
        g2.setColor(borderColor);
        g2.drawRoundRect(0, 0, width - 1, height - 1, cornerRadius, cornerRadius);
    }
}