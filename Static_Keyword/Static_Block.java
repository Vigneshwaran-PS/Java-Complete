package Static_Keyword;

class Sample{

    Sample(){
        System.out.println("Sample Constructor");
    }


    //static block
    static {
        System.out.println("From Static block");
    }
}
public class Static_Block {

    public static void main(String[] args) {
        Sample obj1 = new Sample();
        Sample obj2 = new Sample();
        Sample obj3 = new Sample();
        Sample obj4 = new Sample();
        Sample obj5 = new Sample();
    }
}
