
import java.util.ArrayList;

public class Menu {

    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<String>();
    }

    public void addMeal (String meal) {
        if (!this.meals.contains(meal)) {
            this.meals.add(meal);
            }
    }
    
    // add the methods here
       
    public void printMeals () {
        for (String toPrint : this.meals) {
            System.out.println(toPrint);
        }
    }
    
    public void clearMenu () {
        this.meals.clear();
    }
}
