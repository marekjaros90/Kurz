package wordinspection;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class WordInspection {

    private File file;

    public WordInspection(File file) {
        this.file = file;
    }

    public int wordCount() throws Exception {
        return this.readFile().size();
    }

    public List<String> wordsContainingZ() throws Exception {
        List<String> list = new ArrayList<String>();
        for(String str : this.readFile()) {
            if(str.contains("z")) {
                list.add(str);
            }
        }
        return list;
    }

    public List<String> wordsEndingInL(){
        List<String> list = new ArrayList<String>();
        for(String str : this.readFile()) {
            if(str.endsWith("l")) {
                list.add(str);
            }
        }
        return list;
    }
    
    public List<String> palindromes() {
        List<String> list = new ArrayList<String>();
        for(String str : this.readFile()) {
            String pal = "";
            for(int i = str.length() - 1; i >= 0; i--) {
                pal += str.charAt(i);
            }
            if(str.equals(pal)) {
                list.add(str);
            }
        }
        return list;
    }
    
    public List<String> wordsWhichContainAllVowels() {
        List<String> list = new ArrayList<String>();
        for(String str : this.readFile()) {
            if(str.contains("a") && str.contains("e") && str.contains("i") && str.contains("o") && str.contains("u") && str.contains("y") && str.contains("ä") && str.contains("ö")) {
                list.add(str);
            }
        }
        return list;
    }
    
    public List<String> readFile() {
        try {
            List<String> list = new ArrayList<String>();
             Scanner reader = new Scanner(this.file, "UTF-8");
             while(reader.hasNextLine()) {
                 String line = reader.nextLine();
                 list.add(line);
             }
             return list;
        } catch (FileNotFoundException ex) {
            return null;
        }
    }
}
