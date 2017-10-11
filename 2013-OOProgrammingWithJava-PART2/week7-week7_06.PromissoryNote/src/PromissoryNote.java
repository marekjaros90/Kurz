
import java.util.HashMap;

public class PromissoryNote {

    private HashMap<String, Double> loans;

    public PromissoryNote() {
        this.loans = new HashMap<String, Double>();
    }

    public void setLoan(String toWhom, double value) {
        this.loans.put(toWhom, value);
    }
    
    public double howMuchIsTheDebt(String name) {
        Double value = this.loans.get(name);
        if(value == null){
            return 0;
        }
        return value;
    }
}
