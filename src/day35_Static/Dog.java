package day35_Static;

public class Dog {

  // static String breed;
    String breed;
    String age;
   static boolean isPet;

    public static void main(String[] args) {

        Dog dog1 = new Dog();
        dog1.breed = "Husky";
        dog1.isPet=true;

        Dog dog2 = new Dog();
        dog2.breed = "Golden";

        System.out.println(dog1.breed);
        System.out.println(dog2.breed);
//when I did static String breed, both of them will be Golden
//Golden

        System.out.println(dog1.isPet);

        System.out.println(dog2.isPet); //true
       // true

    }
}
