
import java.util.Scanner;


public class UpToCertainNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        // Write your code here
        
        int number = 1;
        System.out.print("Up to what number? ");
        int sum = Integer.parseInt(reader.nextLine());
        
        while (number <= sum) {
            System.out.println(number);
            number++;
        }
    }
}
