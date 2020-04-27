package day29_WrapperList;

import java.util.Arrays;

public class WrapperClass_Practice {
    public static void main(String[] args) {


        double [] arr1= {1,2,3.5};

        double max = Double.MIN_VALUE;
        for (double each : arr1){
            if(each>max){
                max=each;
            }

        }
        System.out.println(max);//3.5
        System.out.println("=====================");

        String[] arr = {"1","2.5", "3", "3.5", "4.5"};

        double [] numbers = new double [arr.length];

        for(int i =0; i<arr.length; i++){
            numbers [i] = Double.parseDouble(arr[i]);
        }

        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        System.out.println(numbers[numbers.length-1]);//4.5




    }


}
