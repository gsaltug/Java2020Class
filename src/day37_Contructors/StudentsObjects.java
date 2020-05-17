package day37_Contructors;

public class StudentsObjects {
    public static void main(String[] args) {
        Student student1 = new Student("Lina", 23, 'F', "Yale");
  //      student1.setStudentInfo("Lina", 23, 'F', "Yale");

        System.out.println(student1);//Student name: Lina AGE: 23gender: FUni name: Yale

        Student student2 = new Student("Gozde", 35, 'F', "Princeton");
        System.out.println(student2);


    }







}
