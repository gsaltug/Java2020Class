package day30_ArrayListP;

import java.util.ArrayList;

public class ArrayListMethods {
    public static void main(String[] args) {
        ArrayList<Integer>list1 = new ArrayList<>();
        list1.add(5);
        list1.add(7);
        list1.add(8);

      //  list1.add(6);//[5, 7, 8, 6]
        list1.add(1, 6);
    /*
    list1.add(7, 10);//OutOfBounds
PROVIDE ONLY VALID INDEX NUMBER
*/
        System.out.println(list1);//[5, 6, 7, 8] placed 6 in index 1

        //set();

        int[] arr = {1, 2, 3, 4};
        //change 4 to 5
        arr[3]=5;

        list1.set(3, 9);

        System.out.println(list1);//[5, 6, 7, 9]

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("A");
        list2.add("B");
        list2.add(1, "C");
        list2.add(1, "D");

        System.out.println(list2);//[A, D, C, B]

        list2.set(2, "E");
        list2.set(3, "F");
        System.out.println(list2); //[A, D, E, F]



    }
}
