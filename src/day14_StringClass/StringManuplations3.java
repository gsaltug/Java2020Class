package day14_StringClass;

public class StringManuplations3 {
    public static void main(String[] args) {

        //equalsignore case, case sensitivity not important.
String gmail ="cybertekschool";
String gmail2="Cybertekschool";

        System.out.println(gmail.equalsIgnoreCase(gmail2));//true

        //Contains method

        String s1 = "Cybertek School";
        System.out.println(s1.contains("School")); //true

        //or boolean r1 = s1.contains("School");
//==///==========================================
        /*
        valid password must contain a special characters such as(!, _,$)=> valid, otherwise invalid.
        valid password should not contain spaces.

         */

        String Password = "masd 1235";

        if(Password.contains(" ")){
            System.out.println("Password can not contain a space");
        }else{
            System.out.println("Valid password");
        }

        //startsWith(str) =>checks if the string starts with the given str, returns boolean.
        String s3 = "United States";
        System.out.println(s3.startsWith("U"));//true, case sensitive.

        //==============================================================
        /*
        every website has "http" at the beginning of the web address. Write a program to valide.
         */
        String website = "http.nrtnc.com";
               website = website.toUpperCase();//invalid, since we have converted to uppercase.
        if (website.startsWith("http")){
            System.out.println("valid");
        }else{
            System.out.println("invalid");
        }

        //endsWith=====================================
        //opposite of startWiths, returns true or false

        String s5 = "Cybertek School";
        System.out.println(s5.endsWith("l")); //true
        System.out.println(s5.endsWith("School"));//true

        System.out.println(s5.endsWith("Cybertek"));//false

        /*
        every single gmail address ends with gmail.com, verify.
         */
String emailaddress = "g@gmail.com";
          if(emailaddress.endsWith("gmail.com")){
            System.out.println("valid");

        }else{
              System.out.println("invalid");
          }

          /*
          must start with www.
          must ends with .com, or, .edu, or, .net,

           */


    }
}
