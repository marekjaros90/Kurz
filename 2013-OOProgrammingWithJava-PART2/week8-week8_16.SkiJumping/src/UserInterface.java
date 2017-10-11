
import java.util.*;

public class UserInterface {

    private Participants participants = new Participants();

    public Scanner scn = new Scanner(System.in);

    public void start() {
        this.getNames();
        this.jumping();
        this.results();
    }

    public void getNames() {
        System.out.println("Kumpula ski jumping week");
        System.out.println("");
        System.out.println("Write the names of the participants one at a time; an empty string brings you to the jumping phase.");

        String name = "";
        while (true) {
            System.out.print("  Participant name: ");
            name = scn.nextLine();
            if (name.isEmpty()) {
                System.out.println("");
                System.out.println("The tournament begins!");
                break;
            }
            participants.add(new Jumper(name));
        }
    }

    public void jumping() {
        int i = 1;
        while (true) {
            System.out.print("Write \"jump\" to jump; otherwise you quit: ");
            String jump = scn.nextLine();
            if (!jump.equals("jump")) {
                System.out.println("");
                System.out.println("Thanks!");
                System.out.println("");
                break;
            }

            System.out.println("");
            System.out.println("Round " + i);
            System.out.println("");
            System.out.println("Jumping order:");
            participants.printList();
            System.out.println("");

            participants.setResults();
            System.out.println("Results of round " + i);
            
            participants.getResults();
            i++;
            System.out.println("");
            
        }
    }
    
    public void results() {
        System.out.println("Tournament results:");
        System.out.println("Position    Name");
        participants.tournamentsResults();
    }

}
