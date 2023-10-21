package ArithmeticOperator;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        System.out.println("enter the year");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if(year%4==0 && year%100!=0 && year%400==0)
            System.out.println("The given year is leap year");
    }
}