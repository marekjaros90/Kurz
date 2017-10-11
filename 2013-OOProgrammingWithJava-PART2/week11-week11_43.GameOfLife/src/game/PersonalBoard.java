package game;

import gameoflife.GameOfLifeBoard;
import java.util.Random;
import static javax.swing.Spring.width;

public class PersonalBoard extends GameOfLifeBoard {

    public PersonalBoard(int width, int height) {
        super(width, height);

    }

    @Override
    public void initiateRandomCells(double d) {
        Random random = new Random();
        int size = super.getWidth() * super.getHeight();
        int i = 0;
        while (i < (size * d)) {
            int x = random.nextInt(super.getWidth());
            int y = random.nextInt(super.getHeight());
            if (!this.isAlive(x, y)) {
                turnToLiving(x, y);
            } else {
                while (true) {
                    x = random.nextInt(super.getWidth());
                    y = random.nextInt(super.getHeight());
                    if (!this.isAlive(x, y)) {
                        turnToLiving(x, y);
                        break;
                    }

                }
            }

            i++;
        }

    }

    @Override
    public boolean isAlive(int x, int y) {
        try {
            return getBoard()[x][y];
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public void turnToLiving(int x, int y) {
        try {
            super.getBoard()[x][y] = true;
        } catch (Exception e) {

        }
    }

    @Override
    public void turnToDead(int x, int y) {
        try {
            super.getBoard()[x][y] = false;
        } catch (Exception e) {

        }
    }

    @Override
    public int getNumberOfLivingNeighbours(int x, int y) {
        int sum = 0;
        for (int i = -1; i < 2; i++) {
            int dx = x - i;
            for (int j = -1; j < 2; j++) {
                int dy = y - j;
                if (this.isAlive(dx, dy)) {
                    sum++;
                }
            }
        }
        if (this.isAlive(x, y)) {
            sum--;
        }

        return sum;
    }

    @Override
    public void manageCell(int x, int y, int livingNeighbours) {
        if (this.isAlive(x, y) && livingNeighbours < 2) {
            this.turnToDead(x, y);
        }

        if (this.isAlive(x, y) && livingNeighbours > 3) {
            this.turnToDead(x, y);
        }

        if (!this.isAlive(x, y) && livingNeighbours == 3) {
            this.turnToLiving(x, y);
        }
    }

}
