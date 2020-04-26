package day18_NestedLoop;

public class DoWhileLoopPractice {
    public static void main(String[] args) {
        int number =103;


        while(number>=100){//infinite times, since it will never be false, to stop I have to make this con false.
            System.out.println(number);
            number--;
        }

        System.out.println("=====");
        int num2=103;
        do{
            System.out.println(num2);
            num2--;
        }while(num2<100);

    }
}
