import java.util.HashMap;
import java.util.ArrayList;

public class Dictionary {
    private HashMap<String, String> words = new HashMap<String, String>();
    
    public String translate(String word) {
        if(this.words.containsKey(word)) {
            return this.words.get(word);
        }
        
        return null;
    }
    
    public void add(String word, String translation) {
        this.words.put(word, translation);
    }
    
    public int amountOfWords() {
        return this.translationList().size();
    }
    
    public ArrayList<String> translationList() {
        ArrayList<String> list = new ArrayList<String>();
        for(String key : this.words.keySet()) {
            list.add(key + " = " + this.words.get(key));
        }
        return list;
    }
}
