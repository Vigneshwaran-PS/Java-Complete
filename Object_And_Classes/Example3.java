package Object_And_Classes;

public class Example3 {
    public static void main(String[] args) {
        Example3 ex = new Example3();
        ex.get();
    }

    void get(){
        out("Welcome");
    }

    void out(String a){
        System.out.println(a);
    }
}
