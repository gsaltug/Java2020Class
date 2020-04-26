package day26_MethodOverloading;

public class Uniques {

    public static void main(String[] args) {//Step2
        String str ="ACDBB";
        String result =""; //A is unique

    for( int i = 0; i< str.length(); i++){
        int num= frequencyArray1s1ch(str, str.charAt(i));
        if(num==1){
            result += str.charAt(i);
        }
    }

        System.out.println(result);//ACD
        String str2 ="Gozdeemrah";//Step4
        String result2 = uniques(str2);
        System.out.println(result2);//Gozdmrah

    }
    public static String uniques (String str){//Step3
        String result =""; //A is unique

        for( int i = 0; i< str.length(); i++){
            int num= frequencyArray1s1ch(str, str.charAt(i));
            if(num==1){
                result += str.charAt(i);
            }
        }
        return result;
    }







    public static int frequencyArray1s1ch(String str, char ch){//Step1
        char arr [] =  str.toCharArray(); //[A, B, B]
        int count=0;
        for( char each : arr){// each A,B,B
            if(each==ch){
                count++;
            }


        }
        return count;
    }


    }

/*
2. use the above method to create another called uniques that accepts a string paramter and returns it's unique characters as String
			Ex: uniques("ABBC"); 		==> "AC"
				uniques("Cybertek");  	==> "cybrtk"
 */