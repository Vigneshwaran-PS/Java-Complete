package Super_Keyword;


class Employee{
    String name ;
    int id;

    Employee(String name , int id){
        this.name = name;
        this.id = id;
    }

    void display(){
        System.out.println("Name : "+name);
        System.out.println("Emp Id : "+id);
    }
}

class Qualification extends Employee{
    int experience;
    String qualification , design;
    Qualification(String name , int id ,String qualification ,String design , int exp){
        super(name,id);
        this.experience = exp;
        this.qualification = qualification;
        this.design = design;
    }

    void display(){
        super.display();
        System.out.println("Qualification : "+qualification);
        System.out.println("Experience : "+experience);
        System.out.println("Design : "+design);
    }
}

class Salary extends Employee{
    int basic_salary , deduction , provident_fund , house_rent_allowance , net_salary;
    Salary(String name , int id , int bs , int pf , int ded , int hra){
        super(name , id);
        this.deduction = ded;
        this.basic_salary = bs;
        this.provident_fund = pf;
    }

    void display(){
        super.display();
        net_salary = basic_salary - deduction - provident_fund + house_rent_allowance;
        System.out.println("Basic Salary : "+basic_salary);
        System.out.println("Net Salary : "+net_salary);
    }
}
public class Example8 {
    public static void main(String[] args) {
        Qualification q = new Qualification("viki",101,"BE cse","UI/UX" ,2);
        Salary s = new Salary("Maki",102,200000,1000,1000,3000);
        q.display();;
        s.display();
    }
}
