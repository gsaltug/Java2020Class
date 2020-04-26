package day21_multidimensionalArray;

import java.util.Arrays;

public class Multi_DimensionalArray {
    public static void main(String[] args) {

        int[] arr ={1,2,3};
        int[][] arr20 ={{1,2,3}, {3,4,5,6,7}};

        int [] arr1D = arr20[1];//[3, 4, 5, 6, 7]

        System.out.println(arr1D.length);//3
        System.out.println(Arrays.toString(arr1D));//[1, 2, 3]

       int num1= arr20 [0][2];
        System.out.println(num1);//3

        char [][] char1D ={{'a','b','c'}, {'j','k'}, {'g','h','i'}};

        char x = char1D [1][0];

        System.out.println(x);//j

        char y[]= char1D [2];
        System.out.println(Arrays.toString(y));//[g, h, i]
    }
}
