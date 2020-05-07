package day34_customclass;
import java.util.ArrayList;
import java.util.Arrays;
public class CarpetsObject {
    public static void main(String[] args) {
        Carpets[] carpets =  {new Carpets(), new Carpets(),  new Carpets(),  new Carpets(),  new Carpets()};
        carpets[0].customOrder(7,8.5,20,true);
        carpets[1].customOrder(10, 15, 30, false);
        carpets[2].customOrder(9,20,15,true);
        carpets[3].customOrder(20,18,25,false);
        carpets[4].customOrder(35, 45, 35, false);


        ArrayList<Carpets> persianCarpets = new ArrayList<>();

        for(Carpets eachCarpet  : carpets){
            if(eachCarpet.isPersian){
                persianCarpets.add(eachCarpet);
            }
        }

        System.out.println("there are "+persianCarpets.size()+" persian carpets");

        System.out.println(    persianCarpets.get(0).calcCost()    );
        System.out.println(   persianCarpets.get(1).calcCost() );



        ArrayList<Carpets> regularCarpets = new ArrayList<>(Arrays.asList(carpets) );
        // regularCarpets.removeAll(persianCarpets);
        regularCarpets.removeIf( p -> p.isPersian );

        System.out.println("There are "+regularCarpets.size()+" regular carpets");

        for(int i = 0; i < regularCarpets.size(); i++){
            System.out.println( regularCarpets.get(i).calcCost()  );
        }


    }
}
