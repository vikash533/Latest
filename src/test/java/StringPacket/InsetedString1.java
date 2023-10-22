package StringPacket;

public class InsetedString1 {
    public static void main(String[] args) {
        String originalString = "GeeksGeeks";
        String stringToBeInserted = "For";
        String str2 = null;
        int index = 4;
        String newString = new String();
        for (int i = 0; i <originalString.length(); i++) {
            newString +=originalString.charAt(i);
            if(i==index){
                 str2 = newString.concat(stringToBeInserted);
            }
            str2 +=originalString.charAt(i);
        }
        System.out.println(str2);

    }
}
