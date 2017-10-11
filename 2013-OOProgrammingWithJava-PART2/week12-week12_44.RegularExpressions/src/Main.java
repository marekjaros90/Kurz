
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.print("Give s string: ");
        String string = scn.nextLine();

        if (clockTime(string)) {
            System.out.println("The form is fine.");
        } else {
            System.out.println("The form is wrong.");
        }

    }

    public static boolean isAWeekDay(String string) {
        return string.matches("(mon|tue|wed|thu|fri|sat|sun)");
    }

    public static boolean allVowels(String string) {
        return string.matches("(a|e|i|o|u|ä|ö)*");
    }


    public static boolean clockTime(String string) {
        if (string.charAt(0) == '2' && string.charAt(1) == '4') {
            return false;
        }
        
        return string.matches("([01][0123456789]|2[0123]):[0-5][0-9]:[0-5][0-9]");
    }

}
