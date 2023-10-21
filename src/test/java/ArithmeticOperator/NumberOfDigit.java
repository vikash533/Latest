package ArithmeticOperator;

public class NumberOfDigit {
    public static void main(String[] args) {
        int count =0;
        int n =1234567;
        while (n>0) {
           // int r = n % 10;
            n = n / 10;
            count++;
        }
        System.out.println(count);

    }
}
