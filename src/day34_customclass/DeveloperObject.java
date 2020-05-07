package day34_customclass;

import java.util.ArrayList;
import java.util.Arrays;

public class DeveloperObject {

    public static void main(String[] args) {
        Developer developer1 = new Developer();

        developer1.setDeveloperInfo("Lina", 123, "Developer", 123000);

        Developer developer2 = new Developer();
        developer2.setDeveloperInfo("Gozde", 12345, "Dev", 123450);

        System.out.println(developer1);

        developer1.coding();
        developer2.coding();

        developer1.fixingBug();
        developer1.fixingBug();

        Developer [] arr = {developer1, developer2};

        for ( int i=0; i < arr.length; i++){
            System.out.println(arr[i].name);
    }
        for (Developer each : arr){
            System.out.println(each.name+" "+each.Salary);
        }

        ArrayList<Developer> developers = new ArrayList<>(Arrays.asList(developer1, developer2));
        System.out.println(developers);
}}
