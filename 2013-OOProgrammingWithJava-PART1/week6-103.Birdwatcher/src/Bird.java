
public class Bird {
    private String name;
    private String latin;
    private int observation;
    
    public Bird(String name, String latin) {
        this.name = name;
        this.latin = latin;
        this.observation = 0;
    }
    
    public String getName() {
        return this.name;
    }
    
    public String getLatin() {
        return this.latin;
    }
    
    public int getObservation() {
        return this.observation;
    }
    
    public String toString() {
        return this.name + " (" + this.latin + ")";
    }
    
    public void addObservation() {
        this.observation++;
    }
    
}
