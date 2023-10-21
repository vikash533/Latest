package ArithmeticOperator;

import java.util.Scanner;

public class SumOfSeries {
    public static void main(String[] args) {
        System.out.println("enter the value of n");
        Scanner sc = new Scanner(System.in);
        int series =0;
        int n =sc.nextInt();
        for (int i = 1; i <n; i++) {
            if(i%2==0){
                series -=i;
            }
            else
                series +=i;
        }
        System.out.println("sum of series "+series);
    }
}
