package Inheritance;

class P{
    P(){
        System.out.println("Constructor P");
    }

    void fun1(){
        System.out.println("From Fun 1");
    }
}

class Q extends P{

    Q(){
        System.out.println("Constructor Q");
    }

    void fun2(){
        System.out.println("From Fun 2");
    }
}

class R extends P{
    R(){
        System.out.println("Constructor R");
    }
    void fun3(){
        System.out.println("From Fun 3");
    }

}
public class Example7 {
    public static void main(String[] args) {
        Q q = new Q();
        R r = new R();
        r.fun3();
        r.fun1();
        q.fun2();
        q.fun1();
    }
}
