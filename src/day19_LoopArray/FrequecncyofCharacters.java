package day19_LoopArray;

public class FrequecncyofCharacters {
    public static void main(String[] args) {
        String str ="AABCC";
        String result ="";

        String nonduplicates ="";

        for(int i=0;i<= str.length()-1;i++){
            if(!nonduplicates.contains(""+str.charAt(i))){
                nonduplicates+= str.charAt(i);
            }
        }

        for(int j=0; j<= nonduplicates.length()-1;j++){
            char ch=nonduplicates.charAt(j);

            int count =0;
            for (int i=0;i<= str.length()-1;i++){
                if(str.charAt(i) ==ch){
                    count++;
                }

            }
            result+= ""+ch+count;
        }




        System.out.println(result);
    }
}
