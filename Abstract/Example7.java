package Abstract;


abstract class L{
    abstract void display();
}

class M extends L{
    @Override
    final void display() {
        System.out.println("Final display Method");
    }
}
public class Example7 {
    public static void main(String[] args) {
        M obj =  new M();
        obj.display();
    }
}
