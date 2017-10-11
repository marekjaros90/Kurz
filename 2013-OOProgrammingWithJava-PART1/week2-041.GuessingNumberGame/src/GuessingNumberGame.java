
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();

        System.out.print("Guess a number: ");
        int guess = Integer.parseInt(reader.nextLine());
        
        int count = 1;
        while (true) {
            if (numberDrawn == guess) {
                System.out.println("Congratulations, your guess is correct!");
                break;
            } else if (numberDrawn < guess) {
                System.out.print("The number is lesser, ");
            } else {
                System.out.print("The number is greater, ");
            }
            System.out.println("guesses made: " + count);
            count++;
            System.out.print("Guess a number: ");
            guess = Integer.parseInt(reader.nextLine());
        }
        // program your solution here. Do not touch the above lines!
    }

    // DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
