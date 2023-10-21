package ArithmeticOperator;

import java.util.Scanner;

public class AbsoluteValue {
    public static void main(String[] args) {
        System.out.println("take inter value form user");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num<0){
            num = -1*num;
            System.out.println(num);
        }
        else System.out.println(num);
    }
}
