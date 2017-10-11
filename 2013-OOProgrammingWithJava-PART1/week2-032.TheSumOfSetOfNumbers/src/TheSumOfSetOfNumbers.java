
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Until what? ");
        int last = Integer.parseInt(reader.nextLine());
        
        int sum = 0;
        int i = 1;
        while (i <= last) {
            sum += i;
            i++;
        }
        
        System.out.println("Sum is " + sum);
    }
}
