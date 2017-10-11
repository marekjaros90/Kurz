
package reader.criteria;

public class AtLeastOne implements Criterion {
    private Criterion[] criterion;
    
    public AtLeastOne(Criterion... criteria) {
        this.criterion = criteria;
    }
    
    @Override
    public boolean complies(String line) {
        for(int i = 0; i < this.criterion.length; i++) {
            if(this.criterion[i].complies(line)) {
                return true;
            }
        }
        
        return false;
    }
    
}
