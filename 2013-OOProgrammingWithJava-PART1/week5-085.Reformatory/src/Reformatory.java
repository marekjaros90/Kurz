public class Reformatory {
    private int mes;
    
    public Reformatory () {
        this.mes=0;
    }
    
    public int weight(Person person) {
        // return the weight of the person
        this.mes++;
        return person.getWeight();
    }
    
    public void feed(Person person) {
        person.setWeight(person.getWeight()+1);
    }
    
    public int totalWeightsMeasured() {
        return mes;
    }

}
