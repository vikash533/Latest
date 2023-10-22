package StringPacket;

public class EvenLengthWord {
    public static void main(String[] args) {
        String s = "i am GFG";
        String[] words = s.split(" ");
        for (String word:words) {
            if(word.length()%2==0)
                System.out.println(word);
        }
    }
}
