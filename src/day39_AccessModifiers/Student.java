package day39_AccessModifiers;

public class Student {

  public static  String name="Lina";
  public static char gender='F';

   private static long id=123;
  // private static int age=18;
   static int age =15; //default visible in CheckInfo class
    private static long grade ='A';
   private static long SSN;
   /*
    public Student(String name){
        this.name= name;

    }
    public Student (String name, int id){
        this(name);
        this.id=id;

    }

    private Student (char gender, int SSN, int age){
        this.gender=gender;
        this.SSN=SSN;
        this.age=age;
    }

    */

}
