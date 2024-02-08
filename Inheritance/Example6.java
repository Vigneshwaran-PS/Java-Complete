package Inheritance;


import java.util.Scanner;

class Employee{
    String name;
    int emp_id;

    void details(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Employee Name : ");
        name = s.next();
        System.out.println("Enter Employee Id : ");
        emp_id = s.nextInt();
    }
}

class Salary extends Employee{
    int gross_salary , net_salary;
    void calc(int basic_salary, int house_rent_allowance , int travel_allowance , int provided_fund){
        details();
        gross_salary = basic_salary + house_rent_allowance + travel_allowance;
        net_salary = gross_salary - provided_fund;
    }
}

class Payroll extends Salary{
    void out(){
        calc(25000,1000,800,500);
        System.out.println("Employee Name : "+ name);
        System.out.println("Employee id : "+emp_id);
        System.out.println("Employee Gross Salary : "+gross_salary);
        System.out.println("Employee Net Salary : " + net_salary);
    }
}
public class Example6 {
    public static void main(String[] args) {
        Payroll p = new Payroll();
        p.out();
    }
}
