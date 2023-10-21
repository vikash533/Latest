package NestedLoop;



public class ReverseString {
    public static void main(String[] args) {
        String str = "Tree is good for environment";
        String[] splittedWords = str.split(" ");
        String revWord ="";

        for (String word:splittedWords) {
            for (int i=word.length()-1;i>=0;i--){
               revWord +=word.charAt(i);
            }
            revWord +=" ";
        }
        System.out.println(revWord);


    }
}
