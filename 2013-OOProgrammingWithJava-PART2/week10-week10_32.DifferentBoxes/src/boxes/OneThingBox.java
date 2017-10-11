package boxes;

import java.util.*;

public class OneThingBox extends Box{
    private List<Thing> inTheBox = new ArrayList<Thing>();

    @Override
    public void add(Thing thing) {
        if(this.inTheBox.size() == 1) {
            return;
        }
        this.inTheBox.add(thing);
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        return this.inTheBox.contains(thing);
    }
}
