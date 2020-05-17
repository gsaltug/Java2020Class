package OfficeHours;

public class Circle {
/*
 Create a class called Circle
            instance variables:
                    radius, pi, diameter
            add a constructor that can initialize the radius of the circle

 instance methods:
                    area(): can return the area of the circle as double
                    perimeter(): cna return the perimeter of the circle as double
                    toString(): returns the info of the circle
            Note: global value of PI is 3.14
                  diameter of circle = 2 * radius
                  area of circle = PI * r * r
 */
    double radius;

    double diameter;
    static double PI=3.14;

    public Circle(double radius){
        this.radius=radius;
    }

    public double area(){
        return PI*radius*radius;
    }

    public double perimeter(){
        return 2*PI*radius;
    }

    public String toString(){
        return  "Circle radius: "+radius+" Area: "+area()+ " Perimeter: "+perimeter();
    }
}
