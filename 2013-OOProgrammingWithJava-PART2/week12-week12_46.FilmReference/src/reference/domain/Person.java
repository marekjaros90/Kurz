
package reference.domain;

public class Person {
    private String name;
    
    public Person(String name) {
        this.name = name;
    }
    
    public String getName() {
        return this.name;
    }
    
    @Override
    public String toString() {
        return this.name;
    }
    
    @Override
    public int hashCode() {
        if(this.name == null) {
            return 7;
        }
        return this.name.hashCode();
    }
    
    @Override
    public boolean equals(Object obj) {
        if(obj == null) {
            return false;
        }
        
        if(obj.getClass() != this.getClass()) {
            return false;
        }
        
        Person person = (Person) obj;
        
        if(!person.getName().equals(this.name)) {
            return false;
        }
        
        return true;
    }
}
