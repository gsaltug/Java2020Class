package day34_customclass;

public class Dogs {
    String breed;
    String size;
    int age;
    String color;
    String name;

    public void eating(String food){
        System.out.println(name+" is eating "+food);
    }

    public void drinking(String drink){
        System.out.println(name+" is drinking "+drink);
    }

    public void playing(String toy){
        System.out.println(name+" is playing "+toy);
    }

    public void studying(String subject){
        System.out.println(name+" is studying "+subject);
    }

    public void setDogInfo(String DogBreed, String DogSize, int DogAge, String DogColor, String Dogname){
    this.breed= DogBreed;
     this.size = DogSize;
   this.age = DogAge;
    this.color= DogColor;
   this.name=Dogname;
    }

    public String toString(){
        return "Dog Name: "+name+", breed: "+breed+", size: "+size;
    }
}
