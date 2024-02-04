package Runtime_Arguments_Passing;

public class Example4 {
    public static void main(String[] args) {
        for(int i=0;i<args.length;i+=2){
            System.out.println(i+"th position : "+ args[i]);
        }
    }
}
