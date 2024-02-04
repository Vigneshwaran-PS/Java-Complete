package Runtime_Arguments_Passing;

public class Example2 {
    public static void main(String[] args) {
        //We can pass any number of arguments whether it is string or int , it will take as String array
        for (int i=0;i<args.length;i++){
            System.out.print(args[i]+" ");
        }
    }
}
