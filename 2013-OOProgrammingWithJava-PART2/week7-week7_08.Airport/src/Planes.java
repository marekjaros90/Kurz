import java.util.HashMap;
import java.util.ArrayList;
        
public class Planes {
    private HashMap<String, Integer> plane;
    
    public Planes() {
        this.plane = new HashMap<String, Integer>();
    }
    
    public void addPlane(String name, int capacity) {
        this.plane.put(name, capacity);
    }
    
    public String getPlane (String id) {
        if(this.plane.containsKey(id)) {
            String plane = id + " (" + this.plane.get(id) + " ppl)";
            return plane;
        }
        return null;
    }
    
    public ArrayList<String> listOfPlanes() {
        ArrayList<String> list = new ArrayList<String>();
        for(String key : this.plane.keySet()) {
            list.add(key + " (" + this.plane.get(key) + " ppl)");
        }
        return list;
    }
    
    public void printPlanes() {
        ArrayList<String> list = this.listOfPlanes();
        for(String plane : list) {
            System.out.println(plane);
        }
    }
}
