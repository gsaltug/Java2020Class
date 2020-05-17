package day38_Constructors;

public class Item {
    /*
     create a class called Item
                instance variables:
                    name, unitPrice, quantity
                add a constructor that can initialize the fields
                instance methods:
                    calcCost(): returns the total cost as double
                                hint: quantity * unitPrice
                    toString(): returns the name, unit price, quantity and total cost info as calculated by calcCost()
 */



        String name;
        double unitPrice;
        int quantity;

        public Item(String name, double unitPrice, int quantity){
            this.name = name;
            this.quantity = quantity;
            this.unitPrice = unitPrice;
        }


        public double calcCost(){
            return quantity * unitPrice;
        }

        public String toString(){
            return "Item: "+name+", Unit price: $"+unitPrice+", Quantity: "+quantity+
                    "\nTotal Cost of Item: $"+calcCost();
        }

//When you declare a constructor (special method), you give "Access Modifier Methodname(Parameter). no rule for AccesM, but MethN must be same with class name, constructor has no return type, no specifier like static
//before initilazing new values, empty constructor is default, we will initilaize instance values.
    }




