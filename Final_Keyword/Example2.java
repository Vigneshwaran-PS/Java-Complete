package Final_Keyword;


class A{
    final void display(){
        System.out.println("Hello World");
    }
}

class B extends  A{

    // we can't override the final method
//    void display(){
//        System.out.println("Bye World");
//    }
}
public class Example2 {
    public static void main(String[] args) {
        B b = new B();
        b.display();
    }
}
