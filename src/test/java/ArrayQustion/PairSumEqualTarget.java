package ArrayQustion;

public class PairSumEqualTarget {
    public static void main(String[] args) {
        int[] a = {4, 6, 3, 5, 8, 2, 4};

        int target = 8;
        int x = pairSum(a, target);
        System.out.println(x);
    }

    private static int pairSum(int[] a, int target) {
        int pair = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] + a[j] == target)
                    pair++;
            }
        }
        return pair;
    }
}
