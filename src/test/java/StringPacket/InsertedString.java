package StringPacket;

public class InsertedString {
    //Given a String, the task is to insert another string in between the given String at a particular specified index in Java.
    public static void main(String[] args) {
        String orignalString = "GeeksGeeks";
        String stringToBeInserted = "For";
        int index= orignalString.indexOf('s');
        System.out.println(index);
        String str1 = new String();
        for (int i = 0; i <orignalString.length(); i++) {
            str1 +=orignalString.charAt(i);
            if(i==index){
                str1 +=stringToBeInserted;
            }
        }
        System.out.println(str1);
    }
}
