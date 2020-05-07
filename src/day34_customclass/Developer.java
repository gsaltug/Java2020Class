package day34_customclass;

public class Developer {

    String name;
    int employeeID;
    String JobTitle;
    double Salary;


    public void setDeveloperInfo(String name, int employeeID, String JobTitle, double Salary){
        this.name =name;
        this.employeeID=employeeID;
        this.JobTitle=JobTitle;
        this.Salary=Salary;

    }


    public void coding(){
        System.out.println(name+" is coding");
    }

    public void fixingBug(){
        System.out.println(name+ "is fixing bug");
    }
    public String toString(){
        return "Name: "+name+" Job Title: "+JobTitle+" EmployeeID: "+employeeID+" Salary: "+Salary;
    }

}
