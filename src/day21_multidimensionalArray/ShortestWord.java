package day21_multidimensionalArray;

public class ShortestWord {
    public static void main(String[] args) {
        String [] names = {"gozde","emrah","lina","Bilgenur"};

        int minlengthString = names [0].length();//I will compare it with remaining
        String shortestword ="";
        //int=1, started from second word to compare w/first
        for(int i=0; i<names.length; i++){
            if(names[i].length()<minlengthString){
                minlengthString=names[i].length();
             shortestword=names[i];
            }
        }
        System.out.println(shortestword); //lina

    }
}
