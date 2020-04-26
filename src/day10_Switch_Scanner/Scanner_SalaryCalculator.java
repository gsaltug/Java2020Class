package day10_Switch_Scanner;
import java.util.Scanner;
public class Scanner_SalaryCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your salary");
        double salary = input.nextDouble();
        System.out.println("How many hours do you work in a week?");
        int hours = input.nextInt();
        int week = 52;
        double rate = salary/(hours*week);

        System.out.println("Your hourly rate is:"+ rate);
    }
}
