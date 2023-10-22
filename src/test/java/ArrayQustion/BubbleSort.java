package ArrayQustion;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int a [] ={8,3,12,1,4,2};
        int temp=0;
        for (int i = 0; i <a.length; i++) {
            for (int j = 0; j <a.length-i-1; j++) {
                if(a[j]>a[j+1]){
                    temp=a[j+1];
                    a[j+1]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println(a[1]);
    }

}
