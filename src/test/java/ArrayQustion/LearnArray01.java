package ArrayQustion;

public class LearnArray01 {
    public static void main(String[] args) {
        int x = 25;
        int[] a = {1, 8, 3, 25, 87, 25};
        System.out.println(search(x, a));
    }

    private static int search(int x, int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (x == a[i])
                return i;

        }
        return -1;


    }
}
