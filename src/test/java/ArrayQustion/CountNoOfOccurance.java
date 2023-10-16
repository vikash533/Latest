package ArrayQustion;

public class CountNoOfOccurance {
    public static void main(String[] args) {
        int count = 0;
        int[] a = {5, 6, 5, 1, 5, 58, 85, 5, 5, 15, 25};
        int x = 5;
        for (int i = 0; i < a.length; i++) {
            if (x == a[i])
                count++;
        }
        System.out.println("no of times x present in an Array " + count);
    }
}
