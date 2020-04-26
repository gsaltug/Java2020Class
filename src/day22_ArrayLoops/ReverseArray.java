package day22_ArrayLoops;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};

        for(int i =arr.length-1; i>=0;i--){
           int eachnum= arr[i];
            System.out.println(eachnum); //5,4,3,2,1 in different lines


        }
        System.out.println("======");

        int [] RevArr = new int [arr.length];// [0,0,0,0,0]

        int j = arr.length-1;
        for (int y=0; y<arr.length; y++){
            RevArr[y]=arr[j]; //index will be placed instead of the original.
            j--;//and then will decrease.
        }
        System.out.println(Arrays.toString(RevArr));//[5, 4, 3, 2, 1]
    }
}
