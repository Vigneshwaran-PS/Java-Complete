package Runtime_Arguments_Passing;

public class Example6 {

    public static void main(String[] args) {
        int sum = 0;
        for(String s : args){
            sum = sum + Integer.parseInt(s);
        }

        System.out.println("Sum of Passing parameter : "+sum);
    }
}
