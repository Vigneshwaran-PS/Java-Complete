package Ambiguity;

public class Example1 {

// this program gives ambiguity because compiler can not decide which method to invoke
    public static void sum(int a , long b){
        System.out.println(a+b);
    }

    public static void sum(long a , int b){
        System.out.println(a+b);
    }

    public static void main(String[] args) {
        //sum(333,34);
    }
}
