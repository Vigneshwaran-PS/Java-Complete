package Control_Statement;

import java.util.Scanner;

public class Switch_Case {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter 1st Number : ");
        int num1 = s.nextInt();
        System.out.println("Enter 2nd Number : ");
        int num2 = s.nextInt();
        System.out.println("Enter operator to perform task : ");
        char operator = s.next().charAt(0);

        switch (operator){
            case'+':
                System.out.println("Addition : "+(num1+num2));
                break;
            case'-':
                System.out.println("Substraction : "+(num1-num2));
                break;
            case'*':
                System.out.println("Multiplication : "+(num1*num2));
                break;
            case'/':
                System.out.println("Division : "+(num1/num2));
                break;
            default:
                System.out.println("Enter correct operator");
        }
    }
}
