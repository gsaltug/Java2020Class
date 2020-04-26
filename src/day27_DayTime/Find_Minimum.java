package day27_DayTime;

public class Find_Minimum {
    public static void main(String[] args) {
        int [] arr  ={4,5,7,5};
        int minimum=arr [0];

        for(int each : arr){

            if(each<minimum){
                minimum=each;
            }
        }
        System.out.println(minimum);

      int result =  minimum(arr);
        System.out.println(result);

        double[] arr3 = { 55.5 , 10.5, 1.5, 2.5 , 0, -10.25 };
        double num1 =   minimum(arr3);

        System.out.println(num1);

    }

    public static int minimum (int []arr){
        int minimum=arr [0];

        for(int each : arr){

            if(each<minimum){
                minimum=each;
            }
        }
        return minimum;
    }

    public static double minimum(double[]arr){
        double minimum=arr [0];

        for(double each : arr){

            if(each<minimum){
                minimum=each;
            }
        }
        return minimum;
    }
}
