package drawing.ui;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawingBoard extends JPanel {

    public DrawingBoard() {
        super.setBackground(Color.WHITE);
    }

    @Override
    protected void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        
        graphics.fillRect(20, 200, 60, 60);
        graphics.fillRect(300, 200, 60, 60);
        graphics.fillRect(80, 260, 220, 60);
        graphics.fillRect(80, 20, 60, 60);
        graphics.fillRect(240, 20, 60, 60);
        
    }
}
