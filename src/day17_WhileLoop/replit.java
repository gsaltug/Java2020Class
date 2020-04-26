package day17_WhileLoop;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class replit {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter word:");
        String str = scan.next();
String result="";
        if (str.length() == 0){
            result += str;

        if (str.length() == 1){

            if (str.charAt(0) == 'x') {

                result += str;

            }else{

                result += str;

        }

        if (str.charAt(0) == 'x') {

            str = str.substring(1, str.length());


        if (str.charAt(str.length()-1) == 'x'){

        str = str.substring(0,str.length()-1);



        result += str;

    }


}
}}
        System.out.println(result);
    }}
