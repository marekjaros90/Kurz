
import java.util.*;

public class Participants {

    List<Jumper> participants = new ArrayList<Jumper>();

    public void add(Jumper jumper) {
        participants.add(jumper);
    }

    public void printList() {
        int a = 1;
        for (int i = 0; i < this.participants.size(); i++) {
            System.out.println("  " + a + ". " + this.participants.get(i).getName() + " (" + this.participants.get(i).getPoints() + " points)");
            a++;
        }
    }

    public void getResults() {
        for (Jumper jumper : participants) {
            System.out.println("  " + jumper.getName());
            System.out.println("    length: " + jumper.getLenght());
            jumper.addJump(jumper.getLenght());
            System.out.println("    judge votes: " + Arrays.toString(jumper.getJudges()));
        }
    }

    public void setResults() {
        for (Jumper jumper : participants) {
            jumper.setLenght();
            jumper.setJudges();
            jumper.setPoints();
        }
        Collections.sort(participants);
    }

    public void tournamentsResults() {
        int a = 1;
        Collections.reverse(participants);
        for (int i = 0; i < this.participants.size(); i++) {
            System.out.println(a + "           " + this.participants.get(i).getName() + " (" + this.participants.get(i).getPoints() + " points)");
            ArrayList<Integer> list = this.participants.get(i).getJumps();
            System.out.print("            jump lengths: ");
            for (int b = 0; b < list.size(); b++) {
                if(b == list.size()-1) {
                    System.out.print(list.get(b) + " m");
                    break;
                }
                System.out.print(list.get(b) + " m, ");
            }
            a++;
            System.out.println("");
        }
    }
    
   
}
