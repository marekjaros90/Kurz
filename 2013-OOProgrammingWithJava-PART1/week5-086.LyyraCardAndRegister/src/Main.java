
public class Main {

    public static void main(String[] args) {
        // write test code here
        CashRegister cafe = new CashRegister();
        
        double change = cafe.payEconomical(10);
        System.out.println("the chnge was " + change);
        
        System.out.println(cafe);
        
    }
}

