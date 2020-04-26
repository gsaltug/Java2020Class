package day15_forLoop;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class Initials {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String str ="Batch 18";
        int Z = str.trim().length();

        System.out.println(Z);

        String s1 = "abc";
        String s2 ="abc";
        System.out.println("s1==s2 is"+(s1==s2));

        String ta ="A";
        ta=ta.concat("B");
        String tb="C";
        ta=ta+tb;
        ta.replace('C','D');
        ta=ta+tb;
        System.out.println(ta);
    }




}
