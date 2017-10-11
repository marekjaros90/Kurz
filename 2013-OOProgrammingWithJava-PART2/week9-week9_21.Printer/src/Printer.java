import java.util.*;
import java.io.*;


public class Printer {
    private String fileName;
    
    public Printer(String fileName) {
        this.fileName = fileName;
    }
    
    public void printLinesWhichContain(String word)throws Exception {
        File file = new File(this.fileName);
        Scanner reader = new Scanner(file);
        while(reader.hasNextLine()) {
            String line = reader.nextLine();
            if(line.contains(word)) {
                System.out.println(line);
            }
        }
        reader.close();
    }
}
