import java.util.Scanner;

public class Reader {
    private Scanner scn = new Scanner(System.in);
    
    public String readString() {
        String read = scn.nextLine();
        
        return read;
    }
    
    public int readInteger() {
        int read = Integer.parseInt(scn.nextLine());
        
        return read;
    }
}
