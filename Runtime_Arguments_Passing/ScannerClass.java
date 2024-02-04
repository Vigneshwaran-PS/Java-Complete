package Runtime_Arguments_Passing;

import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Id : ");
        int i = s.nextInt();
        s.nextLine();
        System.out.println("Enter String : ");
        String sting = s.nextLine();
        System.out.println("Enter a Character : ");
        char c = s.next().charAt(0);
        System.out.println("Enter Boolean value : ");
        Boolean b = s.nextBoolean();
        System.out.println("Enter float number : ");
        Float f = s.nextFloat();
        System.out.println("Enter Double : ");
        Double d = s.nextDouble();
    }
}
