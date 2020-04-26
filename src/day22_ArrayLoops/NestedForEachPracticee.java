package day22_ArrayLoops;

public class NestedForEachPracticee {
    public static void main(String[] args) {
int[][] numbers = {
                            {1,2,3},
                            {4,5,6,7,8,9},
                            {10,11,12,13,14},
                            {15,16,17,18,19,20,21}
                          };

int countodd =0;
int sumodd=0;
int sumeven=0;

for(int [] each1Darray : numbers){
    for (int eachelement : each1Darray){
        if(eachelement %2 ==0){
            System.out.print(eachelement+" ");
        sumeven+=eachelement;
        }else{
            sumodd+=eachelement;
            countodd++;
        }

    }
}
        System.out.println();
        System.out.println(countodd);//11
        System.out.println(sumeven);//110
        System.out.println(sumodd);//121
    }
}
