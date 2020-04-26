package day19_LoopArray;

public class ArrayEmailPractice {
    public static void main(String[] args) {

        String [] emails = {"cybertek@yahoo.com","cybertek@gmail.com","cybertek@hotmail.com","cybertek@outlook.com"};

 //print out all the users who registered to gmail.

        for(int i=0; i<=3;i++){
            String email = emails[i];
            if(email.endsWith("@gmail.com")){
                System.out.println(email);
            }
        }

    }
}
