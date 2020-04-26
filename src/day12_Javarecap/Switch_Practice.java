package day12_Javarecap;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Switch_Practice {
    public static void main(String[] args) {

        switch (3) {
            case 1:
                System.out.println("Case 1");
                break;
            case 2:
                System.out.println("Case 2");
                break;
            case 3:
                System.out.println("Case 3");
                break;
            default:
                System.out.println("Invalid case");
        }
        //===================================
        int statuscode = 200;
        String result = (statuscode == 200) ? "Ok" : (statuscode == 201) ? "Created" : (statuscode == 202) ? "Accepted" : "Invalid";
        System.out.println(result) ;

    }
}
