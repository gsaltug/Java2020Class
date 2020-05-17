package day40_Encapsulation;

public class Encapsulation {

    private long SSN;

    //getter read only.
    //return type must match with instance variables' data type. Funct. returning the data.


    public long getSSN(){
        return SSN;
    }

    //setter return type is void, since its func. is just to initilaize
//pass parameter, which must with instance var.data type, MODIFY only
    // setter: write only
    public  void setSSN(long SSN){
        this.SSN = SSN;
    }
}
