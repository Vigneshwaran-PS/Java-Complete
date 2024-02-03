package operators;

public class Unary_Numeric_Promoter {
    public static void main(String[] args) {
        int a = 'A';
        System.out.println(a);
        System.out.println((char)a);
        System.out.println(+a);

        System.out.println("------------------------------");

        char b = 'a';
        System.out.println(+b);
        System.out.println("hello"+b);
        System.out.println("hello"+ +b);

        System.out.println("-------------------------------");

        int c = 97;
        System.out.println(c);
        System.out.println(-c);
        System.out.println(+c);

        System.out.println("-------------------------------");

        int d = 'b';
        System.out.println(d);
        System.out.println(+d);


        System.out.println("-------------------------------");


        char e = 'B';
        System.out.println(e);
        System.out.println(+e);

        System.out.println("-------------------------------");

        char f = 122;
        System.out.println(f);
        System.out.println(+f);


        System.out.println("-------------------------------");

        String res = 10>4?"true":"false";
        System.out.println(res);

    }
}
