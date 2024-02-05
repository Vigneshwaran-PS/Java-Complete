package Instance_Initializer_Block;


class A{
    {
        System.out.println("Initializer Block 1");
    }

    A(){
        System.out.println("Constructor A");
    }

    {
        System.out.println("Initializer Block 2");
    }
}

class B extends A{
    {
        System.out.println("Initializer Block 3");
    }

    B(){
        System.out.println("Constructor B");
    }

    {
        System.out.println("Initializer Block 4");
    }
}
public class Example2 {
    public static void main(String[] args) {
        A obj = new B();
    }
}
