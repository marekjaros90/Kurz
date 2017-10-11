
public class Change {
    private char fromChar;
    private char toChar;
    
    public Change(char fromCharacter, char toCharacter) {
        this.fromChar = fromCharacter;
        this.toChar = toCharacter;
    }
    
    public String change(String characterString) {
        String replaced = "";
        for (int i = 0 ; i < characterString.length(); i++) {
            if(characterString.charAt(i) == this.fromChar) {
                replaced += this.toChar;
            } else {
                replaced += characterString.charAt(i);
            }
        }
        return replaced;
    }
}
