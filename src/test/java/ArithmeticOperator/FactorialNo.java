package ArithmeticOperator;

public class FactorialNo {

    public static void main(String[] args) {
        int fact =1;
        int num=5;
        while (num>0){
            fact = fact*num;
            num--;
        }
        System.out.println("factorrial of num "+fact);
    }
}
