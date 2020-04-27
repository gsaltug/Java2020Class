package day29_WrapperList;
import java.util.ArrayList;
public class List_Paractice2 {
    public static void main(String[] args) {
        /*
        create a list of integers
        add 5 integers to it
        return the max number from the list

        do not use any sorting
         */

        ArrayList<Integer> list = new ArrayList<>();

        list.add(100);
        list.add(20);
        list.add(300);
        list.add(400);
        list.add(50);

       // int max = Integer.MIN_VALUE;//100,
         int max = list.get(0);
        for (int i =0; i< list.size(); i++){
            if( list.get(i) > max ){
                max= list.get(i);
            }
        }
        System.out.println(max);//400

       // System.out.println(list.size());//5

   int max2 = Integer.MIN_VALUE;

   for( Integer each : list){
       if( each > max2 ){
           max2= each;
       }

   }
        System.out.println(max2); //400

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(100);
        list2.add(200);
        list2.add(300);

        int result = max(list2);
        System.out.println(result); //300

    }

    public static int max(ArrayList<Integer> list){

        int max = list.get(0);
        for (int i =0; i< list.size(); i++){
            if( list.get(i) > max ){
                max= list.get(i);
            }
        }

        return max;

    }
}
