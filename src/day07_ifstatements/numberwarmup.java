package day07_ifstatements;

public class numberwarmup {
    public static void main(String[] args) {

        double a = 100;
        double b = 200;
        double c = 300;

        boolean agreater = a > b && a > c;
        boolean bgreater = b > a && b > c;
        boolean cgreater = c > a && c > a;

        if(agreater){
            System.out.println("a is maximum number");
        }
        if(bgreater){
            System.out.println("b is maximum number");
        }
        if(cgreater){
            System.out.println("c is maximum number");
        }



    }
}

/*
write a java program that accept three numbers and return the maximum number, assume that none of them are equal.
 */