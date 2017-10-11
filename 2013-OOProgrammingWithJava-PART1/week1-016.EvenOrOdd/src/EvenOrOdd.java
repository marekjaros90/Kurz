
import java.util.Scanner;

public class EvenOrOdd {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Type your program here

        System.out.print("Type a number: ");
        int number = Integer.parseInt(reader.nextLine());
        
        System.out.println("");
        if (number%2 == 0) {
            System.out.println("Number " + number + " is even");
        } else {
            System.out.println("Number " + number + " is odd");
        }

    }
}
