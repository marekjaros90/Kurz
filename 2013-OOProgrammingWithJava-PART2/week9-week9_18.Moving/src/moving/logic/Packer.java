
package moving.logic;

import java.util.*;
import moving.domain.Box;
import moving.domain.Thing;

public class Packer {
    private int boxesVolume;
    
    public Packer(int boxesVolume) {
        this.boxesVolume = boxesVolume;
    }
    
    public List<Box> packThings(List<Thing> things) {
        List<Box> box = new ArrayList<Box>();
        Box b = new Box(this.boxesVolume);
        for(Thing thing : things) {
            if(b.addThing(thing) == true){
                b.addThing(thing);
            } else {
                box.add(b);
                b = new Box(this.boxesVolume);
                b.addThing(thing);
            }
        }
        box.add(b);
        return box;
    }
}
