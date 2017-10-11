package containers;

public class ProductContainerRecorder extends ProductContainer {
    private ContainerHistory history;
    
    public ProductContainerRecorder(String productName, double capacity, double initialVolume) {
        super(productName, capacity);
        this.history = new ContainerHistory();
        super.addToTheContainer(initialVolume);
        history.add(initialVolume);
    }
    
    public String history() {
        return history.toString();
    }
    
    public void printAnalysis() {
        System.out.println("Product: " + super.getName());
        System.out.println("History: " + this.history());
        System.out.println("Greatest product amount: " + history.maxValue());
        System.out.println("Smallest product amount: " + history.minValue());
        System.out.println("Average: " + history.average());
        System.out.println("Greatest change: " + history.greatestFluctuation());
        System.out.println("Variance: " + history.variance());
    }
    
    @Override
    public void addToTheContainer(double amnount) {
        super.addToTheContainer(amnount);
        history.add(super.getVolume());
    }
    
    @Override
    public double takeFromTheContainer(double amount) {
        double volume = super.getVolume();
        
        super.takeFromTheContainer(amount);
        history.add(super.getVolume());
        
        if(amount > super.getVolume()) {
            return volume;
        }
        
        return amount;
    }
}
