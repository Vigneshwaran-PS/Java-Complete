package Polymorphism;

class Shape{
    void display(){
        System.out.println("Drawing....");
    }
}

class Rectangle extends Shape{
    void display(){
        System.out.println("Drawing Rectangle");
    }
}

class Circle extends Shape{
    void display(){
        System.out.println("Drawing Circle");
    }
}

class Triangle extends Shape{
    void display(){
        System.out.println("Drawing Triangle");
    }
}
public class Example3 {
    public static void main(String[] args) {
        Shape s;
        s = new Circle();
        s.display();
        s = new Rectangle();
        s.display();
        s = new Triangle();
        s.display();
    }
}
