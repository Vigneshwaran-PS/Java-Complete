package Covariant_Return_type;

class A{

    A get(){
        return this;
    }
}

class B extends A{

    B get(){
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
