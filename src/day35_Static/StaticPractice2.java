package day35_Static;

public class StaticPractice2 {

    String brand;
    String model;
  static boolean hasWheels=true;

 //   public static void printBrand(){
       // System.out.println(brand); compile error, I can not use directly here, I should use instance method
//    }

    public void printBrand(){
        System.out.println(brand);
    }

    public void printModel(){
        System.out.println(model);

    }

    public static void main(String[] args) {
        System.out.println(hasWheels);
    }//if it was instance, we could not use it here in static method


}
