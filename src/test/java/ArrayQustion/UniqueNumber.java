package ArrayQustion;

public class UniqueNumber {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 2, 1, 3};
        int n = a.length;
        int ans = -1;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] == a[j]) {
                    a[i] = -1;
                    a[j] = -1;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            if (a[i] != -1)
                ans = a[i];
        }
        System.out.println("unique Element is : " + ans);
    }
}
