package day37_Contructors;

public class InstanceBlocks {

    static {
        System.out.println("static block");
    }

    {
        System.out.println("Instance block");
    }

    public static void main(String[] args) {
        InstanceBlocks obj = new InstanceBlocks();

        InstanceBlocks obj2 = new InstanceBlocks();
    }

    {
        System.out.println("Instance block2");
    }
}

/*
static block
Instance block
Instance block
 */

/*
static block
Instance block
Instance block2
Instance block
Instance block2
 */