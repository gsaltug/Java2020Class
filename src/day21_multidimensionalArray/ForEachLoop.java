package day21_multidimensionalArray;

import java.util.Arrays;

public class ForEachLoop {
    public static void main(String[] args) {
        //for each loop that's already been iterated.

        //for(DataType variableName : ArrayName){
        //}
        int[] nums = {1, 2, 3, 4};

        for (int each : nums) {//it will be executed depends on the length of the data structure//4
            System.out.println(each); //1 2 3 4

        }
        String[] students = {"gozde", "Nur", "Lina"};

        for (String each : students) {

            System.out.print(each + " "); //gozde Nur Lina
        }
        //if each is less than 5 we will skip
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Arrays.sort(arr1);
        for (int each : arr1) {
            if (each < 5) {
                continue;
            }
            System.out.print(each); //56789
        }
//you can not reverse since for each loop always 0

        System.out.println("==========================");
        String sentence = "I like Java";

        String words[] = sentence.split(" ");//[I, like, Java]

       // for (String eachword : words){//0-2

       // } we can not use for this task

        for(int i= words.length-1; i>=0; i--){
            System.out.println(words[i]); //Java like I


        }
    }
}