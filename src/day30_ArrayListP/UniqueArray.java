package day30_ArrayListP;

import java.util.ArrayList;

public class UniqueArray {
    /*
    3. write a program that can print out the unique elements from an int array
		   HINT: store all the unqie elemenbts of array into a list of integers
		   Ex: array==> {1,1,2,3,3,4,5}
		   	   output: {2,4,5}

     */

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(1);
        list.add(3);

        ArrayList<Integer> uniques = new ArrayList<>();

        for (int i=0; i<3; i++){

            int count =0;
            for(Integer each : list){
                if(each==list.get(i)){
                    count++;

                }
            }
            if(count ==1){
                uniques.add(list.get(i));
            }
        }

        //list.get(0)->i
        System.out.println(list);
        System.out.println(uniques);

        /*
        for (Integer each2 : list){

            int count =0;
            for(Integer each : list){
                if(each==each2){
                    count++;

                }
                if(count ==1){
                uniques.add(each2);
            }
         */


    }


}
