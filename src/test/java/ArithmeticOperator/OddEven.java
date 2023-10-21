package ArithmeticOperator;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        System.out.println("take input from user");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int x;
       switch (x=num){

           case 1: System.out.println("Today is monday");
           break;
           case 2: System.out.println("Today is Tuesday");
           break;
           case 3: System.out.println("Today is wednesday");
           break;
           case 4: System.out.println("Today is Thrusday");
           break;
           case 5: System.out.println("Today is Friday");
           break;
           case 6: System.out.println("Today is Saturday");
           break;
           case 7: System.out.println("Today is Sunday");
           break;
           default:
               System.out.println("invalid day no");
               break;
       }

    }
}