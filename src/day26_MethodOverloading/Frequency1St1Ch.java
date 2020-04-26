package day26_MethodOverloading;

public class Frequency1St1Ch {
    public static void main(String[] args) {
        String str = "AAA";
        char ch ='A';

      char arr [] =  str.toCharArray(); //[A, B, B]
      int count=0;
      for( char each : arr){// each A,B,B
         if(each==ch){
            count++;
      }

    }
        System.out.println(count);//3
        String str2 ="ABNGDJDBB";
        char ch2='B';
    int result2= frequencyArray1s1ch(str2, ch2);
        System.out.println(result2);//3

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
}}


/*
write a return method called frequency that accepts two parameters: string str and char ch,
		the method returns the frequency of the ch from the str as an int
			Ex:
				frequency("AAA", 'A') ==>  3
				frequency("ABAB", 'B') ==> 2
			Note: MUST use Arrays and for each loop

 */