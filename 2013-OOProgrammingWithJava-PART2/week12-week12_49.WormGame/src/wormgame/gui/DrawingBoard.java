
package wormgame.gui;

import java.awt.Color;
import java.awt.Graphics;
import java.util.List;
import javax.swing.JPanel;
import wormgame.domain.Apple;
import wormgame.domain.Piece;
import wormgame.domain.Worm;
import wormgame.game.WormGame;

public class DrawingBoard extends JPanel implements Updatable {
    private WormGame wormgame;
    private int pieceLength;
    
    public DrawingBoard(WormGame wormgame, int pieceLength) {
        this.wormgame = wormgame;
        this.pieceLength = pieceLength;
    }
    
    @Override
    public void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
                
        Worm worm = this.wormgame.getWorm();
        List<Piece> list = worm.getPieces();
        
        graphics.setColor(Color.BLACK);
        for(Piece p : list) {
            graphics.fill3DRect(p.getX()*this.pieceLength, p.getY()*this.pieceLength, this.pieceLength, this.pieceLength, true);
        }
        
        Apple apple = this.wormgame.getApple();
        
        graphics.setColor(Color.RED);
        graphics.fillOval(apple.getX()*this.pieceLength, apple.getY()*this.pieceLength, this.pieceLength, this.pieceLength);
    }

    @Override
    public void update() {
        super.repaint();
    }
}
