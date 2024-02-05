package this_keyword;

class A{

    void get(){
        System.out.println("From Get Method");
        this.out(); // "this" keyword is used to invoke current class method
                    // without "this" keyword we can invoke the current class method , but compiler will add it invoke that method
    }

    void out(){
        System.out.println("From Out method");
    }
}
public class Example2 {
    public static void main(String[] args) {
        A obj = new A();
        obj.get();
    }
}
