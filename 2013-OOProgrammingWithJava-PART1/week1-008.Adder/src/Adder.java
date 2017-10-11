
import java.util.Scanner;

public class Adder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Implement your program here. Remember to ask the input from user
        System.out.println("Type a number: ");
        int number1 = Integer.parseInt(reader.nextLine());
        System.out.println("Type another number");
        int number2 = Integer.parseInt(reader.nextLine());
        int sum = number1 + number2;
        System.out.println("");
             
        String toPrint = "Sum of the numbers: " + sum;
        
        System.out.print(toPrint);
    }
}
