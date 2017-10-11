
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type the points [0-60]: ");
        int p = Integer.parseInt(reader.nextLine());
              
        if (p >= 50) {
            System.out.println("Grade: 5");
        } else if (p >= 45) {
            System.out.println("Grade: 4");
        } else if (p >= 40) {
            System.out.println("Grade: 3");
        } else if (p >= 35) {
            System.out.println("Grade: 2");
        } else if (p >= 30) {
            System.out.println("Grade: 1");
        } else {
            System.out.println("failed");
        }
        
    }
}
