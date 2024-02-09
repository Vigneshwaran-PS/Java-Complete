package Super_Keyword;


class Animal1{
    String name = "Hyena";
}

class WildAnimals1 extends Animal1{

    //String name = "Lion";

    void display(){
        System.out.println("Name : "+name);
        System.out.println("Name : "+super.name);
        System.out.println("Name : "+this.name);
    }
}

public class Example2 {
    public static void main(String[] args) {
        WildAnimals1 w = new WildAnimals1();
        w.display();
    }
}
