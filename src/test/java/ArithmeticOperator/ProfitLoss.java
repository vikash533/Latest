package ArithmeticOperator;

import java.util.Scanner;

public class ProfitLoss {
    public static void main(String[] args) {
        System.out.println("Enter the cost price");
        Scanner sc = new Scanner(System.in);
        int cp =sc.nextInt();
        System.out.println("Enter the selling price");
        int sp = sc.nextInt();
        if(cp>sp)
        {
            int loss =cp-sp;
            System.out.println("loss is : "+loss);
        }
        else
        {
            int profit =sp-cp;
            System.out.println("profit is :"+profit);
        }
    }
}
