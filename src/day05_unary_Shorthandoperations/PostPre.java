package day05_unary_Shorthandoperations;

public class PostPre {

    public static void main(String[] args) {
        int a = 100;
        System.out.println(--a);//99
        System.out.println(a);//99

        int b = 100;
        System.out.println(b--);//100
        System.out.println(b);//99

        int c = 10;
        int C = ++c; //11
        System.out.println(C); //11
        System.out.println(c); //11

        int d = 10;
        int D = d ++;

        System.out.println(D); //10
        System.out.println(d); //11

        double f = 3.5;
        double F = f--;

        System.out.println(F); //3.5
        System.out.println(f); //2.5










    }
}
