
package day11_ScannerContinue;

public class Browsers {
    public static void main(String[] args) {
        String browsername = "opera";
        switch(browsername){
            case "chrome":
            case "Chrome":
                System.out.println("Chrome is opening...");
                break;
            case "firefox":
            case "FireFox":
                System.out.println("FireFox is opening...");
                break;
            case "safari":
            case "Safari":
                System.out.println("Safari is opening...");
                break;
            case "opera":
            case "Opera":
                System.out.println("Opera is opening...");
                break;
            default:
                System.out.println("Invalid browser name, please give the right browser name.");
                break;//optional since braces close underneath.

        }
    }
}
