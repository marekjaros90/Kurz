
public class Smileys {

    public static void main(String[] args) {
        // Test your method at least with the following
        printWithSmileys("Method");
        printWithSmileys("Beerbottle");
        printWithSmileys("Interface");
    }

    private static void printWithSmileys(String word) {
        int lenght = word.length();
        if (lenght % 2 == 0) {
            for (int i = 0; i < (word.length() + 6) / 2; i++) {
                System.out.print(":)");
            }
            System.out.println("");
            System.out.println(":) " + word + " :)");
            for (int i = 0; i < (word.length() + 6) / 2; i++) {
                System.out.print(":)");
            }
        } else {
            for (int i = 0; i < (word.length() + 7) / 2; i++) {
                System.out.print(":)");
            }
            System.out.println("");
            System.out.println(":) " + word + "  :)");
            for (int i = 0; i < (word.length() + 7) / 2; i++) {
                System.out.print(":)");
            }
        }
        System.out.println("");
    }
}
