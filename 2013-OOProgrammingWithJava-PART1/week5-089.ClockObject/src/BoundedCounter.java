
public class BoundedCounter {
    // copy here the class BoundedCounter from last weeks assignment 78 

    private int value;
    private int upperLimit;
    
    public BoundedCounter (int upperLimit) {
        this.upperLimit = upperLimit;
        this.value = 0;
    }
    
    public void next () {
        this.value ++;
        if (this.value > this.upperLimit) {
            this.value = 0;
        }
    }
    
    @Override
    public String toString () {
        if (this.value < 10) {
            return "0" + this.value;
        }
        return "" + this.value;
    }
    
    public int getValue () {
        return this.value;
    }
    
    public void setValue(int newValue) {
        if (newValue >= 0 && newValue <= this.upperLimit) {
            this.value = newValue;
        }
    }

}