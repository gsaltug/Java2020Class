package day32_Pradicates;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class Lambda_Expressions {
    public static void main(String[] args) {
        //Predicate<String>startsWithM = s -> !s.startsWith("M");//opposite
 Predicate<String>startsWithM = s -> !s.toLowerCase().startsWith("M");//[] after lowercase practice
        ArrayList<String>names = new ArrayList<>();
        names.addAll(Arrays.asList("Gozde", "Lina", "Bilgus", "Nur", "mary", "Mary"));

        //if any names started with N, remove it.
        names.removeIf(startsWithM);
        System.out.println(names);//[Gozde, Lina, Bilgus, Nur]
        //in opposite [Mary]

        //=======================================
        Predicate<String> startsWithMorA = each -> each.startsWith("M") || each.startsWith("A");
        ArrayList<String>nameList = new ArrayList<>();
        nameList.addAll(Arrays.asList("Muhtar", "Asia", "Ayse", "Dilnaz", "Ranny"));

        nameList.removeIf(startsWithMorA);
        System.out.println(nameList); //[Dilnaz, Ranny]

        //=========================================
        //if c is digit, remove it
      //  Predicate<Character> digits = c -> c >=48 && c <= 57; 1.way
        Predicate<Character> digits = c -> Character.isDigit(c);

        ArrayList<Character> chars = new ArrayList<>();
        chars.addAll(Arrays.asList('A', 'B','3','4','5','8', '&', 'Z' ));

        chars.removeIf(digits);
        System.out.println(chars);//[A, B, &, Z]

        //======================
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7));
        //remove all greater than 5
        nums.removeIf(p -> p >5);//[1, 2, 3, 4, 5] no need to predicate
        //or Predicate<Integer> greaterthan5 = p -> p>5;

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(5,10,15,20,21,30));
        numbers.removeIf(d -> d%3==0 && d % 5 ==0 );

        System.out.println(numbers);//[5, 10, 20, 20]
    }
}
