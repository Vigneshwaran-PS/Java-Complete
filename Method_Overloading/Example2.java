package Method_Overloading;

public class Example2 {

    public  static int average(int a ,int b , int c){
        return (a+b+c)/3;
    }

    public  static int average(int a ,int b){
        return (a+b)/2;
    }

    public static int average(int a , int b , int c , int d){
        return (a+b+c+d)/2;
    }

    public static double average(double a , int b){
        return (a+b)/2;
    }

    public static void main(String[] args) {
        System.out.println(average(2,3));
        System.out.println(average(5.2,3));
        System.out.println(average(5,3,34));
        System.out.println(average(3,5,78,3));
    }
}
