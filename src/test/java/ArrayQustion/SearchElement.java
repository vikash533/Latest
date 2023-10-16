package ArrayQustion;

public class SearchElement {
    public static void main(String[] args) {
        int searchElement = 85;
        int ans = -1;
        int[] a = {1, 5, 88, 85, 75, 100, 85};
        for (int i = 0; i < a.length; i++) {
            if (searchElement == a[i]) {
                ans = i;
                break;
            }
        }
        System.out.println("index of searchElement : " + ans);

    }
}
