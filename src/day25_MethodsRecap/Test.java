package day25_MethodsRecap;

import Resources.Library;

public class Test {
    public static void main(String[] args) {

        String str = "ABCDABDCSKJKJ";

        String result = Library.RemoveDuplicates(str);

        System.out.println(result); //ABCDSKJ

        String result2 = Library.FrequencyOfChars(str);
        System.out.println(result2);//A2B2C2D2S1K2J2

        String str3 = "AADNSBDNBSDB";
        int result3 = Library.Frequency(str,str3);
        System.out.println(result3);//0

    }
}
