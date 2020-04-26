package day09_nestifTernary;

public class NestedIf_AgeGroups {
    public static void main(String[] args) {

        int age = 21;
        String group ="";

        /*
        Write a program that can define the age, age groups are teenager, adult, senior, age can not be -, >150
         less 21 is teenager, 21-55 adult, 55>senior*/

        if(age>=0 && age<150){
            if(age<21){
                group = "Teenager";
            }else if(age>=21 && age <55){
                group = "Adult";
            }else if (age>=55){
                group = "Senior";
            }

/*
String group = (age<21) ? "Teenager" :(age>=21 && age<55)? "Adult" : "Senior";
 */
        }else{
            group ="Invalid entry";
        }
        System.out.println(group);


    }
}
