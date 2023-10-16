package ArrayQustion;

import java.util.Arrays;

public class SmallestAndLargestElement {
    public static void main(String[] args) {
        int[] a = {5, 8, 4, 85};
        int[] x = sortedArrary(a);
        System.out.println(Arrays.toString(x));
    }

    public static int[] sortedArrary(int[] y) {
        Arrays.sort(y);
        int[] x = new int[2];
        x[0] = y[0];
        x[x.length - 1] = y[y.length - 1];
        return x;
    }
}
