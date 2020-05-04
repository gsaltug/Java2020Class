package day33_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class CarObjects2Array {
    public static void main(String[] args) {

        Car car1 = new Car();

        car1.setcarinfo("BMW", "X5", 2020, "red");

        car1.getCarInfo();//2020 BMW X5 red

        Car car2 = new Car();
        car2.setcarinfo("Toyota", "Corolla", 2018, "grey");
        car2.getCarInfo();//2018 Toyota Corolla grey

        Car car3 = new Car();
        car3.setcarinfo("Hyundai", "SantaFe", 2014, "white");
        car3.getCarInfo();//2014 Hyundai SantaFe white

        System.out.println("===========");

        Car [] cars = {car1, car2, car3};

        for(int i =0; i< cars.length; i++){
            cars [i].getCarInfo();
        }

        System.out.println("============");

        for(Car eachCar : cars){
            eachCar.getCarInfo();
        }

        System.out.println(car1); //Add above toString method to run this to Car object --//2020 BMW X5 red
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        System.out.println(list1);//[1, 2, 3, 4, 5]
 }

}
