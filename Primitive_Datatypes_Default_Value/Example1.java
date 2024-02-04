package Primitive_Datatypes_Default_Value;

public class Example1 {
    byte a;
    short b;
    int c;
    long d;
    float e;
    double f;
    boolean g;
    String h;
    char i;

    public void display(){
        System.out.println("Default value of byte is : "+a);
        System.out.println("Default value of short is : "+b);
        System.out.println("Default value of int is : "+c);
        System.out.println("Default value of long is : "+d);
        System.out.println("Default value of float is : "+e);
        System.out.println("Default value of double is : "+f);
        System.out.println("Default value of boolean is : "+g);
        System.out.println("Default value of String is : "+h);
        System.out.println("Default value of char is : "+i);
    }

    public static void main(String[] args) {
        Example1 obj = new Example1();
        obj.display();
    }
}
