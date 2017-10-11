import java.util.ArrayList;

public class Phonebook {
    private ArrayList<Person> book;
    
    public Phonebook() {
        this.book = new ArrayList<Person>();
    }
    
    public void add(String name, String number) {
        this.book.add(new Person(name, number));
    }
    
    public void printAll() {
        for (Person person : this.book) {
            System.out.println(person);
        }
    }
    
    public String searchNumber(String name) {
        for (Person person :this.book) {
            if (name.equals(person.getName())) {
                return person.getNumber();
            }
        }
        return "number not known";
    }
}
