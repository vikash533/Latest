package StringPacket;

import java.util.Arrays;

public class AnagramOfString {
    public static void main(String[] args) {
        String str ="listin";
        String str1 ="silent";
        char[] charArr1 = str.toCharArray();
        char[] charArr2 = str1.toCharArray();
        boolean flag = isAnagram(charArr1, charArr2);
        if(flag==true)
            System.out.println("String is anagram");
        else System.out.println("String is not an anagram");
}

    private static boolean isAnagram(char[] charArr1, char[] charArr2) {
        if(charArr1.length!=charArr2.length) {
            return false;
        }
        Arrays.sort(charArr1);
        Arrays.sort(charArr2);
        for (int i = 0; i <charArr1.length; i++) {
            if(charArr1[i]!=charArr2[i])
                return false;
        }

       return true;
    }
}
