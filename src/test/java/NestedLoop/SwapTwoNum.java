package NestedLoop;

import java.util.Scanner;

public class SwapTwoNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number 1");
        int first = sc.nextInt();
        System.out.println("Enter a number 2");
        int second = sc.nextInt();
        System.out.println(first+","+second);
        int third =0;
        third =first;
        first=second;
        second=third;
        System.out.println(first+","+second);
    }
}
