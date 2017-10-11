package dungeon;

public class Board {

    private String[][] board;
    private int length;
    private int height;

    public Board(int length, int height) {
        this.board = new String[length][height];
        this.length = length;
        this.height = height;
    }

    public void setString(Contestant contestant) {
        this.board[contestant.getX()][contestant.getY()] = contestant.getName();
    }

    public void makeBoard() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = ".";
            }
        }

    }
    
    public int getLength() {
        return this.length;
    }
    
    public int getHeight() {
        return this.height;
    }

    public void printBoard() {
        for (String[] a : board) {
            for (String i : a) {
                System.out.print(i);
            }
            System.out.println("");
        }
    }
    
    public String[][] getBoard() {
        return this.board;
    }
    


}
