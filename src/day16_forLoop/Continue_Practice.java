package day16_forLoop;

public class Continue_Practice {
    public static void main(String[] args) {
        for (char i = 'Z'; i>='A'; i--){

            if(i=='Y'|| i =='H'|| i=='J'|| i=='D'){//skips YHJD
              continue;


            }
            System.out.print(i+"");

        }

        for (int i=1; i<=100; i++){

            if(i%3==0 || i%5==0){//if either number is divisible by 3 or 5 skips.
                continue;
            }
            System.out.print(i+" ");

        }


    }
}
