package ArithmeticOperator;

import java.util.Scanner;

public class Firstmultipe {
    //print the first multiple of 5 which is also a multiple of 7
    public static void main(String[] args) {
        System.out.println("enter the value of n");
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
//        for (int i = 5; i <n; i++) {
//            if(i%5==0 && i%7==0){
//                System.out.println(i);
//                break;
//            }
//        }
        int i=5;
        while (true){
            if(i%5==0 && i%7==0)
            {
                System.out.println(i);
                break;
            }
            i++;
        }
    }
}
