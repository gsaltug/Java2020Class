package Resources;

import java.util.Arrays;

public class Library {

    public static int[] sortDesending(int[] arr) {
        Arrays.sort(arr);  // {1,2,3,4};  ==> {4,3,2,1};
        int[] RevArr = new int[arr.length];
        /*
                      i        j
               RevArr[0] = arr[3]
               RevArr[1] = arr[2]
               RevArr[2] = arr[1];
               RevArr[3] = arr[0];
         */

        int j = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            RevArr[i] = arr[j];
            j--;
        }

        return RevArr;

    }
    public static String Reverse2(String str){
        String Reverse =" ";

        for (int i= str.length()-1;i>=0; i--){
            Reverse +=str.charAt(i);
        }
        return Reverse;//makes the code more useable.
    }
    public static String RemoveDuplicates (String str){
        String result ="";

        for(int i =0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(!result.contains(""+ch)){
                result+=ch;

            }
        }
        return result;
    }
    public static int Frequency (String str1, String str2){
        int count =0;
        while(str1.contains(str2)){

            count++;
            str1 = str1.replaceFirst(str2, ""); //make sure not to count the same one
        }
        return count;
    }
    public static String FrequencyOfChars (String str){
        String NonDup = Library.RemoveDuplicates(str);
        String result ="";
        for (int i =0; i< NonDup.length(); i++){

            String ch = ""+NonDup.charAt(i);
            int num = Library.Frequency(str, ch);
            result += ch+num;
        }
        return result;
    }

    public static int frequencyArray1s1ch(String str, char ch){
        char arr [] =  str.toCharArray(); //[A, B, B]
        int count=0;
        for( char each : arr){// each A,B,B
            if(each==ch){
                count++;
            }


        }
        return count;
    }
    public static String uniques (String str){
        String result =""; //A is unique

        for( int i = 0; i< str.length(); i++){
            int num= frequencyArray1s1ch(str, str.charAt(i));
            if(num==1){
                result += str.charAt(i);
            }
        }
        return result;
    }
}



