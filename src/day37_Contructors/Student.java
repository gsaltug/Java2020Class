package day37_Contructors;

public class Student {
    String name;
    int age;
    char gender;
    String University;

    public Student (String name, int age, char gender, String University){
        this.name=name;
        this.age=age;
        this.gender=gender;
        this.University=University;

    }

    public void setStudentInfo (String name, int age, char gender, String University){
        this.name=name;
        this.age=age;
        this.gender=gender;
        this.University=University;

    }

    public String toString(){
        return "Student name: "+name+ " AGE: "+ age+ "gender: "+ gender+ "Uni name: "+University;

}
}
