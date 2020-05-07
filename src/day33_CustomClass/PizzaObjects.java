package day33_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PizzaObjects {
    public static void main(String[] args) {
            Pizza pizza1 = new Pizza();
            pizza1.customizeOrder("Small", 2,5);

        System.out.println(pizza1);

        Pizza pizza2 = new Pizza();
        pizza2.customizeOrder("Medium", 2,5);

        Pizza pizza3 = new Pizza();
        pizza3.customizeOrder("Large", 2,5);

        ArrayList<Pizza> PizzaList = new ArrayList<>();
        PizzaList.addAll(Arrays.asList(pizza1,pizza2,pizza3) );

        for(int i = 0; i < PizzaList.size(); i++){
            System.out.println(  PizzaList.get(i)  );
        }








    }
}
