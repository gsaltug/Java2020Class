package day17_WhileLoop;

public class InterviewTask {
    public static void main(String[] args) {

        String result ="";
        for (int i=1;i<=30;i++){
boolean x =(i%3==0)&&(i%5==0);
            if(i%3==0){
                result+="FIN"+" ";
            }
            if(i%5==0){
                result+="RA"+" ";
            }
            if(x){
                result+="FFINRA"+" ";
            }else{
                result+=i+" ";
            }


        }
        System.out.print(result);
    }
}
