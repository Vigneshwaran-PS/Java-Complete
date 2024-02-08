package Inheritance;

class Animal{
    void eat(){
        System.out.println("Animal is Eating");
    }
}

class Lion extends Animal{
    void roar(){
        System.out.println("Lion is roaring");
    }
}
public class Example2 {
    public static void main(String[] args) {
        Lion l = new Lion();
        l.roar();
        l.eat();
    }
}
