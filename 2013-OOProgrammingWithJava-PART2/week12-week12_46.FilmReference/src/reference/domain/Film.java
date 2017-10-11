
package reference.domain;

public class Film {
    private String name;
    
    public Film(String name) {
        this.name = name;
    }
    
    public String getName() {
        return this.name;
    }

    public String toString() {
        return this.name;
    }
    
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
        
        if(this.getClass() != obj.getClass()) {
            return false;
        }
        
        Film film = (Film) obj;
        
        if(!film.getName().equals(this.name)) {
            return false;
        }
        
        return true;
    }
    
    
}
