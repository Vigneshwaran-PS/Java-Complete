package Interface;

interface X{
    void method1();
    void method2();
}

interface Y extends X{
    @Override
    void method1();
}

abstract class Z implements X{
    @Override
    public void method1() {
        System.out.println("From Method 1");
    }
}

 abstract class L implements  Y{
    @Override
    public void method2() {
        System.out.println("From Method 2");
    }
}

class M extends L{
    @Override
    public void method1() {
        System.out.println("Non Abstract Method 1");
    }

}

class N extends Z{
    @Override
    public void method2() {
        System.out.println("Non Abstract Method 1");
    }
}

class Example2{
    public static void main(String[] args) {
        N obj = new N();
        obj.method1();
        obj.method2();

        M obj1 = new M();
        obj1.method1();
        obj1.method2();
    }
}
