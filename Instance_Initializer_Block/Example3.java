package Instance_Initializer_Block;


class X{
    int a = 10;
    int b = 20;
    int c = a+b;

    int i = m();

    X(){
        System.out.println("Constructor X");
    }

    {
        System.out.println("Welcome");
    }
    {
        System.out.println("bye");
    }

    int m(){
        System.out.println("m method is called");
        System.out.println("Addition : "+c);
        return  100;
    }
}
public class Example3 {

    public static void main(String ar[]){
        X obj = new X();
    }
}
