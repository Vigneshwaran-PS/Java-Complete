package Method_Overriding;


class Animal{
    void bark(){
        System.out.println("Animal is Barking");
    }

    void out(){
        System.out.println("From Method out");
    }
}

class Dog extends  Animal{
    void bark(){
        this.out();
        System.out.println("Dog is Barking");
    }
}
public class Example1 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.bark();
    }
}
