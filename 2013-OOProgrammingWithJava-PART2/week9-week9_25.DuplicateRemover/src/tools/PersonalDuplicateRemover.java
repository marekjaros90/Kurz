
package tools;

import java.util.Set;
import java.util.HashSet;

public class PersonalDuplicateRemover implements DuplicateRemover {
    private Set<String> strings;
    private int duplicates;
    
    public PersonalDuplicateRemover() {
        this.strings = new HashSet<String>();
        this.duplicates = 0;
    }
    
    @Override
    public void add(String characterString) {
        if(!strings.contains(characterString)) {
            strings.add(characterString);
        } else {
            this.duplicates++;
        }
    }

    @Override
    public int getNumberOfDetectedDuplicates() {
        return this.duplicates;
    }

    @Override
    public Set<String> getUniqueCharacterStrings() {
        return this.strings;
    }

    @Override
    public void empty() {
        this.strings.clear();
        this.duplicates = 0;
    }
    
}
