package ArithmeticOperator;

public class ReverseOfNum {
    public static void main(String[] args) {
        int rev=0;
        int n =2346;
        while (n>0){
            rev=10*rev+n%10;
            n/=10;
        }
        System.out.println("Reverrse of no "+rev);
    }
}
