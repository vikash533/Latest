package ArithmeticOperator;

public class SumOfDigtis {
    public static void main(String[] args) {
        int n =123456 ;
        int r;
        int sum =0;
        while (n>0){
            r=n%10;
            n=n/10;
            sum +=r;
        }
        System.out.println(sum);
    }
}
