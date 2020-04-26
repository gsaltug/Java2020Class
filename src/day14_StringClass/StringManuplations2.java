package day14_StringClass;

public class StringManuplations2 {
    public static void main(String[] args) {

        String str = " ";

      boolean bool1=  str.isEmpty();//-false -there is a space boolean exp.
        System.out.println(bool1);

       String username = "";

       if(username.isEmpty()){
           System.out.println("please provide your username first");
       }

        //equals:

        String s1 = "Cat";
       String s2 = new String("Cat");

        System.out.println(s1.equals(s2));//true, this method is more stable since it checks the memory as well.

        String s3 = "Tiger";
        String s4 = new String("Tiger");
        System.out.println(s3.equals(s4));
/*
username:Cybertek
password:Cybertekschool, write a program if the password is correct or wrong.

 */



    }
}
