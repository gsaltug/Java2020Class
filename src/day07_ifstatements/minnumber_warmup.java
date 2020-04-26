package day07_ifstatements;

public class minnumber_warmup {
    public static void main(String[] args) {
        int a = 100;
        int b = 200;
        int c = 300;

        boolean aminimum = a < b && a < c;
        boolean bminimum = b < a && b < c;
        boolean cminimum = c < b && c < a;

        if(aminimum){
            System.out.println("a is minimum number");
        }
        if(bminimum){
            System.out.println("b is minimum number");
        }
        if(cminimum){
            System.out.println("c is minimum number");
        }
    }
}

/*
write a java program that accept three numbers and return the minimum number, assume that none of them are equal
 */