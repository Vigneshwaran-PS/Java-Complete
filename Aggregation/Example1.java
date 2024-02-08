package Aggregation;

class Address{
    String city ,state ,country;

    Address(String city , String state , String country){
        this.city = city;
        this.country = country;
        this.state = state;
    }
}
class Employee{
    int id ;
    String name;
    Address address;

    Employee(int id, String name , Address address){
        this.address = address;
        this.id = id;
        this.name = name;
    }

    void display(){
        System.out.println("Id : "+id);
        System.out.println("Name : "+name);
        System.out.println("City : "+address.city);
        System.out.println("State : "+address.state);
        System.out.println("Country : "+address.country);
    }
}
public class Example1 {
    public static void main(String[] args) {
        Address a1 = new Address("Mdu","TN","IND");
        Address a2 = new Address("Kerala","TN","IND");

        Employee e1 = new Employee(1,"maki",a1);
        Employee e2 = new Employee(2,"raj",a2);

        e1.display();
        e2.display();
    }
}
