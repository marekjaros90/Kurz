
public class Calculator {
    private int output;
    
    public Calculator() {
        this.output = 0;
    }
    
    public void plus(int value) {
        this.output += value;
    }
    
    public void minus(int value) {
       this.output -= value;
    }
    
    public void Z () {
        this.output = 0;
    }
    
    public int getValue() {
        return this.output;
    }
}
