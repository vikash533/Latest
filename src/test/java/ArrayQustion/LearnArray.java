package ArrayQustion;

public class LearnArray {
    public static void main(String[] args) {
        int[] a = {1, 5, 3, 8, 9, 18, 98};
        int maxIndex = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[maxIndex] < a[i]) {
                maxIndex = i;
            }
        }
        System.out.println(maxIndex);
        System.out.println("maximum element value is " + a[maxIndex]);
    }
}
