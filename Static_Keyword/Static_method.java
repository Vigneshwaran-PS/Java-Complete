package Static_Keyword;


class Employee{
    String name;
    int age;
    static String roll ;

    Employee(String n , int a){
        name = n;
        age = a;
    }

    static void roll(){
        roll = "Backend Developer";
    }
    void display(){
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
        System.out.println("Role : "+roll);
    }
}
public class Static_method {
    public static void main(String[] args) {

        Employee.roll();
        Employee obj1 = new Employee("maki",21);
        Employee obj2 = new Employee("sai",23);
        Employee obj3 = new Employee("toji",26);

        obj1.display();
        obj2.display();
        obj3.display();
    }

}
