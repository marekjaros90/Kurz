package farmsimulator;

import java.util.*;

public class Cow implements Milkable, Alive {

    private Random random = new Random();
    private String name;
    private double capacity;
    private double amount;
    private static final String[] NAMES = new String[]{
        "Anu", "Arpa", "Essi", "Heluna", "Hely",
        "Hento", "Hilke", "Hilsu", "Hymy", "Ihq", "Ilme", "Ilo",
        "Jaana", "Jami", "Jatta", "Laku", "Liekki",
        "Mainikki", "Mella", "Mimmi", "Naatti",
        "Nina", "Nyytti", "Papu", "Pullukka", "Pulu",
        "Rima", "Soma", "Sylkki", "Valpu", "Virpi"};

    public Cow(String name) {
        this.name = name;
        this.capacity = 15 + random.nextInt(26);
        this.amount = 0;
    }

    public Cow() {
        this.name = NAMES[random.nextInt(NAMES.length)];
        this.capacity = 15 + random.nextInt(26);
        this.amount = 0;
    }

    public String getName() {
        return name;
    }

    public double getCapacity() {
        return capacity;
    }

    public double getAmount() {
        return this.amount;
    }
    
    public String toString() {
        return name + " " + getAmount() + "/" + getCapacity();
    }

    @Override
    public double milk() {
        double milked = amount;
        amount = 0;
        return milked;
    }

    @Override
    public void liveHour() {
        amount += Math.ceil(random.nextDouble() + 0.7);
        if(amount > capacity) {
            amount = capacity;
        }
    }
}
