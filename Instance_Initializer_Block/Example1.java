package Instance_Initializer_Block;

class Sample{
    {
        System.out.println("Initializer Block 1");
    }
    Sample(){
        System.out.println("From Sample constructor");
    }
    {
        System.out.println("Initializer Block 2");
    }
}
public class Example1 {

    public static void main(String ar[]){
        Sample s = new Sample();
    }
}
