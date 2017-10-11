
package movable;

import java.util.*;


public class Group implements Movable {
    private List<Movable> list = new ArrayList<Movable>();
    
    public String toString() {
        String string = "";
        for(Movable organism : list) {
            string += organism + "\n";
        }
        return string;
    }
    
    public void addToGroup(Movable movable) {
        list.add(movable);
    }
    
    @Override
    public void move(int dx, int dy) {
        for(Movable organism : list) {
            organism.move(dx, dy);
        }
    }
    
}
