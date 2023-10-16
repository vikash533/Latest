package ArrayQustion;

public class SecondMaxAndSeconMin {
    public static int minInt = Integer.MAX_VALUE;
    public static int maxInt = Integer.MIN_VALUE;

    public static void main(String[] args) {
        int[] a = {5, 4, 1, 6, 2};
        int n = a.length;
        int firstmax = findMax(a, n);
        int firstmin = findMin(a, n);
        secondMax(a, n);
        secondMin(a, n);


    }

    private static void secondMin(int[] a, int n) {
        for (int i = 0; i < n; i++) {
            if (a[i] == maxInt) {
                maxInt = Integer.MIN_VALUE;
                break;
            }
        }
    }

    private static void secondMax(int[] a, int n) {
        for (int i = 0; i < n; i++) {
            if (a[i] == minInt) {
                maxInt = Integer.MAX_VALUE;

                break;
            }
        }
    }

    private static int findMin(int[] a, int n) {

        for (int i = 0; i < n; i++) {
            if (a[i] < minInt)
                minInt = a[i];
        }
        //System.out.println(minInt);
        return minInt;

    }

    private static int findMax(int[] a, int n) {

        for (int i = 0; i < n; i++) {
            if (a[i] > maxInt)
                maxInt = a[i];
        }
        //System.out.println(maxInt);
        return maxInt;
    }
}
