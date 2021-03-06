package day39_AccessModifiers;

public class Employee {
    /*
    2. create a class called Employee:
				instance variables:
						name, jobTitle, ID, salary
				add a constructor that can initialize name of employee
				add a constructor that can initialize name, jobTitle of the employee
							(apply constructor call to initialize the name)
				add a constructor that can initialize name, jobTitle, ID of the employee
							(apply constructor call to initialize the name and jobTitle)
				add a constructor that can initialize name, jobTitle, ID, salary of employee
							(apply constructor call to initialize the name, jobTitle, ID)
				add toString method
     */

    String name;
    String jobTitle;
    int ID;
    double salary;
    char gender;

    public Employee (String name){
        this.name= name;

    }

    public Employee (String name, String jobTitle){
        this(name);
        this.jobTitle=jobTitle;
    }

    public Employee (String name, String jobTitle, int ID){
        this(name, jobTitle);
        this.ID=ID;
    }

    public Employee (String name, String jobTitle, int ID, double salary){
        this(name, jobTitle, ID);
        this.salary=salary;
    }

    public Employee (String name, String jobTitle, int ID, double salary, char gender){
        this(name, jobTitle, ID, salary);
        this.gender=gender;
    }
    public String toString(){
        return "Employee name: "+name+", job title: "+jobTitle+", ID: "+ID+", salary: "+salary+", gender: "+gender;
    }
}

class EmployeeObject2 {
    public static void main(String[] args) {

        Employee emp1 = new Employee("Lina", "Eng", 123456, 123500);
        System.out.println(emp1);

        Employee emp2 = new Employee("Lin", "XYZ", 123, 123456, 'F');
        System.out.println(emp2);

        /*
        Employee name: Lina, job title: Eng, ID: 123456, salary: 123500.0, gender:
Employee name: Lin, job title: XYZ, ID: 123, salary: 123456.0, gender: F

         */

    }
}
