package day34_customclass;

public class ScrumObject {
    public static void main(String[] args) {

        Tester tester1 = new Tester();
        tester1.setTesterInfo("Lina", 123, "Manual Tester", 95000);

        ScrumTeam scrum = new ScrumTeam();
        scrum.hireTester(tester1);

        System.out.println(scrum.testersTeam.size());//1

        scrum.fireTester(123);
        System.out.println(scrum.testersTeam.size());//0
    }
}
