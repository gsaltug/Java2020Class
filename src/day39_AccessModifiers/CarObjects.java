package day39_AccessModifiers;

public class CarObjects {

    public static void main(String[] args) {

        Car car1= new Car("Toyota");
        System.out.println(car1);

        Car car2 = new Car("Toyota", "Corolla");
        System.out.println(car2);

        Car car3 = new Car("BMW", "X5", 2019, 22500);
        System.out.println(car3);//Car brand: x, modely, year1, $22500.0

    }
}
