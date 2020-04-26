package day03_variablescontinue;

public class Salarycalculator {

    public static void main(String[] args) {
         double hourlyrate = 65;
         double statetaxrate = 0.04;
         double federal = 0.22;
         byte weeklyh = 45;
         byte totalweeks = 48;
//salary = hourlyrate * weeklyh *totalweeks
         double salary = hourlyrate * weeklyh * totalweeks;
         //salary before tax

        System.out.println("Your salary is: "+salary);

        double statetax = salary * statetaxrate;
        double federaltax = salary * federal;

        double salarytotal = salary -(statetax+federaltax);

        System.out.println("State tax is: "+statetax);
        System.out.println("Federal tax is: "+federaltax);
        System.out.println("Total tax is: "+(statetax+federaltax));

        System.out.println("Your salary after tax is: "+salarytotal);
    }
}
