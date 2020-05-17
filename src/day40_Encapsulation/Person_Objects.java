package day40_Encapsulation;

public class Person_Objects {
    public static void main(String[] args) {
        Person prs1= new Person("Lina");

        //new Person(name) is object

        System.out.println(prs1.name);

        prs1.setSSN(12345);
        System.out.println("Lina SSN"+prs1.getSSN());//Lina SSN12345

        prs1.setID(123785);
        System.out.println("Lina ID"+ prs1.getID());//Lina ID123785

    }



}
