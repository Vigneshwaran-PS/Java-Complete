package Instance_Initializer_Block;

class P{

    int a = m();

    P(){
        System.out.println("Construcutor P");
    }


    static {
        System.out.println("From Static Block");
    }

    {
        System.out.println("From Initializer Block");
    }

    int m(){
        System.out.println("Method m is called");
    return 200;
    }

}
public class Example4 {
    public static void main(String[] args) {
        System.out.println("Main Method");
        P obj = new P();
    }
}
