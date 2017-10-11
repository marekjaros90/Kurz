package boxes;

public class Thing {

    private String name;
    private int weight;

    public Thing(String name, int weight) {

        this.name = name;
        
        if(weight < 0) {
            throw new IllegalArgumentException("Weight must be positive number");
        }
        this.weight = weight;
    }

    public Thing(String name) {
        this(name, 0);
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }
    
    @Override
    public boolean equals(Object object) {
        if(object == null) {
            return false;
        }
        if(this.getClass() != object.getClass()) {
            return false;
        }
        
        Thing thing = (Thing) object;
        if(this.getName() != thing.getName()) {
            return false;
        }
        
        return true;
    }
    
    @Override
    public int hashCode() {
        if(this.name == null) {
            return 7;
        }
        
        return this.name.hashCode();
    }

}
