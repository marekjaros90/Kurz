
import java.util.Random;

public class NightSky {

    private double density;
    private int width;
    private int heigth;
    private int count;

    public NightSky(double density) {
        this(density, 20, 10);
    }

    public NightSky(int width, int height) {
        this(0.1, width, height);
    }

    public NightSky(double density, int width, int height) {
        this.density = density;
        this.width = width;
        this.heigth = height;
        this.count = 0;
    }

    public void printLine() {
        Random random = new Random();
        for (int i = 0; i < this.width; i++) {
            if (this.density >= random.nextDouble()) {
                System.out.print("*");
                this.count++;
            } else {
                System.out.print(" ");
            }
        }
    }

    public void print() {
        this.count = 0;
        for (int i = 0; i < this.heigth; i++) {
            printLine();
            System.out.println("");
        }
    }
    
    public int starsInLastPrint() {
        return this.count;
    }
}
