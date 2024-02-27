package Abstract;

interface X{
    void a();
    void b();
    void c();
    void d();
}

abstract class Y implements X{
     public void a(){
        System.out.println("Iam a");
    }
}

class Z extends Y{
    public void b(){
        System.out.println("Iam b");
    }
    public void c(){
        System.out.println("Iam c");
    }

    public void d(){
        System.out.println("Iam d");
    }
}
public class Example6 {
    public static void main(String[] args) {
        X obj = new Z();
        obj.a();
        obj.b();
        obj.c();
        obj.d();
    }
}
