package Super_Keyword;

class A{
    A(){
        System.out.println("From Constructor A");
    }

    void display(){
        System.out.println("From A");
    }
}

class B extends A{
    B(){
        System.out.println("From Constructor B");
    }

    void display(){
        super.display();
        System.out.println("From B");
    }
}

class C extends A{
    C(){
        System.out.println("From Constructor C");
    }

    void display(){
        super.display();
        System.out.println("From c");
    }
}

public class Example7 {
    public static void main(String[] args) {
        B b = new B();
        b.display();

        C c = new C();
        c.display();
    }
}
