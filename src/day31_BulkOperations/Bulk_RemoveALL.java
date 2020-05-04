package day31_BulkOperations;

import java.util.ArrayList;
import java.util.Arrays;

public class Bulk_RemoveALL {
    public static void main(String[] args) {
        //Removes all the matching object

        ArrayList<Integer> list = new ArrayList< >(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 3, 3, 3));
        System.out.println(list);

        list.removeAll(Arrays.asList(3,1,5,8));
        System.out.println(list); //[2, 4, 6, 7]

        Integer [] arr = {3,1,5};
        list.removeAll(Arrays.asList(arr));
        System.out.println(list);//[2, 4, 6, 7]

        String [] names = {"Lina", "Lina", "Cherry"};

        ArrayList<String> namelist = new ArrayList<>(Arrays.asList(names));
        System.out.println(namelist);

        namelist.removeAll(Arrays.asList("Lina"));//[Lina, Lina, Cherry]
        System.out.println(namelist);//[Cherry]



    }
}
