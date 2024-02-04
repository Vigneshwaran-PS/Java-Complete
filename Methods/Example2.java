package Methods;

public class Example2 {
    void out1(){
        System.out.println("From out 1");
    }

    static void out2(){
        System.out.println("From out 2");
    }

    String out3(){
        return "From out 3";
    }

    static String out4(){
        return "From out 4";
    }
}


class Main{
    public static void main(String[] args) {
        Example2 obj = new Example2();
        obj.out1();
        Example2.out2();
        System.out.println(obj.out3());
        System.out.println(Example2.out4());
    }
}
