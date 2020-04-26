package day16_forLoop;

public class duplicateTask {
    public static void main(String[] args) {
        String str ="abab";
        String result ="";//you will get at the end without duplicated charac.

        for(int i=0;i<=3;i++){

         //   if(!result.contains(""+str.charAt(i)))
           // result += str.charAt(i);//it concats every single character.
//prints ab
            if (result.contains(""+str.charAt(i))) {
                continue;

            }
            result += str.charAt(i);
        }
       System.out.println(result);//ab


    }
}
