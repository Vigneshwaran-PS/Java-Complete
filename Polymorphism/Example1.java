package Polymorphism;


class Bike{
    void run(){
        System.out.println("Running");
    }
}

class Honda extends Bike{
    void run(){
        System.out.println("Driving Honda");
    }
}
public class Example1 {
    public static void main(String[] args) {
        Bike b = new Honda();
        b.run();
    }
}
