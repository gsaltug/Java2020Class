package day24_Methods;

public class ReturnMethods {
    public static void MaxNum(int a, int b){

        if(a>=b){
            System.out.println(a);
        }else{
            System.out.println(b);
        }
    }

    public static void main(String[] args) {
        MaxNum(10,20);
        int result = Addition(1000,2000);
    }

    public static int Addition (int a, int b){
      //System.out.println(a+b);
        return a+b;
    }
}
