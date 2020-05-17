package OfficeHours;

public class Pizza {
    /*
    1. create a custom class for pizza that should contain the following:
				instance variables:
					  	size (either small, medium, large)
					  	number of cheese topping
					  	number of pepperoni toppings

     */

    String size;
    int cheesetoppingnum;
    int pepperonitopnum;
    double amount;

    public Pizza (String size, int cheesetoppingnum, int pepperonitopnum){
       this.size=size;
        this.cheesetoppingnum=cheesetoppingnum;
       this.pepperonitopnum=pepperonitopnum;
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


