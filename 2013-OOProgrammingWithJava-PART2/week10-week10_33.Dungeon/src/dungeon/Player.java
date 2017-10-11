package dungeon;

public class Player extends Contestant {
    private Board board;
    private int moves;
    
    public Player() {
        super("@");
        this.moves = 0;
    }
    
    public void move(Board board, String word) {
        this.moves = 0;
        int x = this.getX();
        int y = this.getY();
        String[][] game = board.getBoard();
        game[x][y] = ".";
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == 'w') {
                x--;
            } else if (word.charAt(i) == 's') {
                x++;
            } else if (word.charAt(i) == 'a') {
                y--;
            } else if (word.charAt(i) == 'd') {
                y++;
            }

            if (x < 0)  {
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
            
            this.setX(x);
            this.setY(y);
            moves++;
        }
    }
    
    public int getMoves() {
        return this.moves;
    }
    
 }
