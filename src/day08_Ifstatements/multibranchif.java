package day08_Ifstatements;

public class multibranchif {
    public static void main(String[] args) {
          int a = 100;

          boolean zero = a==0;
          boolean negative = a<0;
          boolean positive = a>0;

          if(zero){
              System.out.println("zero");
          }
        if (positive) {
            System.out.println("positive");
        }
        if (negative) {
            System.out.println("negative");
        }
        //=====================================================
        //MULTIBRANCHIF
            int b = -200;
        boolean zero1 = b ==0;
        boolean negative1 = b<0;
        boolean positive1 = b>0;
        String result = " ";

        if(zero1){
            result = "zero1";
        }else if (negative1){
            result = "negative";
        }else if (positive1){
            result = "positive";
        }else{
            result = "invalid entry";
        }
        System.out.println(result);

    }
}
