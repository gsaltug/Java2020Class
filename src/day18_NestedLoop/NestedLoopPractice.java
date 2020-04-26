package day18_NestedLoop;

public class NestedLoopPractice {
    public static void main(String[] args) {

        //===========
        for (int z=1;z<10;z++){

            for (int t=1;t<=5;t++){//1,2,3,4,5
                System.out.print(t);
            }
            System.out.println();
        }//in order to break the line, put empty print statement.

        for (int i=1;i<10;i++){
            for (int y=1;y<=5;y++){//1,2,3,4,5
                System.out.print(y);
            }

        }//1-5 repeated 10 times by this outer loop depending on the condition of outer loop.


    }


}
