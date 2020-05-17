package day39_AccessModifiers;

public class CheckInfo {
    public static void main(String[] args) {

        System.out.println("Name: "+Student.name);
        System.out.println("Gende: "+Student.gender);

 //       System.out.println("Grade: "+Student.grade); rest of the class variables gives compile error since private not accessible outside the enclosed class
        System.out.println("Age: "+ Student.age);//default visible

        Student obj = new Student();
        System.out.println(obj.name);
        System.out.println(obj.gender);
      System.out.println(obj.age);//default
     // privite   System.out.println(obj.grade);
    }
}
