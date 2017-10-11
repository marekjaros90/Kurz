
import java.util.ArrayList;
import java.util.Scanner;

public class Database {

    private ArrayList<Bird> database;

    public Database() {
        this.database = new ArrayList<Bird>();
    }

    public void Add(Scanner scanner) {
        System.out.print("Name: ");
        String name = scanner.nextLine();

        System.out.print("Latin Name: ");
        String latin = scanner.nextLine();

        this.database.add(new Bird(name, latin));
    }

    public void Observation(Scanner scanner) {
        System.out.print("What was observed? ");
        String name = scanner.nextLine();

        for (Bird bird : database) {
            if (bird.getName().equals(name)) {
                bird.addObservation();
                return;
            }
        }
        System.out.println("Is not a bird!");
    }


    public void Statistics() {
        for (Bird bird : database) {
            System.out.println(bird + ": " + bird.getObservation() + " observations");
        }
    }
    
    public void Show(Scanner scanner) {
        System.out.print("What? ");
        String name = scanner.nextLine();
        
        for (Bird bird : database) {
            if (bird.getName().equals(name)) {
                System.out.println(bird + ": " + bird.getObservation() + " observations");
            }
        }
    }

}
