package wormgame.domain;

import java.util.ArrayList;
import java.util.List;
import wormgame.Direction;

public class Worm {

    private Direction direction;
    private List<Piece> pieces;
    private boolean growOrNot;

    public Worm(int originalX, int originalY, Direction originalDirection) {
        this.direction = originalDirection;
        this.pieces = new ArrayList<Piece>();
        this.pieces.add(new Piece(originalX,originalY));
        this.growOrNot = false;
    }

    public Direction getDirection() {
        return this.direction;
    }

    public void setDirection(Direction dir) {
        this.direction = dir;
    }

    public int getLength() {
        return this.getPieces().size();
    }

    public List<Piece> getPieces() {
        return this.pieces;
    }

    public void move() {

        int x = this.pieces.get(this.getLength() - 1).getX();
        int y = this.pieces.get(this.getLength() - 1).getY();

        if (this.getLength() > 2  && !this.growOrNot) {
            this.pieces.remove(0);
        }

        if (this.direction == Direction.DOWN) {
            this.pieces.add(new Piece(x, y + 1));
        } else if (this.direction == Direction.UP) {
            this.pieces.add(new Piece(x, y - 1));
        } else if (this.direction == Direction.LEFT) {
            this.pieces.add(new Piece(x - 1, y));
        } else if (this.direction == Direction.RIGHT) {
            this.pieces.add(new Piece(x + 1, y));
        }
        
        this.growOrNot = false;
    }
    
    public void grow() {
        this.growOrNot = true;
    }
    
    public boolean runsInto(Piece piece) {
        for(Piece p : this.pieces) {
            if(p.getX() == piece.getX() && p.getY() == piece.getY()) {
                return true;
            }
        }
        
        return false;
    }

    public boolean runsIntoItself() {
        for(Piece p : this.pieces) {
            for(Piece c : this.pieces) {
                if(p == c) {
                    continue;
                }
                if(p.getX() == c.getX() && p.getY() == c.getY()) {
                    return true;
                }
            }
        }
        
        return false;
    }
}
