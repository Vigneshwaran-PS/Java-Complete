package Inheritance;

class A{
    void fun1(){
        System.out.println("From Base Class");
    }
}

class B extends A{
    void fun2(){
        System.out.println("From Derived Class 1");
    }
}
class C extends B{
    void fun3(){
        System.out.println("From Derived Class 2");
    }
}
public class Example4 {

    public static void main(String[] args) {
        C obj = new C();
        obj.fun1();
        obj.fun2();
        obj.fun3();
    }
}
