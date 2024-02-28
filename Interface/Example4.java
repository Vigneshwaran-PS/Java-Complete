package Interface;

interface P{
    public static final int a = 10;
    void display();
}
interface Q{
    void display();
}

class R implements P , Q{
    @Override
    public void display() {
        System.out.println("Hello >>>> ");
    }
}
public class Example4 {
    public static void main(String[] args) {
        R obj = new R();
        obj.display();
        System.out.println(obj.a);
    }
}
