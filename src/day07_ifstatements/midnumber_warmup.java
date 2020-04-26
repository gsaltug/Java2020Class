package day07_ifstatements;

public class midnumber_warmup {
    public static void main(String[] args) {

        double a = 100;
        double b = 200;
        double c = 300;

        boolean amedium = (a < b && c < a) || (a > b && a < c);
        boolean bmedium = (b < c && a < b) || (b > c && b < a);
        boolean cmedium = (c < b && a < c) || (c > b && c < a);

        if (amedium) {
            System.out.println("a is medium number");
        }
        if(bmedium){
            System.out.println("b is medium number");
        }
        if(cmedium){
            System.out.println("c is medium number");
        }
    }
}

/*
write a java program that accept three numbers and return the medium number, assume that none of them are equal
 */