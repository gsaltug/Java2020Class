package day19_LoopArray;

public class ArrayPractice {
    public static void main(String[] args) {

        String[] friends = { "Kuzzat" , "Asiya" , "Saim" , "Akbar", "Marufjon", "Guljannat" , "Murodil"};
        //          0          1         2        3        4             5           6

        /*
        System.out.println(   friends[6]   );
              String s1 =    friends[2];
        System.out.println(s1);
         */

        for(int i = 0; i <= 6; i++){
            String name = friends[i];
            System.out.println(name);
        }

        String [] months = {"Jan","Feb","March"};

        for(int i=0; i<=2; i++){
            String name =months [i];
            System.out.println(name);
        }



    }
}
