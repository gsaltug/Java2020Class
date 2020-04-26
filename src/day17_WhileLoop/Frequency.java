package day17_WhileLoop;
//how many time java occured?
public class Frequency {
    public static void main(String[] args) {

        String str= "Java is fun Java, java is cool";//ABCD



         int count=0;//2
         while(str.contains("Java")){
             count++;
             str=str.replaceFirst("Java","");//after counting the first java, removes from the str

         }
        System.out.println(count);//2
    }
}
