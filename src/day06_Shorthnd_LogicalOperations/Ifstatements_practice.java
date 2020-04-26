package day06_Shorthnd_LogicalOperations;

public class Ifstatements_practice {

    public static void main(String[] args) {
        int a = 100;
        int b = 200;

        //identify the greater number
        boolean greaternumber = a > b;
        if(a > b){
            System.out.println(a+"is greater than"+b); //body is false, not got executed.
                    }
        if(b > a){
            System.out.println(b+ " is greater than " + a); //true, and executed in the console.

        }
        //if a is equal to be;
        if(a == b){
            System.out.println(a+ " is equal to " +b); //since false, not executed.
        }

        //==========================================================================
        int x = 200;
        int y = 300;
        boolean xGreater = x > y;
        boolean yGreater = y > x;
        if(xGreater){
            System.out.println(x+ " is greater than: "+ y);
        }
        if(yGreater){
            System.out.println(y+ "is greater than: "+ x);
        }
        if(xGreater == false && yGreater == false){
            System.out.println(x+ " is equal to " + y);
        }
        if(!xGreater && !yGreater){
            System.out.println(x+"is equal to: "+ y);
        }
        if(xGreater == yGreater){
            System.out.println(y+ "is equal to: "+ x);
        }
    }
}
