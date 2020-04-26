package day21_multidimensionalArray;

public class EMAILS {
    public static void main(String[] args) {

        String[] emails = {"Cybertek@gmail.com", "Cybertek@yahoo.com", "Cybertek@hotmail.com", "Cybertek@outlook.com"};

        for(String eachemail : emails){
            if(eachemail.endsWith("@gmail.com")){
                continue;

            }
            System.out.println(eachemail);
        }
/*
            if(!eachemail.endsWith("@gmail.com")){
                System.out.println(eachemail);//prints except gmail
            }
        }

 */




    }
    /*
     given an array:
        String[] emails = {"Cybertek@gmail.com", "Cybertek@yahoo.com", "Cybertek@hotmail.com", "Cybertek@outlook.com"}
        elemnts could be more in the array
    prin all the email addresses excluding the gmail addresses
        NOTE: MUST USE FOR EACH LOOP
     */
}
