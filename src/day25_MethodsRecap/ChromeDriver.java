package day25_MethodsRecap;

public class ChromeDriver {
    public static void main(String[] args) {
        String str = getDriver1("Opera");
        System.out.println(str);

       String str2 = getDriver2("edge");
        System.out.println(str2);

        String str3 = getDriver3("safari");
        System.out.println(str3);
    }
    public static String getDriver1 (String browserName){
String result =" ";
        switch (browserName.toLowerCase()){
            case "chrome" : result ="Chrome Browser";
                break;
            case "firefox" : result = "Firefox Browser";
            break;

            case "safari" : result= "Safari Browser";
            break;

            case "opera" : result ="Opera Browser";
            break;
            case "edge" : result ="Edge Browser";
            break;

            default : result = "Invalid Driver";


            }

        return result;

}

public static String getDriver2 (String browserName){
    browserName = browserName.toLowerCase();
    String result =" ";
    if(browserName.equals("chrome")){
        result ="Chrome Driver";
    }else if(browserName.equals("firefox")){
        result ="Firefox Driver";
    }else if(browserName.equals("safari")){
        result ="Safari Driver";
    }else if(browserName.equals("edge")){
        result="Edge Driver";
    }else if(browserName.equals("opera")){
        result="Opera Driver";
    }else{
        result="Invalid";
    }

    return result;
}

public static String getDriver3 (String browserName){
        browserName= browserName.toLowerCase();
        String result = (browserName.equals("chrome")) ? "Chrome Driver" : (browserName.equals("safari")) ? "Safari Driver" : (browserName.equals("edge")) ? "Edge Driver" : (browserName.equals("opera"))? "Opera Driver" : "Invalid";
        return result;




}





}