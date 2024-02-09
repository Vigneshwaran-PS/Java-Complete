package Covariant_Return_type;
class X{
    X foo(){
        return this;
    }

    void print(){
        System.out.println("Inside the Class X");
    }
}

class Y extends X{

    Y foo(){
        return this;
    }

    void print(){
        System.out.println("Inside the Class Y");
    }
}

class Z extends X{

    Z foo(){
        return  this;
    }

    void print(){
        System.out.println("Inside the Class Z");
    }
}
public class Example3 {
    public static void main(String[] args) {
        X x = new X();
        x.foo().print();

        Y y = new Y();
        y.foo().print();;

        Z z = new Z();
        z.foo().print();
    }
}
