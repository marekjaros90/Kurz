
import java.util.Calendar;

public class Person {

    private String name;
    private MyDate birthday;
    private final MyDate today = new MyDate(Calendar.getInstance().get(Calendar.DATE), Calendar.getInstance().get(Calendar.MONTH) + 1, Calendar.getInstance().get(Calendar.YEAR));

    public Person(String name, int pp, int kk, int vv) {
        this.name = name;
        this.birthday = new MyDate(pp, kk, vv);
    }
    
    public Person(String name, MyDate birthday) {
        this.name = name;
        this.birthday = birthday;
    }
    
    public Person(String name) {
        this.name = name;
        this.birthday = this.today;
    }

    public int age() {
        // calculate the age based on the birthday and the current day
        // you get the current day as follows: 
        // Calendar.getInstance().get(Calendar.DATE);
        // Calendar.getInstance().get(Calendar.MONTH) + 1; // January is 0 so we add one
        // Calendar.getInstance().get(Calendar.YEAR);
        return this.birthday.differneceInYears(this.today);
    }

    public boolean olderThan(Person compared) {
        // compare the ages based on birthdays
        if (this.birthday.getYear() < compared.birthday.getYear()) {
            return true;
        }
        if (this.birthday.getYear() == compared.birthday.getYear() && this.birthday.getMonth() < compared.birthday.getMonth()) {
            return true;
        } else if (this.birthday.getMonth() == compared.birthday.getMonth() && this.birthday.getDay() < compared.birthday.getDay()) {
            return true;
        }
        return false;
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        return this.name + ", born " + this.birthday;
    }
}
