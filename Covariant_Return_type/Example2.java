package Covariant_Return_type;


class P{
    P foo(){
        return this;
    }

    void print(){
        System.out.println("Inside the Class P");
    }
}

class Q extends P{

    P foo(){
        return this;
    }

    void print(){
        System.out.println("Inside the Class Q");
    }
}

class R extends P{

    P foo(){
        return  this;
    }

    void print(){
        System.out.println("Inside the Class R");
    }
}
public class Example2 {
    public static void main(String[] args) {
        P p = new P();
        //p.foo().foo().foo();
        p.foo().print();

        Q q = new Q();
        ((Q)q.foo()).print();

        R r = new R();
        ((R)r.foo()).print();
    }
}
