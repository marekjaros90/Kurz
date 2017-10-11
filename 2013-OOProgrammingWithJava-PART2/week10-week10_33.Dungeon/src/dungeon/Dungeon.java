package dungeon;

import static java.lang.Math.random;
import java.util.*;

public class Dungeon {

    private int lenght;
    private int height;
    private int vampires;
    private int moves;
    boolean vampiresMove;
    private Board board;
    private int vampireMoves;

    private Player player;

    private List<Vampire> listOfVampires = new ArrayList<Vampire>();
    private Scanner reader = new Scanner(System.in);
    private Random random = new Random();

    public Dungeon(int length, int height, int vampires, int moves, boolean vampiresMove) {
        this.board = new Board(length, height);
        this.lenght = length;
        this.height = height;
        this.vampires = vampires;
        this.moves = moves;
        this.vampiresMove = vampiresMove;
        this.player = new Player();
    }

    public void run() {
        this.createVampires();
        this.board.makeBoard();

        while (true) {
            if (this.moves == 0) {
                System.out.println("YOU LOSE");
                return;
            }

            System.out.println(this.moves);
            System.out.println("");

            System.out.println(player);
            this.printVampires();
            System.out.println("");

            this.board.setString(player);
            for (Vampire vampire : listOfVampires) {
                this.board.setString(vampire);
            }

            this.board.printBoard();

            String word = reader.nextLine();
            player.move(board, word);
            this.moves--;

            this.controlBoard();

            this.moveVampire();

            if (this.vampires == 0) {
                System.out.println("YOU WIN");
                return;
            }

        }
    }

    public void createVampires() {
        String[][] game = board.getBoard();
        for (int i = 0; i < this.vampires; i++) {
            int x = random.nextInt(lenght);
            int y = random.nextInt(height);

            listOfVampires.add(new Vampire("v", x, y));

        }
    }

    public void moveVampire() {
        if (this.vampiresMove) {
            for (int i = 0; i < this.vampires; i++) {
                listOfVampires.get(i).move(board, vampireMoves);
                if (this.player.getX() == this.listOfVampires.get(i).getX() && this.player.getY() == this.listOfVampires.get(i).getY()) {
                    this.listOfVampires.remove(this.listOfVampires.get(i));
                    this.vampires--;
                }
            }
        }
    }

    public void printVampires() {
        for (Contestant vampire : listOfVampires) {
            System.out.println(vampire);
        }
    }

    public void controlBoard() {
        for (int i = 0; i < this.vampires; i++) {
            if (this.player.getX() == this.listOfVampires.get(i).getX() && this.player.getY() == this.listOfVampires.get(i).getY()) {
                this.listOfVampires.remove(this.listOfVampires.get(i));
                this.vampires--;
            }
        }

    }
}
