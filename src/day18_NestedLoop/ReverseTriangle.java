package day18_NestedLoop;

public class ReverseTriangle {
    public static void main(String[] args) {

     /*
        for(int j=9; j>=8;j++){
            for(int i=1; i<=j;i++){
                System.out.print("* ");
            }
            System.out.println();
        }
*/

        for(char zh='a';zh<='z';zh++){
            for(char ch ='a'; ch<=zh;ch++){
                System.out.print(ch+" ");
            }
            System.out.println();

        }
        System.out.println("============");
        for(char zh='z';zh>='a';zh--){
            for(char ch ='a'; ch<=zh;ch++){
                System.out.print(ch+" ");
            }
            System.out.println();

        }

}
}
