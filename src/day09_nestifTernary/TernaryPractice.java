package day09_nestifTernary;

public class TernaryPractice {
    public static void main(String[] args) {
        int num1 = 300;
        int num2 = 200;
        int min = (num1<num2) ? num1 : num2;

        System.out.println(min);

        //============================
        int hour = 14;

        String result = (hour<=12) ? "Good Morning" : (hour > 12 && hour <18) ? "Good Afternoon" : "Good Evening";
        System.out.println(result);

        //========================================

    }
}
