package Inheritance;

class Base{

    Base(){
        System.out.println("Base Constructor");
    }
    void fun1(){
        System.out.println("Base class called");
    }
}

class Derived extends Base{
    Derived(){
        System.out.println("Derived Constructor");
    }
    void fun2(){
        System.out.println("Derived class called");
    }
}
public class Example1 {
    public static void main(String[] args) {
        Derived d = new Derived();
        d.fun1();
        d.fun2();
    }
}
