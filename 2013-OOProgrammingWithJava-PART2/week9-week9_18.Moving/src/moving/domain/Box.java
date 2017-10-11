package moving.domain;

import java.util.List;
import java.util.ArrayList;

public class Box implements Thing {

    private int maxCapacity;
    private List<Thing> thingsInBox;

    public Box(int maxCapacity) {
        this.maxCapacity = maxCapacity;
        this.thingsInBox = new ArrayList<Thing>();
    }

    public boolean addThing(Thing thing) {
        if (this.getVolume() + thing.getVolume() <= this.maxCapacity) {
            this.thingsInBox.add(thing);
            return true;
        }
        return false;
    }

    public int getVolume() {
        int volume = 0;
        for (Thing thing : this.thingsInBox) {
            volume += thing.getVolume();
        }
        return volume;
    }
}
