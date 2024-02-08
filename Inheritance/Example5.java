package Inheritance;

class Animals{
    void eat(){
        System.out.println("Animal is Eating");
    }
}

class Dog extends Animals{
    void bark(){
        System.out.println("Dog is barking");
    }
}

class BabyDog extends Dog{
    void weep(){
        System.out.println("BabyDog is Weeping");
    }
}
public class Example5 {
    public static void main(String[] args) {
        BabyDog b = new BabyDog();
        b.weep();
        b.bark();
        b.eat();
    }
}
