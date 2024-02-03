package operators;

public class Logical_And_Bitwise_Operator {

    public static void main(String[] args) {


        int a = 10;
        int b = 20;
        int c = 30;

        //the logical  && operator doesn't check the second condition if first condition is false
        //it checks the second condition only if first condition is true
        System.out.println(a > b && b > c);

        //the bitwise & operator always checks the both condition
        System.out.println(a > b & a > c);

        //the logical || operator doesn't check the second condition if first condition is true
        //it checks the second condition only if first condition is false
        System.out.println(a > b || a < c);

        //the bitwise | operator always checks the both condition
        System.out.println(a > b | b < c);

        System.out.println((a>b && b<c) || (a<b && b<c));
        System.out.println((a>b | b<c) || (a<b & b<c));


        System.out.println("-----------------------------------------");

        int d = 10;
        int e = 7;
        int f = 25;

        //the first condition (d<e) is false so it won't check the second condition so d won't increment
        System.out.println(d < e && d++ < f);
        System.out.println(d);

        // it checks both condition so d value incremented
        System.out.println(d < e & d++ < f);
        System.out.println(d);

        //the first condition is true so it won't check and increment the second condition
        System.out.println(d > e || d++ < f);
        System.out.println(d);

        // it checks both condition so d value incremented
        System.out.println(d > e | d++ < f);
        System.out.println(d);
    }
}
