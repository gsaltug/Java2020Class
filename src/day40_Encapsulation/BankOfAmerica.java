package day40_Encapsulation;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class BankOfAmerica {
    public static void main(String[] args) {
        Employee lin = new Employee();
   lin.setAddress("Virginia");
   lin.setSalary(123456.0);
   lin.setID(12345);
   lin.setSSN(45613154);

        System.out.println(lin.getAddress());
        System.out.println(lin.CompanyName); //instance variable

        System.out.println(lin.getSalary());

        System.out.println(lin.getID());
        System.out.println(lin.getSSN());
    }


}
