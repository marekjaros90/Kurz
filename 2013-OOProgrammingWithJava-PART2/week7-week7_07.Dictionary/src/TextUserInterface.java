
import java.util.Scanner;

public class TextUserInterface {

    private Scanner reader;
    private Dictionary dictionary;

    public TextUserInterface(Scanner reader, Dictionary dictionary) {
        this.reader = reader;
        this.dictionary = dictionary;
    }

    public void start() {
        System.out.println("Statements:");
        System.out.println("   add - adds a word pair to the dictionary");
        System.out.println("   translate - asks a word and prints its translation");
        System.out.println("   quit - quits the text user interface");
        
        while (true) {
            System.out.println("");
            System.out.print("Statement: ");
            String statement = this.reader.nextLine();
            if (statement.equals("quit")) {
                System.out.println("Cheers!");
                break;
            } else if (statement.equals("add")) {
                this.add();
            } else if (statement.equals("translate")) {
                this.translate();
            } else {
                System.out.println("Unknown statement");
            }
        }
    }

    public void add() {
        System.out.print("In Finnish: ");
        String word = this.reader.nextLine();

        System.out.print("Translation: ");
        String translation = this.reader.nextLine();

        this.dictionary.add(word, translation);
    }

    public void translate() {
        System.out.print("Give a word: ");
        String word = this.reader.nextLine();

        System.out.println("Translation: " + this.dictionary.translate(word));
    }
}
