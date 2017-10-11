package boxes;

import java.util.*;

public class MaxWeightBox extends Box {
    private int maxWeight;
    private List<Thing> inTheBox;
    
    public MaxWeightBox(int maxWeight) {
        this.maxWeight = maxWeight;
        this.inTheBox = new ArrayList<Thing>();
    }
    
    public int getWeight() {
        int weight = 0;
        for(Thing thing : this.inTheBox) {
            weight += thing.getWeight();
        }
        return weight;
    }

    @Override
    public void add(Thing thing) {
        if (thing.getWeight() + this.getWeight() > this.maxWeight) {
            return;
        }
        this.inTheBox.add(thing);
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        for(Thing in : this.inTheBox) {
            if(in.equals(thing)) {
                return true;
            }
        }
        return false;
    }
    
}
