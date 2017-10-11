import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Type a nmuber: ");
        int number = Integer.parseInt(reader.nextLine());
        
        int sum = 1;
        int i = 1;
        while (i <= number) {
            sum *= i;
            i++;
        }
        
        System.out.println("Factorial is " + sum);

    }
}
