package day32_Pradicates;

import java.util.ArrayList;
import java.util.Arrays;

public class Quiz {
    public static void main(String[] args) {
        ArrayList<Integer>list1=new ArrayList<>();

        list1.addAll(Arrays.asList(1,2,3,4,5,6,7));

        for(Integer each : list1){
            if(each % 2!=0){
                continue;
            }
            System.out.println(each+"");
            break;
        }

    }
}
