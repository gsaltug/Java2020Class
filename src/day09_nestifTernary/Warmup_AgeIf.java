package day09_nestifTernary;

public class Warmup_AgeIf {
    public static void main(String[] args) {

        int age = 171;
        String agegroup = " ";

        if (age < 3 && age > 0) {
            agegroup = "baby";
        } else if (age >= 3 && age <= 5) {
            agegroup = "Toddler";
        } else if (age >= 6 && age <= 10) {
            agegroup = "Kid";
        } else if (age >= 10 && age <= 12) {
            agegroup = "Pre-Teen";
        } else if (age >= 13 && age <= 17) {
            agegroup = "Teenager";
        } else if (age >= 18 && age <= 20) {
            agegroup = "Young Adult";
        } else if (age >= 21 && age <= 39) {
            agegroup = "Adult";
        }else if (age >= 40 && age <= 49) {
            agegroup = "Young Middle-Aged Adult";
        } else if (age >= 50 && age <= 54) {
            agegroup = "Middle-Aged";
        } else if (age >= 55 && age <= 64) {
            agegroup = "Very Young Senior Citizen";
        } else if (age >= 65 && age <=74) {
            agegroup = "Young Senior Citizen";
        } else if (age >= 75 && age <= 84) {
            agegroup = "Senior Citizen";
        } else if(age>=85 && age<=150){
            agegroup = "Old Senior";

        }else{
            agegroup="Invalid entry";
        }
        System.out.println(agegroup);

        boolean eligibletobuy = agegroup=="Adult" || agegroup == "Young-Middle Adult";

        if(eligibletobuy){
            System.out.println("You're eligible to buy alcohol");
        }else{
            System.out.println("not healthy");
        }
    }
}
//eligible to buy alcohol.