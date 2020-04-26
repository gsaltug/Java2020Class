import java.util.Arrays;

public class MethodOverloading2 {
    /*
    first method : sum of two numbers
    second: sum of three numbers
    third: sum of four numbers
     */
    public static void main(String[] args) {
        sum2Numbers(10,2);//12
        sum3Numbers(10,20,30);//60
        sum4Numbers(10,20,30,40);//100

        int [] arr = {5,4,7,1,2};
        Arrays.sort(arr);

        sum(20,40);//60
    }

    public static void sum2Numbers (int a, int b){
        System.out.println(a+b);

    }
    public static void sum3Numbers (int a, int b, int c){
        System.out.println(a+b+c);

    }
    public static void sum4Numbers (int a, int b, int c, int d){
        System.out.println(a+b+c+d);

    }
    //=====================================================

    public static void sum (int a, int b){
        System.out.println(a+b);
    }
    public static void sum (int a, int b, int c){
        System.out.println(a+b+c);
    }
    public static void sum (int a, int b, int c, int d){
        System.out.println(a+b+c+d);
    }

}
