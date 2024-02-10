package Instanceof_operator;


class Sample{

}

class Original extends Sample{

}
public class Example2 {
    public static void main(String[] args) {
        Original obj = new Original();
        System.out.println(obj instanceof Sample);

//        Example2 e ;
//        System.out.println(e instanceof Example2);  // error because e must be initialized

    }
}
