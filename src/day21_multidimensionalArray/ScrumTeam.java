package day21_multidimensionalArray;

import java.util.Arrays;

public class ScrumTeam {
    public static void main(String[] args) {
        String [] DevTeam ={"Zey","Phu","cvhu"};
        String [] Testers = {"Lina","bno", "gko"};

        String [] PO ={"Barzy", "Donald"};

       String ScrumTeam [][]= {DevTeam, Testers, PO};

       ScrumTeam [0][2] = "Jean";
        System.out.println(ScrumTeam [0][2] );//jEAN
        System.out.println(Arrays.toString(DevTeam));//[Zey, Phu, Jean]
        System.out.println("==========================");

        for (String eachemployee : ScrumTeam[0]){
            System.out.print(eachemployee+" ");//Zey Phu Jean
        }

        for (String eachemployee1 : ScrumTeam[1]){
            System.out.print(eachemployee1+" ");//Lina bno gko
        }


    }
}
