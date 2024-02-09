package Final_Keyword;

public class Example1 {

    final int a = 10;

    static void change(){
        // a = 20;  we can change the value of final variable
        System.out.println(a);
    }
    public static void main(String[] args) {
            change();
    }
}
