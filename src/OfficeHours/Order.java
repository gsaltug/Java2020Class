package OfficeHours;

import java.util.ArrayList;
import java.util.Arrays;

public class Order {
    public static void main(String[] args) {
        Pizza pizza1 = new Pizza("Small", 3,5);
        Pizza pizza2 = new Pizza("medium", 2, 1);
        Pizza pizza3 = new Pizza("large", 4, 3);
        Pizza pizza4 = new Pizza("medium", 1, 3);
        Pizza pizza5 = new Pizza("small", 4, 2);

        ArrayList<Pizza> list = new ArrayList<>(Arrays.asList(pizza1, pizza2, pizza3, pizza4, pizza5));
        int total=0;
        for(int i = 0; i < list.size(); i++){
            total+=list.get(i).calcCost();
        }
        System.out.println(total);//92

    }
}
