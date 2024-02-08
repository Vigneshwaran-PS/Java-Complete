package Inheritance;

class A{
    A(){
        System.out.println("Constructor A");
    }
    void fun1(){
        System.out.println("From Base Class");
    }
}

class B extends A{
    B(){
        System.out.println("Constructor B");
    }
    void fun2(){
        System.out.println("From Derived Class 1");
    }
}
class C extends B{
    C(){
        System.out.println("Constructor C");
    }
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
