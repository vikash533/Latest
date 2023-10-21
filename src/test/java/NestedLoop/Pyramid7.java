package NestedLoop;

public class Pyramid7 {
    public static void main(String[] args) {
        for (int i = 1; i <=9; i++) {
            for (int j = i; j <=8; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }
}
