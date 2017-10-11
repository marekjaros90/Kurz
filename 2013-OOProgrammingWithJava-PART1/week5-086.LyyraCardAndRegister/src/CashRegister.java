
public class CashRegister {

    private double cashInRegister;
    private int economicalSold;
    private int gourmetSold;

    public CashRegister() {
        // at start the register has 1000 euros
        this.cashInRegister = 1000;
        this.economicalSold = 0;
        this.gourmetSold = 0;
    }

    public double payEconomical(double cashGiven) {
        // price of the economical lunch is 2.50 euros
        // if the given cash is at least the price of the lunch:
        //    the price of lunch is added to register
        //    the amount of sold lunch is incremented by one
        //    method returns cashGiven - lunch price 
        // if not enough money given, all is returned and nothing else happens
        double price = 2.5;
        if (cashGiven >= price) {
            this.economicalSold++;
            this.cashInRegister += price;
            return cashGiven - price;
        } else {
            return cashGiven;
        }

    }

    public double payGourmet(double cashGiven) {
        // price of the gourmet lunch is 4.00 euros
        // if the given cash is at least the price of the lunch:
        //    the price of lunch is added to register
        //    the amount of sold lunch is incremented by one
        //    method returns cashGiven - lunch price 
        // if not enough money given, all is returned and nothing else happens
        double price = 4.00;
        if (cashGiven >= price) {
            this.gourmetSold++;
            this.cashInRegister += price;
            return cashGiven - price;
        } else {
            return cashGiven;
        }

    }

    public boolean payEconomical(LyyraCard card) {
        double price = 2.5;
        if (card.balance() >= price) {
            this.economicalSold++;
            card.loadMoney(-price);
            return true;
        } else {
            return false;
        }
    }

    public boolean payGourmet(LyyraCard card) {
        double price = 4.00;
        if (card.balance() >= price) {
            this.gourmetSold++;
            card.loadMoney(-price);
            return true;
        } else {
            return false;
        }
    }

    public void loadMoneyToCard(LyyraCard card, double sum) {
        if (sum > 0) {
            this.cashInRegister += sum;
            card.loadMoney(sum);
        }
    }

    @Override
    public String toString() {
        return "money in register " + cashInRegister + " economical lunches sold: " + economicalSold + " gourmet lunches sold: " + gourmetSold;
    }
}
