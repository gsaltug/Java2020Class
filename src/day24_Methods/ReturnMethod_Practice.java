package day24_Methods;

import java.util.Arrays;

public class ReturnMethod_Practice {
//create a function that return max number

    public static void main(String[] args) {
        int []arr ={9,8,100,2220,50,40};
    int max = maxNumber(arr);
        System.out.println(max);


    }



    public static int maxNumber (int[]arr){
        Arrays.sort(arr);

        return arr[arr.length-1];
    }

}
