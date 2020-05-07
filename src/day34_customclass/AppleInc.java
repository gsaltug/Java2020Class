package day34_customclass;

public class AppleInc {

    public static void main(String[] args) {
        Tester tester1 = new Tester();
        tester1.setTesterInfo("Gozde", 123, "Tester", 123456);

        Tester tester2 = new Tester();
        tester2.setTesterInfo("Emry", 123456, "Junior Tester", 121000);

        Tester tester3 = new Tester();
        tester3.setTesterInfo("Lina", 12789, "SDET", 145787);

        ScrumTeam scrum1 = new ScrumTeam();

        scrum1.hireTester(tester3);
        scrum1.hireTester(tester1);
        scrum1.hireTester(tester2);

        scrum1.fireTester(123);

        for( Tester each : scrum1.testersTeam){
            System.out.println(each);
        }

        System.out.println("=====");
        Developer dev1 = new Developer();
        dev1.setDeveloperInfo("Ayse", 124, "Dve", 124500);

        

    }
}
