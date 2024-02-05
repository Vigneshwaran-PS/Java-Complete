package Static_Keyword;


class Sample1{

    static int a = 10;
    static int b = 20;

    Sample1(){
        b++;
    }

    static {
        System.out.println("From static Block");
        a++;
    }

    void display(){
        System.out.println("Value of 'a' is : "+a);
        System.out.println("Value of 'b' is : "+b);
    }
}
public class Static_Block_1 {

    public static void main(String[] args) {

        Sample1 obj1 = new Sample1();
        Sample1 obj2 = new Sample1();
        Sample1 obj3 = new Sample1();
        Sample1 obj4 = new Sample1();
        obj4.display();
    }
}
