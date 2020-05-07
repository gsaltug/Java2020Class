package day33_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class CarpetObject {
    public static void main(String[] args) {
        Carpet carpet1 = new Carpet();
        carpet1.customizeOrder(6.5,8,100,false);

        Carpet carpet2 = new Carpet();
        carpet2.customizeOrder(5,8,20,true);

        ArrayList<Carpet> CarpetList = new ArrayList<>();
        CarpetList.addAll(Arrays.asList(carpet1,carpet2) );


        for(int i = 0; i < CarpetList.size(); i++){
            System.out.println(  CarpetList.get(i)  );
        }



    }

}
