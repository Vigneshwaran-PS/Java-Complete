package Methods;

public class Example1 {
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

    public static void main(String ar[]){
        Example1 obj = new Example1();
        obj.out1();
        out2();
        System.out.println(obj.out3());
        System.out.println(out4());
    }
}
