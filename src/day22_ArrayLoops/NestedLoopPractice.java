package day22_ArrayLoops;

public class NestedLoopPractice {
    public static void main(String[] args) {

        int[][] numbers = {
                {1,2,3},
                {4,5,6,7,8,9},
                {10,11,12,13,14},
                {15,16,17,18,19,20,21}
        };

int countOdd=0;
        for(int k=0; k<numbers.length;k++){
            for (int i=0; i<numbers[k].length;i++){
                int num=numbers[k][i];
                if(num% 2 ==0){
                    System.out.println(num+" ");
                }else{
                countOdd++;
                }


            }
        }
        System.out.println();
        System.out.println(countOdd);


//print all even numbers in the same line.
        //count odd numbers==>return tthe total odd num

    }
}
