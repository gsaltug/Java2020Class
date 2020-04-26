package day07_ifstatements;

public class votewarmup {
    public static void main(String[] args) {

       int age = 16;
       boolean citizen = true;


       boolean eligible = age >= 18 && citizen == true;

       if(eligible){
           System.out.println("You're eligible to vote");
       }
       if(!eligible){
           System.out.println("You're not eligible to vote");
       }






    }
}
/* write a java program that can identify if a person is eligible to vote for Donald Trump.

 */