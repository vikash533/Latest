package ArrayQustion;

public class LastOccurance {
    public static void main(String[] args) {
        int lastIndex = -1;
        int x = 5;
        int[] a = {5, 6, 5, 3, 5, 4};
        for (int i = 0; i < a.length; i++) {
            if (x == a[i]) {
                lastIndex = i;

            }
        }
        System.out.println(lastIndex);
    }
}
