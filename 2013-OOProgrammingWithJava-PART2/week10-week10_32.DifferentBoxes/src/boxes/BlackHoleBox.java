package boxes;

import java.util.*;

public class BlackHoleBox extends Box {
    private List<Thing> inTheBox = new ArrayList<Thing>();

    @Override
    public void add(Thing thing) {
        inTheBox.add(thing);
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        return false;
    }
    
}
