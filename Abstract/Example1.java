package Abstract;
abstract class Bike{
    abstract void run();
}

class Activa extends Bike{
    @Override
    void run() {
        System.out.println("Activa");
    }
}
public class Example1 {
    public static void main(String[] args) {
        Bike b = new Activa();
        b.run();
    }
}
