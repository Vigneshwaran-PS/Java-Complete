package Final_Keyword;


final class Sample{
    void display(){
        System.out.println("Hello World");
    }
}

/* Final class cannot be extended by any other class */

//class Original extends Sample{
//
//}

public class Example3 {

    public static void main(String[] args) {
        Sample s = new Sample();
       // Original o = new Original();
    }
}
