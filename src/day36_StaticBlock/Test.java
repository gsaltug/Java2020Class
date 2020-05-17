package day36_StaticBlock;

public class Test {
    public static void main(String[] args) {
        System.out.println(StaticUsage.tester1);//Name: null, job title: null, salary: $0.0, ID: 0 you have to initilaize it in the static block
        //Name: Gozde, job title: SDET, salary: $120000.0, ID: 123

        System.out.println(StaticBlock3.name);//null
//Muhtar after putting in the block
        System.out.println(StaticBlock3.num);//200
        System.out.println(StaticBlock3.tester1);

    }
}
