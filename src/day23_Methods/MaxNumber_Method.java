package day23_Methods;

import java.util.Arrays;

public class MaxNumber_Method {
    public static void MaxNumber(int[] array){

        Arrays.sort(array);  // ascending order
        System.out.println( "Maximum number is: "+ array[ array.length -1] );


    }


    public static void MinNumber(int[] array){

        Arrays.sort(array); // ascending order
        System.out.println("Minimum number is: "+ array[0] );

    }


    public static void Descending(int[] array){ // {100, 200, -100};

        Arrays.sort(array);

        for(int i = array.length-1; i>=0; i-- ){
            System.out.print(array[i] +" ");
        }
        // 3 2 1
        System.out.println();
    }



    public static void main(String[] args) {

        int[] arr = {10, 8, 9, 5, 4, 3, 2, 1};

        //  MaxNumber( 10 );  // 10, if parameter is array, the argument MUST be array

        MaxNumber(arr);

        MinNumber(arr);

        int[] arr2 = {100, 20, 30, 40, 40, -100};
        MaxNumber(arr2);

        MinNumber(arr2);

        Descending(arr2);


    }

}
    /*
    Create a function that can print the max number.
    Create a function that can print the min number.
    create a function that can print the array in descending order.
     */





