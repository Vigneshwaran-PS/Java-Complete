package Polymorphism;

class A{
    void display(){
        System.out.println("From A class");
    }
}

class B extends A{

}
public class Example5{
    public static void main(String[] args) {
        A a = new B();
        a.display();
    }
}
