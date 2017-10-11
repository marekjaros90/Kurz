package wormgame.game;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.Timer;
import wormgame.Direction;
import wormgame.domain.Apple;
import wormgame.domain.Piece;
import wormgame.domain.Worm;
import wormgame.gui.Updatable;

public class WormGame extends Timer implements ActionListener {

    private int width;
    private int height;
    private boolean continues;
    private Updatable updatable;
    
    private Worm worm;
    private Apple apple;
    private Random random;

    public WormGame(int width, int height) {
        super(1000, null);

        this.width = width;
        this.height = height;
        this.continues = true;

        addActionListener(this);
        setInitialDelay(2000);

        this.worm = new Worm(this.width / 2, this.height / 2, Direction.DOWN);

        this.random = new Random();

        while(true) {
                this.setApple(new Apple(random.nextInt(width), random.nextInt(height)));
                if(!this.worm.runsInto(apple)) {
                    break;
                }
            }
    }
    
    public Worm getWorm() {
        return this.worm;
    }
    
    public void setWorm(Worm worm) {
        this.worm = worm;
    }
    
    public Apple getApple() {
        return this.apple;
    }
    
    public void setApple(Apple apple) {
        this.apple = apple;
    }
    
    public boolean continues() {
        return continues;
    }

    public void setUpdatable(Updatable updatable) {
        this.updatable = updatable;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(!continues) {
            return;
        }
        
        this.worm.move();
        
        if(this.worm.runsInto(apple)) {
            this.worm.grow();
            
            while(true) {
                this.setApple(new Apple(random.nextInt(width), random.nextInt(height)));
                if(!this.worm.runsInto(apple)) {
                    break;
                }
            }
        }
        
        if(this.worm.runsIntoItself()) {
            this.continues = false;
        }
        
        for(Piece p : worm.getPieces()) {
            if(p.getX() >= this.width || p.getX() <= 0 || p.getY() >= this.height || p.getY() <= 0) {
                this.continues = false;
            }
        }
        
        this.updatable.update();
        
        super.setDelay(1000/worm.getLength());
    }

}
