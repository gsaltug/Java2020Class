package day37_Contructors;

import java.util.ArrayList;

public class BankOfAzerbaijan {
    /*
    3. create class called BankOfAzerbaijan
        in the main method:
                1. create a List of Employees
                2. add random two employees from HumanResources to the List
                3. use for each loop to print out the employee info
     */

    public static void main(String[] args) {
        ArrayList<Employee> list = new ArrayList<>();
        list.add(HumanResources.employee3);
        list.add(HumanResources.employee5);

        System.out.println(list.get(0));
        System.out.println(list.get(1));

        /*
        Name: Marina id: 1124 ssn: 111234567 Job Title: Product Manager salary: 170000.0 gender: F
Name: Jazi id: 1126 ssn: 111112345 Job Title: Business Analyst salary: 70000.0 gender: F

         */

        for (Employee each: list){
            System.out.println(each);
        }


        /*
        Name: Marina id: 1124 ssn: 111234567 Job Title: Product Manager salary: 170000.0 gender: F
Name: Jazi id: 1126 ssn: 111112345 Job Title: Business Analyst salary: 70000.0 gender: F
Name: Marina id: 1124 ssn: 111234567 Job Title: Product Manager salary: 170000.0 gender: F
Name: Jazi id: 1126 ssn: 111112345 Job Title: Business Analyst salary: 70000.0 gender: F
         */
    }
}
