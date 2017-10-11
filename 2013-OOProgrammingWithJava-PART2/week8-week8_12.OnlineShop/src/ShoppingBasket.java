
import java.util.*;

public class ShoppingBasket {

    private List<Purchase> basket = new ArrayList<Purchase>();

    public void add(String product, int price) {
        for (Purchase purchase : this.basket) {
            if (purchase.getProduct().equals(product)) {
                purchase.increaseAmount();
                return;
            }
        }
        this.basket.add(new Purchase(product, 1, price));
    }

    public int price() {
        int price = 0;
        for (Purchase purchase : this.basket) {
            if (purchase.price() > 0) {
                price += purchase.price();
            }
        }
        return price;
    }

    public void print() {
        for (Purchase purchase : this.basket) {
            System.out.println(purchase);
        }
    }
}
