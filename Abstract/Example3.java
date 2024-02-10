package Abstract;


abstract class Sample{

    abstract void hidden();

    Sample(){
        System.out.println("Sample Constructor");
    }
    void concrete(){
        System.out.println("Its a Concrete Method");
    }
}

class Original extends  Sample{

    @Override
    void hidden() {
        System.out.println("Its a Hidden Method");
    }
}
public class Example3 {
    public static void main(String[] args) {
        Sample s = new Original();
        s.concrete();
        s.hidden();
    }
}
