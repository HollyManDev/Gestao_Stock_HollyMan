/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CSS;

/**
 *
 * @author HOLLY MAN
 */

import javax.swing.JButton;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.RoundRectangle2D;

import javax.swing.JButton;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.BorderFactory;

public class BotaoPersonalizado extends JButton {
    private Color borderColor = new Color(0, 102, 255);
    private int cornerRadius = 10;

    public BotaoPersonalizado(String text) {
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