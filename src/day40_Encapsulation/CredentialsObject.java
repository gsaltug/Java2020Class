package day40_Encapsulation;

public class CredentialsObject {

    public static void main(String[] args) {
        Credentials facebook = new Credentials();


        facebook.setUserName("gozde");
        facebook.setPassword("123456");
        System.out.println(facebook.getUserName());
        System.out.println(facebook.getPassword());
    /*
    gozde
123456

     */


    }
}
