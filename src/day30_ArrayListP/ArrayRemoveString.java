package day30_ArrayListP;

import java.util.ArrayList;

public class ArrayRemoveString {
    public static void main(String[] args) {
        ArrayList<String>list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        list.remove("B");
        System.out.println(list);//[A, C]

        String str = "C";
        boolean r1 = list.remove(str);
        list.remove(str);



        System.out.println(list);//[A]
        System.out.println(r1); //true
    }
}
