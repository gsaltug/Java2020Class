package day13_StringClass;

public class StringManupilation2 {
    public static void main(String[] args) {

        String str ="Cybertek School is the best";

        //substring method, used when I need to create substring.

        //For example, if I wanna cut Cyberyek, I will give beginning and ending index.

        String schoolName = str.substring(0,8);//ending index is excluded so I add 1 to 7=8.
        System.out.println(schoolName);
        System.out.println(str);

        String fullName = "Lina Peduk";
        String firstName = fullName.substring(0,4);
        String lastName = fullName.substring(5,10);

        System.out.println(firstName);
      //from the full name =firstname lastname
      //gmail: lastName_firsname@gmail.com

        String fullname1 = "Gozde Peduk";
        String firstname1 = fullname1.substring(0,5);
        String lastname1 = fullname1.substring(6,11);

        System.out.println(lastname1);
        System.out.println(firstname1);

        String gmail = lastname1.concat("_").concat(firstname1).concat("@gmail.com");
//String gmail = lastname1+"_"+firstname1+"@gmail.com"

        System.out.println(gmail);

        //substring--->2 just the beginning index

        String s1 = "I love Java Programming Language";

        String classname = s1.substring(7);//only give beginning index, prints till the end, "Java Programming Language.
        System.out.println(classname);

        String s2 = "I like C# Programming";

        //replace

        s2 = s2.replace("C#","Java");
        System.out.println(s2);//I like Java Programming.

        String name = "Covid 18";
        //replace 18 w/19

        name = name.replace("8","9");
        System.out.println(name);
//replace first, only replaces the first one.

        String r1 = "I like C#, C# is fun, C# is cool";
        r1 = r1.replace("C#","Java");//replaces all of them

        System.out.println(r1);
        r1 = r1.replaceFirst("Java", "C#");//only replace the first one

        System.out.println(r1);

        String r2 = "Tomorrow is Monday, Tomorrow is Tuesday";
        r2=r2.replaceFirst("Tomorrow","Today");
        System.out.println(r2);//Today is Monday, Tomorrow is Tuesday.




    }
}
