package Final_Keyword;

public class Final_Parameter {

    static void display(final int a){
        // a = 10;  here the parameter is final so we cannot modify the value of 'a'
        System.out.println(a);
    }

    public static void main(String[] args) {
        display(12);
    }
}
