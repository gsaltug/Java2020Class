package day19_LoopArray;

public class ArraysPractice2 {
    public static void main(String[] args) {

        int [] arr= {10,20,30};

        System.out.println(arr.length);//3 elements.

        int[] arrm=new int[5];//this area can have 5 value.
        System.out.println(arrm[0]);//default value will be given, as 0.
//int, byte, short, long ==>default=0

     String[]testers = new String[3];

     //store 3 names into this array.
       testers [0] ="Reem";

       testers [2] ="Osman";

        System.out.println(testers[0]+ testers[1]+ testers[2]);//ReemnullOsman

        System.out.println(testers.length);//3


    }
}
