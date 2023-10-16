package ArrayQustion;

public class TripletSumEqualTagret {
    public static void main(String[] args) {
        int[] a = {1, 4, 5, 6, 3};
        int target = 12;
        int x = sumTriplet(a, target);
        System.out.println(x);
    }

    private static int sumTriplet(int[] a, int target) {
        int ans = 0;
        int n = a.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (a[i] + a[j] + a[k] == target)
                        ans++;
                }
            }
        }
        return ans;
    }
}
