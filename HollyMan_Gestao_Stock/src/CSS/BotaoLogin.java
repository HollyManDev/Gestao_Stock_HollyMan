/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CSS;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.RoundRectangle2D;
import javax.swing.BorderFactory;
import javax.swing.JButton;

/**
 *
 * @author HOLLY MAN
 */
public class BotaoLogin extends JButton {
      private Color borderColor = new Color(73, 55, 3);
    private int cornerRadius = 10;

    public BotaoLogin(String text) {
        super(text);
        setContentAreaFilled(false); // Torna a área do botão transparente
         setBorder(BorderFactory.createEmptyBorder());
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        int width = getWidth();
        int height = getHeight();

        // Desenho do botão arredondado
        RoundRectangle2D.Float background = new RoundRectangle2D.Float(0, 0, width, height, cornerRadius, cornerRadius);
        g2.setColor(Color.WHITE); // Cor do fundo
        g2.fill(background);

        // Desenho da borda
        g2.setColor(borderColor);
        g2.drawRoundRect(0, 0, width - 1, height - 1, cornerRadius, cornerRadius);

        super.paintComponent(g);
    }
}
