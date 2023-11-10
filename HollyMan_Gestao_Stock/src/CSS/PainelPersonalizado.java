/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CSS;

/**
 *
 * @author HOLLY MAN
 */
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.RoundRectangle2D;

public class PainelPersonalizado extends JPanel {
    private int cornerRadius = 30; // Raio de 30 para cantos arredondados
    private Color borderColor = Color.WHITE; // Cor da borda branca

    public PainelPersonalizado() {
        setOpaque(false); // Torna a área do painel transparente
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        int width = getWidth();
        int height = getHeight();

        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Desenho do painel arredondado com fundo branco
        RoundRectangle2D.Float background = new RoundRectangle2D.Float(0, 0, width, height, cornerRadius, cornerRadius);
        g2.setColor(new Color(255,255,255));
        g2.fill(background);

        // Desenho da borda branca
        g2.setColor(borderColor);
        g2.drawRoundRect(0, 0, width - 1, height - 1, cornerRadius, cornerRadius);
    }
}
