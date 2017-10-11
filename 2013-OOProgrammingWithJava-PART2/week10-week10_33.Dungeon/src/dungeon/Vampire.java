package dungeon;

import java.util.List;
import java.util.*;

public class Vampire extends Contestant {

    private Board board;
    private Random random;

    public Vampire(String name, int length, int height) {
        super(name, length, height);
        this.random = new Random();
    }


    public void move(Board board, int vampireMoves) {
        String[][] game = board.getBoard();
        int x = this.getX();
        int y = this.getY();
        game[x][y] = ".";
        for (int i = 0; i < vampireMoves; i++);
        {
            x += random.nextInt(2) - 1;
            y += random.nextInt(2) - 1;

            if (x < 0) {
                x = 0;
            }

            if (y >= board.getHeight()) {
                y = board.getHeight() - 1;
            }

            if (y < 0) {
                y = 0;
            }
            
            if(x >= board.getLength()) {
                x = board.getLength() - 1;
            }

            if (!game[x][y].equals("v")) {
                this.setX(x);
                this.setY(y);
            }
        }

    }
}
