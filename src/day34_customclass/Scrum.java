package day34_customclass;

import java.util.ArrayList;

public class Scrum {

    ArrayList<Tester> testerTeam = new ArrayList<>();
    ArrayList<Developer> developerTeam = new ArrayList<>();

    public void hireTester (Tester tester){
        testerTeam.add(tester);
    }

    public void fireTester (long id){
        testerTeam.removeIf(p->p.employeeID ==id);
    }

    public void hireADeveloper(Developer developer){
        developerTeam.add( developer );
    }

    public void fireADeveloper(long id){
        developerTeam.removeIf(  eachDev -> eachDev.employeeID == id );
    }


}
