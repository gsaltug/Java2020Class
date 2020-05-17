package day35_Static;

public class student {
    String name;
    int id;
    double gpa;

    static String School= "Cybertek";

    public void setInfo(String name, int id, double gpa){
        this.name=name;
        this.id= id;
        this.gpa=gpa;

    }

    public static void printSchoolName(){

        System.out.println("School name is: "+School);
    }

    public String toString(){
        return "Student name: "+name+ "School name: "+School;
    }
}
