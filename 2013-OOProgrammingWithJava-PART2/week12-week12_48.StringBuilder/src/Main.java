
public class Main {

    public static void main(String[] args) {
        int[] t = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(build(t));
    }

    public static String build(int[] t) {
        StringBuilder build = new StringBuilder();
        build.append("{");

        for (int i = 0; i < t.length; i++) {
            if (i % 4 == 0) {
                build.append("\n ");
            }

            build.append(t[i]);
            if (t.length - 1 != i) {
                build.append(", ");
            }
        }

        build.append("\n}");
        return build.toString();
    }

}
