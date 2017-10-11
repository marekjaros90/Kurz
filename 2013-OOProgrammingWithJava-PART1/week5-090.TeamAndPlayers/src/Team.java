
import java.util.ArrayList;

public class Team {

    private String name;
    private ArrayList<Player> players;
    private int max;

    public Team(String name) {
        this.name = name;
        this.players = new ArrayList<Player>();
        this.max = 16;
    }

    public void addPlayer(Player play) {
        if (this.max <= this.size()) {
            return;
        }
        this.players.add(play);
    }

    public String getName() {
        return this.name;
    }

    public void printPlayers() {
        for (Player toPrint : this.players) {
            System.out.println(toPrint);
        }
    }
    
    public int size() {
        return this.players.size();
    }
    
    public void setMaxSize(int maxSize) {
        this.max = maxSize;
    }
    
    public int goals () {
        int number = 0;
        for (Player player : this.players) {
            number += player.goals();
        }
        return number;
    }
}
