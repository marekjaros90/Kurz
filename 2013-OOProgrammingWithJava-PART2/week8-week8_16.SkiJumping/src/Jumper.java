import java.util.*;

public class Jumper implements Comparable<Jumper>{
    private String name;
    private int lenght;
    private int[] judges;
    private ArrayList<Integer> jumps;
    private int points;
    
    public Jumper(String name) {
        this.name = name;
        this.lenght = 0;
        this.judges = new int[5];
        this.jumps = new ArrayList<Integer>();
        this.points = 0;
    }
    
    public void setLenght() {
        Random random = new Random();
        this.lenght = random.nextInt(60) + 60;
    }
    
    public void setJudges() {
        Random random = new Random();
        for(int i = 0; i < 5; i++) {
            this.judges[i] = random.nextInt(10) + 10;
        }
    }
    
    public String getName() {
        return this.name;
    }
    
    public int getLenght() {
        return this.lenght;
    }
    
    public int[] getJudges() {
        return this.judges;
    }
    
    public void setPoints() {
        this.points += this.lenght;
        int[] judge = this.judgePoints();
        for(int a : judge) {
            this.points += a;
        }
    }
    
    public int getPoints() {
        return this.points;
    }
    
    public int[] judgePoints() {
        int[] help = this.judges;
        Arrays.sort(help);
        int[] points = {help[1],help[2],help[3]};
        return points;
    }
    
    public void addJump(int jump) {
        jumps.add(jump);
    }
    
    public ArrayList<Integer> getJumps() {
        return this.jumps;
    }
    
    public int compareTo(Jumper jumper) {
        return this.getPoints() - jumper.getPoints();
    }
}
