package NestedLoop;

public class builder {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("physics");
////        str.append("world");
//        System.out.println(str);
//        str.setCharAt(0,'m');
//        System.out.println(str);
//        str.insert(2,'y');
//        System.out.println(str);
//        str.delete(2,'y');
//        System.out.println(str);
        System.out.println(str);
        str.reverse();
        System.out.println(str);
        str.deleteCharAt(2);
        System.out.println(str);

    }
}
