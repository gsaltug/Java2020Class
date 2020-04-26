package day02_variables;

public class Variables_practice {
    public static void main(String[] args) {
        /*
        salary, tax rate, loan, ssn
         */
        double salary = 100.000;
        System.out.println(salary);
        int s = 120000;
        System.out.println(s);
        double Federaltax = 0.18;
        float statetax = 0.065f;
        //salary after tax= salary- (1-sum of tax)

        double sumoftaxes = Federaltax + statetax;
        double salaryaftertax = salary * (1-sumoftaxes);

        System.out.println(salaryaftertax);
        System.out.println("=================================================");

        //area of the circle r*r*pi
        double r = 5.5;
        double area = r *r * 3.14;
        System.out.println(area);

        System.out.println("==================================================");
        double kg = 60; //you can also use int
        double pound = kg * 2.25;
        System.out.println(pound);

        double lira = 1000;
        double liraindollar = lira / 6.15;
        System.out.println(liraindollar);

        double liter = 10000;
        double galons = liter / 3.7;
        System.out.println(galons);
        System.out.println("====================================================");






    }
}
