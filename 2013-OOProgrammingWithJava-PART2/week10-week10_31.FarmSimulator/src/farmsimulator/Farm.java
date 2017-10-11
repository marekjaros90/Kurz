
package farmsimulator;

import java.util.*;

public class Farm implements Alive {
    private String owner;
    private Barn barn;
    private List<Cow> cows;
    
    public Farm(String name, Barn barn) {
        this.owner = name;
        this.barn = barn;
        this.cows = new ArrayList<Cow>();
    }
    
    public void addCow(Cow cow) {
        cows.add(cow);
    }
    
    public void installMilkingRobot(MilkingRobot milkingRobot) {
        barn.installMilkingRobot(milkingRobot);
    }
    
    public void manageCows() {
        barn.takeCareOf(cows);
    }
    
    public String getOwner() {
        return owner;
    }
    
    @Override
    public void liveHour() {
        for(Cow cow : cows) {
            cow.liveHour();
        }
    }
    
    public String toString() {
        return "Farm owner: " + owner + "\n" +
                barn.toString() + "\n" + 
                getCows();
    }
    
    public String getCows() {
        if(cows.size() < 1) {
            return "No cows.";
        }
        String str = "Animals:\n";
        for(Cow cow : cows) {
            str += "        " + cow.toString() + "\n";
        }
        return str;
    }
    
}
