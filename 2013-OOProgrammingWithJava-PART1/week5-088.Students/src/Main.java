
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write here the main program
        Scanner reader = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<Student>();

        while (true) {
            System.out.print("name: ");
            String name = reader.nextLine();
            if (name.isEmpty()) {
                break;
            }
            System.out.print("student number: ");
            String studentNumber = reader.nextLine();
            list.add(new Student(name, studentNumber));
        }

        System.out.println("");

        for (Student get : list) {
            System.out.println(get);
        }

        System.out.print("Give search term: ");
        String searched = reader.nextLine();
        System.out.println("Result: ");

        for (Student result : list) {
            if (result.getName().contains(searched)) {
                System.out.println(result);
            }
        }
    }
}
