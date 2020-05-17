package day36_StaticBlock;

import OfficeHours.Developer;

public class HumanResource {

    //5 developers

  static   Developer dev1 = new Developer();
 static   Developer dev2 = new Developer();
    static Developer dev3 = new Developer();
   static Developer dev4 = new Developer();
  static  Developer dev5 = new Developer();

    public static void main(String[] args) {
//moved into static block
    }

    static{
        dev1.setInfo("Goz", "Developer", 123000, 123);

    }
}
