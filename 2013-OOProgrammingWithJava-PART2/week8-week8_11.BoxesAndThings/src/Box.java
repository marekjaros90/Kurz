import java.util.ArrayList;

public class Box implements ToBeStored {
    private double maxWeight;
    private int sumOfThings;
    private ArrayList<ToBeStored> box;
    
    public Box(double maxWeight) {
        this.maxWeight = maxWeight;
        this.box = new ArrayList<ToBeStored>();
        this.sumOfThings = 0;
    }
    
    public void add(ToBeStored added) {
        if(this.weight() + added.weight() <= this.maxWeight){
            this.box.add(added);
            this.sumOfThings++;
        }
    }
    
    public double weight() {
        double weight = 0;
        for (ToBeStored thing : this.box) {
            weight += thing.weight();
        }
        return weight;
    }
    
    @Override
    public String toString() {
        return "Box: " + this.sumOfThings + " things, total weight " + this.weight() + " kg";
    }
}
