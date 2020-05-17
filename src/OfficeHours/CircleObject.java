package OfficeHours;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

public class CircleObject {
    public static void main(String[] args) {
        Circle circle1 = new Circle(2.12);
        circle1.area();
        circle1.perimeter();
        System.out.println(circle1);
    }



}
