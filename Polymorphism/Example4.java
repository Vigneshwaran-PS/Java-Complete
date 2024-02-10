package Polymorphism;


class Animal{
    void eat(){
        System.out.println("Animal is Eating");
    }
}

class Dog extends Animal{
    void eat(){
        System.out.println("Dog is Eating");
    }
}

class BabyDog extends Dog{
    void eat(){
        System.out.println("BabyDog is Eating");
    }
}
public class Example4 {
    public static void main(String[] args) {
        Animal a1, a2 ,a3;
        a1 = new Animal();
        a2 = new Dog();
        a3 = new BabyDog();
        a1.eat();;
        a2.eat();
        a3.eat();
    }
}
