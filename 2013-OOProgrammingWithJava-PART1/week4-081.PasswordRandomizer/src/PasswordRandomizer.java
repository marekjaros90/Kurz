import java.util.Random;

public class PasswordRandomizer {
    private Random random = new Random();
    private int lenght;
    // Define the variables

    public PasswordRandomizer(int length) {
        // Initialize the variable
        this.lenght = length;
    }

    public String createPassword() {
        // write code that returns a randomized password
        int i = 0;
        String pass = "";
        while (i < this.lenght) {
            int number = this.random.nextInt(26);
            char symbol = "abcdefghijklmnopqrstuvwxyz".charAt(number);
            pass += symbol;
            i++;
        }

        return pass;
    }
}
