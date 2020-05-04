package day33_CustomClass;

public class CarObjects {
    public static void main(String[] args) {
        Car car1 = new Car();

        car1.Brand = "BMW";
        car1.model= "X5";
        car1.year= 2020;
        car1.color ="purple";

        System.out.println(car1.Brand);
        //instance variables are object variable, we can call them through the object name.
        System.out.println(car1.model);
        System.out.println(car1.year);
        System.out.println(car1.color);

        //BMW
        //X5
        //2020
        //purple
        car1.start();
        car1.drive();
        car1.getCarInfo();

        Car car2 = new Car();

        car2.Brand = "Nissan";
        car2.model = "Rogue";
        car2.year = 2016;
        car2.color = "grey";

        System.out.println(car2.Brand);
        System.out.println(car2.model);
        System.out.println(car2.year);
        System.out.println(car2.color);
        //       null
        //null
        //0
        //null   Because each instance has their own object! Therefore assign them for car2 as given above.
        //Nissan
        //Rogue
        //2016
        //grey after declaring values to attributes

        car2.start(); //Starts Nissan
//Nissan is started
        car2.drive(); //Driving Nissan Rogue

        car2.getCarInfo(); //2016 Nissan Rogue grey

        System.out.println("================");
        Car car3 = new Car();

        car3.Brand= "Mercedes";
        car3.model="C300";
        car3.year = 2020;
        car3.color = "Black";

        car3.getCarInfo();//2020 Mercedes C300 Black
        car3.start();//Mercedes is started
        car3.drive(); //Driving Mercedes C300
        System.out.println("======");

        String str ="A";
        String str2 = "B";

        String[] arr ={str, str2};



        Car[] cars = {car1, car2, car3};

        cars[0].getCarInfo();
        cars[1].getCarInfo();
        cars[2].getCarInfo();

        /*
            create 5 car objects
            put them in an array of cars
            use for loop to get each car info
            use for each loop to get each car info
         */
    }
}
