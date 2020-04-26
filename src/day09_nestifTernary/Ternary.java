package day09_nestifTernary;

public class Ternary {
    public static void main(String[] args) {
        int num = 100;
        String result ="";

        if(num %2==0){
           result= "Even";
        }else{
            result = "Odd";
        }
//if the if statement is returning values and assigning to variable then we can use ternary.
        //if--->?, else---> ; in ternary
        String result2 = (num%2==0) ? "Even" : "Odd";
        System.out.println(result);
        System.out.println(result2);
        //=====================================================================================
        int num1 = 100;
        int num2 = 200;
        int max = 0;

        if(num1>num2){
            max=num1;
        }else{
            max=num2;

        }
        int max2 = (num1>num2) ? num1 : num2;

        System.out.println(max);
        System.out.println(max2);

        //==========================
        String str="";
        if(true) {
            str = "Hello";
        }else{
            str ="Hola";
        }
        String str2 = (true) ? "Hello" : "Halo";
        System.out.println(str);
        System.out.println(str2);
    }
}
