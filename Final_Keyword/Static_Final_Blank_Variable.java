package Final_Keyword;

class Vehicle{
    static final int speed;

    static{
        speed = 100;
        System.out.println(speed);
    }
}
public class Static_Final_Blank_Variable {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
    }
}
