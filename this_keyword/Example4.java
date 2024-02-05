package this_keyword;

class Sample{
    void display(Sample x){
        System.out.println("Method is invoked");
    }

    void get(){
        display(this);
    }
}
public class Example4 {
    public static void main(String[] args) {
        Sample s = new Sample();
        s.get();
    }
}
