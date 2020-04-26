package day20ArrayCon;

import java.util.Arrays;

public class ArraySorting {
    public static void main(String[] args) {
        int[]arr ={9,8,7,6,5,4,3,2,1};
        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));//prints ascending order

        System.out.println("First min. number is: " + arr[0]);
        System.out.println("Second min number: " + arr[1]);
        System.out.println("First max number: " + arr[arr.length-1]);
        System.out.println("Second max number: " + arr[arr.length-2]);

        char[] ch = {'Z','D','W','Y','A','B','E','D'};

        Arrays.sort(ch);
        System.out.println(Arrays.toString(ch));//ascending ascii table order.

        String [] names = {"Deniz","Osman","Rustem","Ali"};

        Arrays.sort(names);
        System.out.println(Arrays.toString(names));

        System.out.println("========");
        int[] arr4={3,1,-1,100,-100,200,155};
        //descending order
        Arrays.sort(arr4);

        int[] arrdes = new int [arr4.length];


        int j=0; //last index will be placed index o of this array.


        for (int i= arr4.length-1; i>=0;i--){
            //System.out.print(arr4[i]+" "); //ascending order.
        arrdes[j]=arr[i];

        j++;
        }
        System.out.println(Arrays.toString(arrdes));

    }
}
