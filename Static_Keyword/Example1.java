package Static_Keyword;


public class Example1 {

    static int a = 10;

    Example1(){
        a++;
        System.out.println("Value of 'a' is : "+a);
    }
    public static void main(String[] args) {
        Example1 obj1 = new Example1();
        Example1 obj2 = new Example1();
        Example1 obj3 = new Example1();
    }
}
