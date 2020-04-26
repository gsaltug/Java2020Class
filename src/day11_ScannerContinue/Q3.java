package day11_ScannerContinue;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class Q3 {
    public static void main(String[] args) {

        boolean X = true;
        boolean Y = !X ==false;
        boolean Z = Y;

        if(X){
            System.out.println("1");

        }if(Y){
            System.out.println("2");
        }if(Z){
            System.out.println("z");
        }
    }
}
