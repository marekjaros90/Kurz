
import java.util.ArrayList;

public class Container {

    private int maxWeight;
    private ArrayList<Suitcase> list = new ArrayList<Suitcase>();

    public Container(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public void addSuitcase(Suitcase suitcase) {
        if (this.totalWeight() + suitcase.totalWeight() <= this.maxWeight) {
            this.list.add(suitcase);
        }
    }

    public int totalWeight() {
        int weight = 0;
        for (Suitcase suitcase : this.list) {
            weight += suitcase.totalWeight();
        }
        return weight;
    }

    public int totalSuitcases() {
        int count = 0;
        for (Suitcase suitcase : this.list) {
            count++;
        }
        return count;
    }

    public String toString() {
        return this.totalSuitcases() + " suitcases (" + this.totalWeight() + " kg)";
    }
    
    public void printThings() {
        for (Suitcase suitcase : this.list) {
            suitcase.printThings();
        }
    }

}
