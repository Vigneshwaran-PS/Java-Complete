package Method_Overloading;

public class Example1 {

    public static int max(int a , int b){
        return Math.max(a, b);
    }

    // This will lead to ambiguity problem
//    public static float max(int a , int b){
//        return Math.max(a, b);
//    }

    public static double max(double a , double b){
        return Math.max(a,b);
    }

    public static char max(char a , char b){
        return (char)Math.max(a,b);
    }

    public static void main(String[] args) {
        System.out.println(max(3,5));
        System.out.println(max(45.32,234.5));
        System.out.println(max('p','x'));
    }
}
