import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;
    
    public Library() {
        this.books = new ArrayList<Book>();
    }
    
    public void addBook(Book newBook) {
        this.books.add(newBook);
    }
    
    public void printBooks() {
        for(Book print : books) {
            System.out.println(print);
        }
    }
    
    public ArrayList<Book> searchByTitle(String title) {
        ArrayList<Book> found = new ArrayList<Book>();
        for(Book toSearch : books) {
            if (StringUtils.included(toSearch.title(), title)) {
                found.add(toSearch);
            }
        }
        return found;
    }
    
    public ArrayList<Book> searchByPublisher(String publisher) {
        ArrayList<Book> found = new ArrayList<Book>();
        for(Book toSearch : books) {
            if (StringUtils.included(toSearch.publisher(), publisher)) {
                found.add(toSearch);
            }
        }
        return found;
    }
    
    public ArrayList<Book> searchByYear(int year) {
        ArrayList<Book> found = new ArrayList<Book>();
        for(Book toSearch : books) {
            if (toSearch.year() == year) {
                found.add(toSearch);
            }
        }
        return found;
    }
    
    

}
