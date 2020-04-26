package day08_Ifstatements;

public class Equalnumbers {

    public static void main(String[] args) {
        double n1 = 100;
        double n2 = 200;
        double n3 = 200;

        boolean condition1 = n1 == n2;
        boolean condition2 = n2 == n3;
        boolean condition3 = n3 == n1;
        boolean condition4 = n1 == n2 && n2 == n3 && n1 == n3;
        boolean condition5 = !(condition4);

        if (condition1){
            System.out.println(n1+ "and" +n2 + "are equal");
        }
        if(condition2){
            System.out.println(n2+ "and" +n3 + "are equal");
        }
        if(condition3){
            System.out.println(n3+ "and" +n1 + "are equal");
        }
        if(condition4){
            System.out.println("all of them are equal");
        }
        if(condition5){
            System.out.println("none of them are equal");
        }
    }
}
/* write a program that can check the equality of three given numbers
declare 3 numbers n1, n2, n3.
if n1 and n2 are equal ==> n1&n2 are equal,
if n2 and n3 are equal ==> n2&n3 are equal,
if n3 and n1 are equal ==> n3&n1 are equal
if all equal ==> all equal
if none of them are equal ==> none of them are equal.

 */