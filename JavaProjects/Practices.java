public class Practices {
    public static void main(String[] args) {
        Fish Sea = new Fish("");
        Sea.Name = "Catfish";
        System.out.println((new Fish("Kwaku")));
    }
}
class Fish{
    String Name;
    Double speed;
    Fish(String newName){
        Name = newName;
        System.out.println(Name + " is alive");
    }


void swim(Double newSpeed){
    speed = newSpeed;
        System.out.println("Swimming at " + speed + " mph");
    }
String get_name(){
    return Name;
    }
}