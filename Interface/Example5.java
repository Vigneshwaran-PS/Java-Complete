package Interface;

interface D{
    void display();
}
interface E extends D{

    void print();
}
public class Example5 implements D ,E{
    @Override
    public void display() {
        System.out.println("Method - Display");
    }

    @Override
    public void print() {
        System.out.println("Method - Print");
    }

    public static void main(String[] args) {
        Example5 obj = new Example5();
        obj.display();
        obj.print();
    }
}
