package ArithmeticOperator;

public class RaisePower {
    public static void main(String[] args) {
        int a =2;
        int b=3;
        int ans =1;
        for (int i = 0; i < b; i++) {
            ans *= a;
        }
        System.out.println(ans);
    }
}
