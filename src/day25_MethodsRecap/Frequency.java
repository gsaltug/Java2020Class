package day25_MethodsRecap;

public class Frequency {
    public static void main(String[] args) {
        String str1 ="AAA";
        String str2 ="A";

        int count =0;
        while(str1.contains(str2)){

            count++;
            str1 = str1.replaceFirst(str2, ""); //make sure not to count the same one
        }
        System.out.println(str1);
        System.out.println(count);//3


        String a = "python python python python";
        String b ="python";

        int result = Frequency(a,b);
        System.out.println(result);//4
    }




public static int Frequency (String str1, String str2){
    int count =0;
    while(str1.contains(str2)){

        count++;
        str1 = str1.replaceFirst(str2, ""); //make sure not to count the same one
    }
    return count;
}}