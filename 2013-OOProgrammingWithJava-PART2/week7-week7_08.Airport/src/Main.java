import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Write your main program here. Implementing your own classes will be useful.
        Scanner reader = new Scanner(System.in);
        Planes plane = new Planes();
        Airports airport = new Airports();
        
        Interface letadla = new Interface(reader, plane, airport);
        
        letadla.start();
    }
}
