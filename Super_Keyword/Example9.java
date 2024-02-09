package Super_Keyword;

class Employees{
    private String name ;
    private double salary;

    Employees(String name , double salary){
        this.name = name;
        this.salary = salary;
    }


    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public double getSalary(){
        return salary;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }

    void raiseSalary(int percent){
        salary = salary + salary * percent/100;
    }
}


class Manager extends Employees{

    private double bonus;
    Manager(String name , double salary , double bonus){
        super(name , salary);
        this.bonus = bonus;
    }

    public void setBonus(double bonus){
        this.bonus = bonus;
    }

    public double getBonus(){
        return bonus;
    }

    public double getSalary(){
        return super.getSalary()+bonus;
    }
}
public class Example9 {
    public static void main(String[] args) {
        Employees e = new Employees("maki",20000);
        System.out.println("Before Salary Raise : "+e.getSalary());
        e.raiseSalary(10);
        System.out.println("After Salary Raise : "+e.getSalary());
        Manager m = new Manager("sai",30000,2000);
        System.out.println("Name : "+m.getName() + "\t" + "Salary : "+m.getSalary() + "\t" + "Bonus : " + m.getBonus());

        Employees emp[] = new Employees[4];
        emp[0] = new Employees("geto",20000);
        emp[1] = new Employees("mei",30000);
        emp[2] = new Employees("hina",15000);
        emp[3] = new Employees("raj",10000);

        for(Employees obj : emp){
            System.out.println("Name : "+obj.getName() + "\t" + "Salary : " + obj.getSalary());
        }
    }
}
