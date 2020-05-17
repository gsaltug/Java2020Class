package day38_Constructors;

public class dogObjects {
    public static void main(String[] args) {
        Dog dog1 = new Dog();

        System.out.println(dog1.name);
        System.out.println(dog1.breed);
        System.out.println(dog1.age);

        Dog dog2 = new Dog("Husky");
        System.out.println(dog2.name);
        System.out.println(dog2.breed);
        System.out.println(dog2.age);

        /*
        unknown
unknown
0
unknown
Husky
0
         */

        System.out.println("================");
        Dog dog3 = new Dog("Golden", 2);
        System.out.println(dog3.breed);
        System.out.println(dog3.age);
        //Golden -2
        System.out.println(dog3);

        //Name: unknown, breedGolden, age2


    }
}
