package this_keyword;

public class Difference1 {
    String a ;

    void get(String a){
        this.a = a;
        System.out.println("a : "+a);
        out("vignesh");
        out1();
        out2(a);
    }
    void out(String b){
        System.out.println("a : "+a);
        System.out.println("b : "+b);
    }

    void out1(){
        System.out.println("a : "+a);
    }

    void out2(String a){
        System.out.println("a : "+a);
    }



    public static void main(String ar[]){
        Difference1 obj = new Difference1();
        obj.get("welcome");
    }
}
