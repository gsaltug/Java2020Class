package day37_Contructors;

import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;

public class CybertekStudents {

  //  static String schoolName;
    static String schoolName="Cybertek University";
    String studentName;
    int groupNumber;
    String batch;

    public CybertekStudents(String studentName, int groupNumber, String batch){
        schoolName="Cybertek University";
        this.studentName=studentName;
        this.groupNumber=groupNumber;
        this.batch=batch;

    }

    public String toString(){
        return "Name: "+studentName+", Batch: "+ batch+", in group: " +groupNumber+", School name: "+schoolName;

    }



}

class CybertekObject{
    public static void main(String[] args) {
        CybertekStudents student1 = new CybertekStudents("Ayse", 17, "Batch18");
        student1.schoolName="Harvard";
        System.out.println(student1);//Name: Ayse, Batch: Batch18, in group: 17, School name:  Harvard

        CybertekStudents student2 = new CybertekStudents("Lil", 12, "Batch17");
        System.out.println(student2);//Name: Lil, Batch: Batch17, in group: 12, School name: Cybertek University
    }
}
