package Interface;

interface Shape{
    void draw();

    static void display(){
        System.out.println("static method from interface");
    }
}

class Rectangle implements Shape{
    @Override
    public void draw() {
        System.out.println("Drawing Rectangle");
    }
}
public class Static_Method_With_Body {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.draw();
    }
}
