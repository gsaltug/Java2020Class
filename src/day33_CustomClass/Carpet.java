package day33_CustomClass;

public class Carpet {

    double width;
    double length;
    double unitPrice;
    boolean isPersian;

    public void customizeOrder(double Cwidth, double Clength, double Cunitprice, boolean CisPersian){
        width=Cwidth;
        length=Clength;
        unitPrice=Cunitprice;
        isPersian=CisPersian;
    }

    public double calcCost(){

        if(isPersian){
            return (width+length)*unitPrice+200;
        } else{
            return (width+length)*unitPrice;
        }
    }

    public String toString(){
        return  "Carpet width is: "+width+"\nCarpet length is: "+length+"\nUnit price is: "+unitPrice+ "\nTotal cost is $"+ calcCost();
    }
}

