package Super_Keyword;

class Animal{
    String name = "Hyena";
}

class WildAnimals extends Animal{

    String name = "Lion";

    void display(){
        System.out.println("Name : "+name);
        System.out.println("Name : "+super.name);
        System.out.println("Name : "+this.name);
    }
}
public class Example1 {
    public static void main(String[] args) {
        WildAnimals w = new WildAnimals();
        w.display();
    }
}
