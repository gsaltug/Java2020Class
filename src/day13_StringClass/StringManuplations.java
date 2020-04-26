package day13_StringClass;

public class StringManuplations {
    public static void main(String[] args) {

        String str ="Cybertek";
        //index      01234567 thus, we can use this index numbers to manuplate.
        //charAt(indexNumber): it returns the char in the given index number.

       char ch1 = str.charAt(5);
        System.out.println(ch1);//t
        System.out.println(ch1=='A');//false
        System.out.println(ch1=='T');//false
        System.out.println(ch1=='t');//false

       int totalLength = str.length();//total number of the char. as an int.
        System.out.println(totalLength);

        System.out.println(totalLength>250);//false

        String str2 = "Today is great day, Java is fun";
        //max index num?

        int maxidexNum = str2.length()-1; //total number of char.
        //index is always 1 unit less than lenght.

        System.out.println(maxidexNum);//30n

        //concat:
        String s1 = "Cybertek";
        System.out.println(s1.concat("School"));
        System.out.println(s1);
s1 = s1.concat("School");
        System.out.println(s1);

        String name1="CYBERTEK";

        name1 = name1.toLowerCase();

        System.out.println(name1);

        String name2 = "cybertek school";
        name2 = name2.toUpperCase();

        System.out.println(name2);
        //trim removes the spaces not used. White space, unused space,means which not seperates the words.

        String A1 = "          Today is a great day";
        A1= A1.trim();
        System.out.println(A1);

        String A2 ="Today   id a great   day  ";
        A2=A2.trim();



        System.out.println(A2);
    }
}
