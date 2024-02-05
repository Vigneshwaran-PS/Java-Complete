package Static_Keyword;

public class Static_Variable_1 {
    int a = 10;

    static void display(Static_Variable_1 obj){
        System.out.println(obj.a);
    }

    public static void main(String ar[]){
        Static_Variable_1 obj = new Static_Variable_1();
        display(obj);
    }
}
