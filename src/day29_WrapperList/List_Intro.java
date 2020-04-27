package day29_WrapperList;
import java.util.ArrayList;
public class List_Intro {
    public static void main(String[] args) {

       //ArrayList only accepts objects mot primitives
      // ArrayList<Integer>scores = new ArrayList<Integer>(); //second Integer (object) is optional
       ArrayList<Integer>scores = new ArrayList<>();//size 0; add 5 size 5 remove 2 size 3

       int [] arr = new int[3]; //maz size is 3

        //Size of the arrayList is dynamic, first 10, auto adjusted everytime

      //REMOVE from ArrayList

        scores.add(10); //autoboxing  size=1
        scores.add(20);//autoboxing  size=2
        scores.add(30); //autoboxing  size=3

        System.out.println(scores); //[10], then [10, 20], then [10, 20, 30]

        //get(index): gets the object in the given index

        Integer a1 = scores.get(2);//none boxing

        int a2 = scores.get(1);//unboxing
        double a3 = scores.get(0);//unboxing

        System.out.println(a1);//30
        System.out.println(a2);//20
        System.out.println(a3);//10.0

        System.out.println(scores.get(100));//error-IndexOutOfBounds




    }
}
