package Instanceof_operator;


class A{

}

class B extends A{

}

public class Example3 {
    public static void main(String[] args) {
        A obj = null;
        System.out.println(obj instanceof A);
        B obj1 = null;
        System.out.println(obj instanceof B);
    }
}
