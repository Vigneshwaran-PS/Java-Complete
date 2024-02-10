package Covariant_Return_type;

class A{

    A get(){
        System.out.println(this);
        return this;
    }
}

class B extends A{

    B get(){
        System.out.println(this);
        return this;
    }

    void message(){
        System.out.println("Welcome to Covariant return");
    }
}
public class Example1 {
    public static void main(String[] args) {
        new B().get().message();
    }
}
