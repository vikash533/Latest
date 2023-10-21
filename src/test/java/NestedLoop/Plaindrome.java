package NestedLoop;

import java.util.Scanner;

public class Plaindrome {
    public static void main(String[] args) {
        System.out.println("Enter the string ");
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        String rev ="";
        for (int i = input.length()-1; i >=0; i--) {
            rev +=input.charAt(i);
        }
        System.out.println(rev);
        if(input.equalsIgnoreCase(rev)){
            System.out.println("The given string is plaindrome");
        }
        else System.out.println("not plaindrorme");
    }
}
