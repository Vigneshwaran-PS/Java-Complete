package Super_Keyword;

class Animal3{
    Animal3(){
        System.out.println("Animal 3 Constructor");
    }
}

class Cat extends Animal3{

    Cat(){
        super();
        System.out.println("Cat is Meowing...........");
    }
}
public class Example4 {
    public static void main(String[] args) {
        Cat c = new Cat();
    }
}
