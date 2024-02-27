package Interface;


interface A{
    void display();
}

class B implements A{
    public void display(){
        System.out.println("This is Implemented Method");
    }
}
public class Example1 {
    public static void main(String[] args) {
        A obj = new B();
        obj.display();
    }
}
