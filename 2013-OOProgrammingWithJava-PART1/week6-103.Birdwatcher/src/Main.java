import java.util.Scanner;

public class Main {  

    public static void main(String[] args) {
    // implement your program here
    // do not put all to one method/class but rather design a proper structure to your program
        
    // Your program should use only one Scanner object, i.e., it is allowed to call 
    // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter
        
        Scanner scanner = new Scanner(System.in);
        Database birds = new Database();
        
        while (true) {
            System.out.print("? ");
            String action = scanner.nextLine();
            if (action.equals("Add")) {
                birds.Add(scanner);
            } else if (action.equals("Observation")) {
                birds.Observation(scanner);
            } else if (action.equals("Statistics")) {
                birds.Statistics();
            } else if (action.equals("Show")) {
                birds.Show(scanner);
            } else if (action.equals("Quit")) {
                break;
            }
        }
    }

}
