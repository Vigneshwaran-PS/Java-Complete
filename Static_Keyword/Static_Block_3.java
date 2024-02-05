package Static_Keyword;

class A{
    static {
        System.out.println("Static Block From class 'A' ");
    }

    A(){
        System.out.println("Constructor A");
    }
}

class B extends A{
    static {
        System.out.println("Static Block From class 'B' ");
    }

    B(){
        System.out.println("Constructor B");
    }
}
public class Static_Block_3 {
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();
        //A obj3 = new B();
    }
}
