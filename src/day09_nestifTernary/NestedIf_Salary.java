package day09_nestifTernary;

public class NestedIf_Salary {
    public static void main(String[] args) {

        double salary = 30000;
        int workingyear = 5;
        String loan = " ";

        if(salary>=30000){
            if(workingyear>=2){
                loan = "You're qualify";
            }else{
                loan = "You need to have more working history";
            }

        }else{
            loan ="not eligible to get the loan";
        }
        System.out.println(loan);


    }
}
