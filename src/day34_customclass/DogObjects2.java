package day34_customclass;

public class DogObjects2 {
    public static void main(String[] args) {
        String food1 = "Chicken";
        String food2 = "Fish";

        String drink1 = "milk";
        String drink2 = "coffee";

        String toy1 = "Ps4";
        String toy2 = "Piano";

        String subject1 = "Java";
        String subject2 = "Art";

        Dogs dog1 = new Dogs();
        dog1.setDogInfo("Alabay", "Extra big", 5, "Brown", "Ajdar");

        Dogs dog2 = new Dogs();
        dog2.setDogInfo("Chihua Hua","Smal",1,"Brown","Tuzik");

        dog2.eating(food1);
        dog1.eating(food2);

        dog2.drinking(drink2);
        dog1.drinking(drink1);

        dog2.playing(toy2);
        dog2.playing(toy1);

        Dogs dog3 = new Dogs();
        dog3.setDogInfo("Poodle","Miniature",2,"White","Lucy");

        Dogs dog4 = new Dogs();
        dog4.setDogInfo("Kangal","Huge",5,"White","Comar");

        System.out.println("===========================================================");
        Dogs[] dogPark = {dog1, dog2, dog3, dog4};

        for(int i = 0; i < dogPark.length; i++){
            dogPark[i].eating(food1);
        }

        for(Dogs each  : dogPark ){
            each.drinking(drink1);
        }

        for(int i = 0; i < dogPark.length; i++){
            dogPark[i].playing("football");
        }


        for(Dogs each  : dogPark ){
            each.studying(subject1);
        }




    }
}
