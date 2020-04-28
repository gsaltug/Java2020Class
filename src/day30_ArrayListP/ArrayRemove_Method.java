package day30_ArrayListP;

import java.util.ArrayList;

public class ArrayRemove_Method{
    public static void main(String[] args) {
        ArrayList<Integer>list3 = new ArrayList<>();
        list3.add(1);
        list3.add(2);
        list3.add(3);
        list3.add(4);

        //remove(int index); or remove(object);

        int a = 1;

        list3.remove(a); //will be removed at given index num
        System.out.println(list3);//[1, 3, 4]

        list3.remove(1);
        System.out.println(list3);//[1, 4]

        Integer b =1;
        list3.remove(b);//given object will be removed
        System.out.println(list3);//[4]

        ArrayList<Integer>list4 =new ArrayList<>();
        list4.add(10);
        list4.add(20);
        list4.add(30);

        list4.remove(1);
        System.out.println(list4);//[10, 30]

Integer a2 = 30;

boolean r1 = list4.remove(a2);

        System.out.println(list4);//[10]
        System.out.println(r1);//true




    }
}
