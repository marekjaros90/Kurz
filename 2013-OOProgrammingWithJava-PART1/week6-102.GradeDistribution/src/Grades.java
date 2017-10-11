
public class Grades {

    private int[] grades;

    public Grades() {
        grades = new int[6];
    }

    public void addAScore(int score) {
        if (score < 0 || score > 60) {
            return;
        }

        int theGrade = grade(score);
        grades[theGrade]++;
    }
    
    public void print() {
        System.out.println("Grade distribution:");
        for (int i = 5; i >= 0; i--) {
            System.out.println(i + ": " + stars(grades[i]));
        }
        System.out.println("Acceptance percentage: " + acceptance());
    }

    private String stars(int n) {
        String stars = "";
        for (int i = 0; i < n; i++) {
            stars += "*";
        }
        return stars;
    }

    private int grade(int score) {
        if (score < 30) {
            return 0;
        }
        if (score < 35) {
            return 1;
        }
        if (score < 40) {
            return 2;
        }
        if (score < 45) {
            return 3;
        }
        if (score < 50) {
            return 4;
        }
        return 5;
    }

    private double acceptance() {
        double sum = 0;
        for (int number : grades) {
            sum += number;
        }
        double failed = grades[0];

        return 100 * (sum - failed) / sum;
    }
}
