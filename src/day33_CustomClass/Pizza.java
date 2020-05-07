package day33_CustomClass;

import java.util.Scanner;

public class Pizza {

    String size;
    int cheesetoppingnum;
    int pepperonitopnum;
    double amount;

    public void customizeOrder(String pizzasize, int chtop, int peptop){
        size=pizzasize;
        cheesetoppingnum=chtop;
        pepperonitopnum=peptop;
    }

    public double calcCost(){

        if(size.equalsIgnoreCase("Small")){
            return 10+(cheesetoppingnum*1.5)+ pepperonitopnum;
        }else if(size.equalsIgnoreCase("Medium")){
            return 12+(cheesetoppingnum*1.5)+ pepperonitopnum;
        }else if(size.equalsIgnoreCase("Large")){
           return 14+(cheesetoppingnum*1.5)+ pepperonitopnum;
        }else{
           return 0;
        }
    }

    public String toString(){
        return  "Pizza size: "+size+"\nCheese Topping: "+cheesetoppingnum+"\nPepperoni Topping: "+pepperonitopnum+ "\nTotal cost is "+ calcCost();
    }
}

 /*
    1. create a custom class for pizza that should contain the following:
				instance variables:
					  	size (either small, medium, large)
					  	number of cheese topping
					  	number of pepperoni toppings
				instance method:
						customizeOrder(): allows user to set the size and toppisngs of the pizza
						calcCost(): returns the total cost as double
						toString(): a String return method that's containing the pizza' size, quantity of each topping, and the pizza cost as calculated by calcCost()
				Pizza cost is determined by:
						Small: $10 + $1.5 per pepperoni topping + 1 per cheese topping
						Medium: $12 + $1.5 per pepperoni topping + 1 per cheese topping
						Large: $14 + $1.5 per pepperoni topping + 1 per cheese topping

     */
