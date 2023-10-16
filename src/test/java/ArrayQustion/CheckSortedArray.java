package ArrayQustion;

import java.util.Scanner;

public class CheckSortedArray {
    public static void main(String[] args) {
        System.out.println("Enter the size of Array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the element of Array");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        boolean flag = checkSortArray(a);
        System.out.println(flag);
    }

    public static boolean checkSortArray(int[] x) {
        boolean check = true;
        for (int i = 0; i < x.length - 1; i++) {
            if (x[i] > x[i + 1]) {
                check = false;
                break;
            }

        }
        return check;
    }
}
