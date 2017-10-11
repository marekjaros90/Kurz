
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write testcode here
        int[] values = {8, 3, 7, 9, 1, 2, 4};
        sort(values);
    }

    public static int smallest(int[] array) {
        int help = array[0];
        for (int number : array) {
            if (number < help) {
                help = number;
            }
        }
        return help;
    }

    public static int indexOfTheSmallest(int[] array) {
        int a = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == smallest(array)) {
                a = i;
            }
        }
        return a;
    }

    public static int indexOfTheSmallestStartingFrom(int[] array, int index) {
        int help = index;
        for (int i = index; i < array.length; i++) {
            if (array[i]<array[help]) {
                help = i;
            }
        }
        return help;
    }

    public static void swap(int[] array, int index1, int index2) {
        int help1 = array[index1];
        int help2 = array[index2];

        array[index1] = help2;
        array[index2] = help1;
    }

    public static void sort(int[] array) {
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            swap(array, i, indexOfTheSmallestStartingFrom(array, i));
            System.out.println(Arrays.toString(array));
        }
    }
}
