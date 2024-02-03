package Runtime_Arguments_Passing;

public class Example1 {

    public static void main(String[] args) {
        // need to pass argument in configuration before run the program
        //if value1 = 10 and value2 = 20 then concat be 1020 because the input parameter is String type
        System.out.println("value1 : " + args[0]);
        System.out.println("value2 : " + args[1]);
        System.out.println("Concat : "+ (args[0]+args[1]));
    }
}
