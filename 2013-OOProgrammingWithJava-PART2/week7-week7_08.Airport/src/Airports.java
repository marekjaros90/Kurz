import java.util.HashMap;
import java.util.ArrayList;

public class Airports {
    private HashMap<String, String> airports;
    
    public Airports() {
        this.airports = new HashMap<String, String>();
    }
    
    public void add(String departure, String destination) {
        this.airports.put(departure, destination);
    }
    
    public ArrayList<String> listOfAirports() {
        ArrayList<String> list = new ArrayList<String>();
        for(String key : this.airports.keySet()) {
            list.add(this.airports.get(key) + "" + key);
        }
        return list;
    }
    
    public void printAirports() {
        ArrayList<String> list = this.listOfAirports();
        for(String airport : list) {
            System.out.println(airport);
        }
    }
}
