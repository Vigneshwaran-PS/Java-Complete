package this_keyword;

class P{

    P(){
        this(69);
        System.out.println("Constructor 1");
    }

    P(int x){
        this(45.5f);
        System.out.println("Constructor 2");
    }

    P(float x){
        this("java");
        System.out.println("Constructor 3");
    }

    P(String x){
        System.out.println("Constructor 4");
    }

}
public class Example3 {
    public static void main(String[] args) {
        P obj = new P();
    }
}
