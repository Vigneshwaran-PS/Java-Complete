package Abstract;

abstract class A{
    int a = 10;
    private int b = 20;

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void display(){
        System.out.println("Public Method ");
    }
    abstract void print();
}
class B extends A{
    void print(){
        System.out.println("Abstract Method");
        System.out.println(a);
        System.out.println(getB());
    }
}
public class Example5 {
    public static void main(String[] args) {
        B obj = new B();
        obj.print();
        obj.display();
        System.out.println(obj.a);
        System.out.println(obj.getB());
    }
}
