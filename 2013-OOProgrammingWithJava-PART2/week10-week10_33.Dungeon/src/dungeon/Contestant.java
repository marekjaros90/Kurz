package dungeon;

import java.util.ArrayList;
import java.util.List;

public class Contestant {
    private String name;
    private int xPosition;
    private int yPosition;
    
    public Contestant (String name, int xPosition, int yPosition) {
        this.name = name;
        this.xPosition = xPosition;
        this.yPosition = yPosition;
    }
    
    public Contestant(String name) {
        this(name, 0, 0);
    }
    
    public String getName() {
        return this.name;
    }
    
    public int getX() {
        return this.xPosition;
    }
    
    public int getY() {
        return this.yPosition;
    }
    
    public void setX(int x) {
        this.xPosition = x;
    } 
    
    public void setY(int y) {
        this.yPosition = y;
    }
    
    @Override
    public String toString() {
        return this.name  + " " + this.yPosition+ " " + this.xPosition;
    }


}
