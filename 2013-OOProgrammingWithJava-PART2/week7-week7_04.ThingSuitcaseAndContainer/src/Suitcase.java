
import java.util.ArrayList;

public class Suitcase {

    private int maxWeight;
    private ArrayList<Thing> list = new ArrayList<Thing>();

    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public void addThing(Thing thing) {
        int weight = this.totalWeight();
        if (weight + thing.getWeight() <= this.maxWeight) {
            this.list.add(thing);
        }
    }

    public String toString() {
        int weight = this.totalWeight();
        int things = this.totalThings();
        if(things == 0) {
            return "empty (" + weight + " kg)";
        } else if(things == 1) {
            return things + " thing (" + weight + " kg)";
        }
        return things + " things (" + weight + " kg)";
    }
    
    public int totalWeight() {
        int weight = 0;
        for (Thing get : this.list) {
            weight += get.getWeight();
        }
        return weight;
    }
    
    public void printThings () {
        for (Thing get : this.list) {
            System.out.println(get);
        }
    }
    
    public Thing heaviestThing() {
        int help = 0;
        int get = 0;
        for(int i = 0; i < this.list.size(); i++) {
            if(this.list.get(i).getWeight() > help) {
                help = this.list.get(i).getWeight();
                get = i;
            }
        }
        if(this.totalThings() == 0) {
            return null;
        }
        return this.list.get(get);
    }
    
    private int totalThings() {
        int things = 0;
        for (Thing get : this.list) {
            things++;
        }
        return things;
    }
}
