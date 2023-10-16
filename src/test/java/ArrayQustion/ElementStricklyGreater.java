package ArrayQustion;

public class ElementStricklyGreater {
    public static void main(String[] args) {
        int x = 5;
        int count = 0;
        int[] a = {12, 15, 13, 5, 6, 2, 3, 25};
        for (int i = 0; i < a.length; i++) {
            if (a[i] > x)
                count++;
        }
        System.out.println(count);
    }
}
