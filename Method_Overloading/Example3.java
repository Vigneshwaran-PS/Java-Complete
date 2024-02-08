package Method_Overloading;

public class Example3 {

    public static void test(){
        System.out.println("Test with No arguments");
    }

    public static void test(int a){
        System.out.println("Test with one arguments");
    }

    public static void test(int a , int b){
        System.out.println("Test with Two arguments");
    }

    public static void test(int a , int b , int c){
        System.out.println("Test with Three arguments");
    }


    public static void main(String[] args) {
        test(34);
        test();
        test(34,53,234);
        test(4,21);
    }
}
