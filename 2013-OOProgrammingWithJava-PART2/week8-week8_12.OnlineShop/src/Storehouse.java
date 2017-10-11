
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.*;

public class Storehouse {

    private Map<String, Integer> prices = new HashMap<String, Integer>();
    private Map<String, Integer> stock = new HashMap<String, Integer>();

    public void addProduct(String product, int price, int stock) {
        this.prices.put(product, price);
        this.stock.put(product, stock);
    }

    public int price(String product) {
        if (this.prices.containsKey(product)) {
            return this.prices.get(product);
        }
        return -99;
    }

    public int stock(String product) {
        if (this.stock.containsKey(product)) {
            return this.stock.get(product);
        } else {
            return 0;
        }
    }

    public boolean take(String product) {
        if (this.stock.containsKey(product)) {
            int a = this.stock.get(product) - 1;
            if (this.stock(product) > 0) {
                this.stock.put(product, a);
                return true;
            }
            
        }
        return false;
    }
    
    public Set<String> products() {
        Set<String> set = new HashSet<String>();
        for(String key : this.prices.keySet()) {
            set.add(key);
        }
        return set;
    }

}
