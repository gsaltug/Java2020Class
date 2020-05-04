package day33_CustomClass;

public class Car {

    String Brand; //this is attribute of this car class
    String model;
    int year;
    String color;

    public void start (){ //NO STATIC
        System.out.println(Brand + " is started");
    }

    public void drive(){
        System.out.println("Driving " + Brand+" "+model);
    }

    public void getCarInfo() {
        System.out.println(year+" "+Brand+" "+model+" "+color);

    }

    public void setcarinfo( String carBrand, String carmodel, int caryear, String carcolor ){
        Brand=carBrand;
        model= carmodel;
        year=caryear;
        color=carcolor;

    }

    public String toString(){
        String result = year+" "+Brand+ " "+model+" "+color;
        return result;
    }



    public static void main(String[] args) {
        int a = 100; //local variable
    }
}
