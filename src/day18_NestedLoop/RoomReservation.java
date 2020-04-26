package day18_NestedLoop;

import java.util.Scanner;

public class RoomReservation {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
int kingbed=120;
int queenbed=100;
int singlebed=80;
int price=0;

while(true){

    System.out.println("Which room do you want to reserve?");
    String room =input.nextLine();
    System.out.println();
    while(!(room.equalsIgnoreCase("King bed")||room.equalsIgnoreCase("Queen bed")||room.equalsIgnoreCase("Single bed"))){
        System.out.println("Please re-enter");
        room =input.nextLine();
    }
    if(room.equalsIgnoreCase("King bed")){
        price+=kingbed;
    }else if(room.equalsIgnoreCase("Queen bed")){
        price+=queenbed;
    }else {
        price+=singlebed;
    }

    System.out.println("Do you want to reserve another room? ");
    String answer=input.nextLine();
    while(!(answer.equalsIgnoreCase("Yes")||answer.equalsIgnoreCase("No"))){
        System.out.println("Invalid entry, please re-enter");
        answer=input.nextLine();
    }
    if(answer.equalsIgnoreCase("no")){

        System.out.println("Total price is: $"+price);
        break;
    }

}


    }
}
/*
Assignment:
    write a program for the room reservation:
            King Bed ==> 120$
            Queen Bed ==> 100$
            single Bed ==> 80$
                should ask which bedroom do you wanna reserve
                    if user provided invalid entry => please re-enter
                    calculate the total price
                do you want to reserve another room:
                            if yes ==> repeat the previous steps
                            if no ==> your total price is: $$$
                            if answer either yes or no ==> please re-enter

 */