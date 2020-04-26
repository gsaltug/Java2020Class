package day09_nestifTernary;

public class NestedIf {
    public static void main(String[] args) {

        boolean USCitizen = true;
        int age = 17;
        if(USCitizen){
            if(age>17){
                System.out.println("You're eligible to vote");
            }else{
                System.out.println("not eligible to vote due to the age"); //nested if first check the main condition. If it is true this else executed.
            }
        }else{
            System.out.println("Only the US Citizens are eligible to vote for DT"); //if pre-condition is false, it is then executed.
        }

        //=============================
        double score = 89.8;
        String grade = "";

        if (score > 0 && score <= 100) {
            if(score>90){
                grade = "A";
            }else if(score>=80){
                grade = "B";
            }else if(score>=70){
                grade = "C";
            }else if(score>=60){
                grade = "D";
            }else{
                grade = "F";
            }
        }else{
            grade = "Invalid";
        }

        System.out.println(grade);
//if we apply to nested if;
        double score2=89.8;
        String grade2 ="";

        if(score2>0 && score2<=100){
            grade2= (score2 >=90) ? "A" :(score2>=80)? "B" :(score2>=70)? "C" :(score2>=60)? "D" : "F";
        }else{
            grade2= "Invalid";
        }
        System.out.println(grade2);




    }
}
