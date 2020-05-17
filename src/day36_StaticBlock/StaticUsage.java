package day36_StaticBlock;

import OfficeHours.Tester;

public class StaticUsage {
//initilaizer means assinging


    static int a;
    static int b;
    int c;

    static Tester tester1= new Tester();

    public static void main(String[] args) {

        System.out.println(tester1);//Name: Gozde, job title: SDET, salary: $120000.0, ID: 123

    }


    static {
        a=100;
        b=200;  //static only accepts static variables
  //z=300; --compile error
  if(100>200){
      a=100;
  }else{
      b=200;
  }

        tester1.setInfo("Gozde","SDET", 120000,123);
    }





}
