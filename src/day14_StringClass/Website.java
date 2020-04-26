package day14_StringClass;

public class Website {
    public static void main(String[] args) {

        String website = "https.cybertek.com"; //invalid address.
               website = website.toLowerCase();

               boolean validending = website.endsWith(".com") || website.endsWith(".edu") || website.endsWith(".gov");

               if(website.startsWith("www.") && validending){
                   System.out.println("valid address");
               }else{
                   System.out.println("invalid address"); //valid address.
               }
    }
}
/*
must start with www.
          must ends with .com, or, .edu, or, .net,
 */