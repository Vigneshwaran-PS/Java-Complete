package Inheritance;


class WildAnimals{
    void eat(){
        System.out.println("Animal is Eating");
    }
}

class Tiger extends WildAnimals{
    void hunting(){
        System.out.println("Tiger is Hunting");
    }
}

class Leopard extends WildAnimals{
    void sleeping(){
        System.out.println("leopard is Sleeping");
    }
}
public class Example8 {
    public static void main(String[] args) {
        Tiger t = new Tiger();
        t.hunting();
        Leopard l = new Leopard();
        l.sleeping();
    }
}
