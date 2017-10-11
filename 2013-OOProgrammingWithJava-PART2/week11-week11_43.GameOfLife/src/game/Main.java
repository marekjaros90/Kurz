package game;

import gameoflife.Simulator;

public class Main {

    public static void main(String[] args) {
         PersonalBoard board = new PersonalBoard(3, 3);
        board.initiateRandomCells(0.5);

        GameOfLifeTester tester = new GameOfLifeTester(board);
        tester.play();
    }
}
