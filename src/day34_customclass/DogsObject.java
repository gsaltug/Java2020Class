package day34_customclass;

import java.util.ArrayList;
import java.util.Arrays;

public class DogsObject {
    public static void main(String[] args) {
        Dogs dog1 = new Dogs();

   dog1.breed ="Husky";
        System.out.println(dog1.breed);

        dog1.setDogInfo("Husky", "Small", 2, "White", "Blue");

        Dogs dog2 = new Dogs();
        dog2.setDogInfo("Alabay", "Big", 6, "Black", "Ajdar");

        Dogs dog3 = new Dogs();
        dog3.setDogInfo("Golden", "ExtraBig", 7, "Cream", "Sisty");

        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog3);

        /*
        Dog Name: Blue, breed: Husky, size: Small
Dog Name: Ajdar, breed: Alabay, size: Big
Dog Name: Sisty, breed: Golden, size: ExtraBig
         */
        Dogs dog4 = new Dogs();

        dog4.setDogInfo("Pomeranian", "Small", 3, "White", "Lil");

        Dogs dog5 = new Dogs();
        dog5.setDogInfo("Lidly", "Large", 5, "Brown", "Kam");

        ArrayList<Dogs> puppies = new ArrayList<>();
        puppies.addAll(Arrays.asList(dog1, dog2, dog3));
        puppies.addAll(Arrays.asList(dog4,dog5));


        for (int i =0; i<puppies.size(); i++){
         Dogs eachdog=puppies.get(i);
            System.out.println(eachdog);
        }

     //remove dogs older than 5
        System.out.println("=========================");
     puppies.removeIf(p-> p.age>2);
        for (int i =0; i<puppies.size(); i++){
            Dogs eachdog=puppies.get(i);
            System.out.println(eachdog);
        }
//Dog Name: Blue, breed: Husky, size: Small only one left after removing

    }



}
