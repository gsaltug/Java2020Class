package day05_unary_Shorthandoperations;

public class Leapyear {
    public static void main(String[] args) {
        short year = 2025;

        boolean leapyear = year % 4 ==0;
String result = year + "is leap year: "+ leapyear;

        System.out.println(result);

    }
}
