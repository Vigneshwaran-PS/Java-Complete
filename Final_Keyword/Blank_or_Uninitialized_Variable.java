package Final_Keyword;


class Bike{

    final int speed;
    Bike(){
        speed = 100;
        System.out.println(speed);
    }
}
public class Blank_or_Uninitialized_Variable {
    public static void main(String[] args) {
        Bike b = new Bike();
    }
}
