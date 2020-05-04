package day31_BulkOperations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AddAll {
    public static void main(String[] args) {

        ArrayList<Integer>List1 = new ArrayList<>();
        List1.add(30);
        List1.add(20);
        List1.add(40);

        List1.addAll(Arrays.asList(30, 20, 40, 10, 35, 200));
        System.out.println(List1);
//OR

       //ArrayList does not support primitive
        Integer [] arr = {30, 20, 40, 50, 60};
        List1.addAll(Arrays.asList(arr));
        System.out.println(List1);

        System.out.println("===============");
        String [] names = {"Gozde", "Lina", "Emrah", "Bilgus", "Damla"};

        System.out.println(Arrays.toString(names));

        ArrayList<String> nameList = new ArrayList<>();
        nameList.addAll(Arrays.asList(names));

        nameList.add("Osman");
        nameList.remove("Osman");
        System.out.println(nameList);

        //Convert Array to ArrayList Easier Way
        Integer [] numbers = {1,2,3,4,5,6,7,8,9,10};

        ArrayList<Integer> numlist = new ArrayList<>(Arrays.asList(numbers));//[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]


        System.out.println(numlist);

    }
}
