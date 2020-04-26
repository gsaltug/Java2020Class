package day22_ArrayLoops;

import java.util.Arrays;

public class EvenForEach {
    public static void main(String[] args) {

        int [] numbers =new int [200];

        for (int i=0; i<numbers.length; i++){
            numbers[i] = i+1;  // assigning 1~ 100
        }

        System.out.println(Arrays.toString(numbers));

        for( int each :  numbers ){
            if( each % 2 !=0 ) {
                continue;
            }

            System.out.print(each + " ");
        }

    }
}
/*
k01:
        1. create an int array called numbers that has length of 100
        2. assign 1~100 to the array' each indexes
        3. use for each loop to rpint out all the even numbers.
                MUst use continue statement
 */