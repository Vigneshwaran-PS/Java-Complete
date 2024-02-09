package Polymorphism;

class A{
    void eat(){
        System.out.println("From A class");
    }
}

class B extends A{
    void eat(){
        System.out.println("From B class");
    }
}
public class Example5{
    public static void main(String[] args) {
        A a = new B();
        a.eat();
    }
}
