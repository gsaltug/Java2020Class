package day24_Methods;

import java.util.Arrays;

public class Return_MaxNumber {
    public static void main(String[] args) {
        int arr [] ={9,8,7,5,64};
        int max =maxNumber(arr);

        System.out.println(max);//64

      int min=  minNumber(arr);
        System.out.println(min);//5

    }

    //Return max number from the int Array.
    public static int maxNumber (int [] arr){
        Arrays.sort(arr);
        return arr[arr.length-1];
    }

    public static int minNumber (int[] arr){
        Arrays.sort(arr);
        return arr[0];
    }
}
