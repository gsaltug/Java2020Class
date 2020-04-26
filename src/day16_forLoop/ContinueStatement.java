package day16_forLoop;

public class ContinueStatement {
    public static void main(String[] args) {
        //Must be used in the loop, skips current iteration.
        for(int i=1 ; i<=5;i++){
           // System.out.println(i);//prints 1 to 5.
            if(i==3){
                continue;
            }
            System.out.println(i);//skips 3 and run till 5.//1,2,4,5.
        }

        for(int i=0; i<=20 ; i++){

          //  if(i%2!=0){
                //continue;//skips all the even numbers..02468 ..
            if(i%2==0){//skips all the even numbers//
                continue;
//if you skip all of them nothing will be printed.
            }
            System.out.print(i+"");//0-20
        }







    }
}
