package Resources;

import day39_AccessModifiers.Student;

public class CheckInfo {

    public static void main(String[] args) {
        System.out.println(Student.name);
        //no instance variable, no need to create object

        System.out.println(Student.gender);

        //NO access to default and private
    Student obj = new Student();
        System.out.println(obj.name);//public
        //System.out.println(obj.age);//default not acces, outside the package
        //System.out.println(obj.id); private compile error

    }

}
