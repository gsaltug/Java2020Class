package day37_Contructors;



class dog{
    String name;
    int age;

    public void setInfo(String name, int age){
        name=name;
        age=age;
    }
}

public class Quiz{
    public static void main(String[] args) {
        dog obj1 = new dog();
        obj1.setInfo("Lucy",4);
        System.out.println(obj1.name+" "+obj1.age);
    }

}