package day40_Encapsulation;

public class Credentials {

    private String UserName;
    private String Password;


    public String getUserName(){
        return UserName;
    }

    public void setUserName(String UserName){
        this.UserName= UserName;
    }

    public String getPassword(){
        return Password;
    }

    public void setPassword( String Password){
        this.Password=Password;
    }

//Onemli!!!!since the variables are private, we have to initilaize them with setter
}


