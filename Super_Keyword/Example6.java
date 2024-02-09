package Super_Keyword;

class Student{
    String name , department;
    int rollno;

    Student(int rollno , String name ,String dept){
        this.name = name;
        this.department = dept;
        this.rollno = rollno;
    }

    void display(){
        System.out.println("Name : "+name);
        System.out.println("Roll No : "+rollno);
        System.out.println("Department : "+department);
    }
}

class Address extends Student{

    String addr, town;
    Address(int rollno, String name , String dept , String addr ,String town){
        super(rollno,name,dept);
        this.addr = addr;
        this.town = town;
    }

    void display(){
        super.display();
        System.out.println("Address : "+addr);
        System.out.println("Town : "+town);
    }
}

class Nationality extends Address{
    String national;
    Nationality(int rollno,String name ,String dept ,String addr,String town ,String nationl){
        super(rollno, name, dept, addr, town);
        this.national = nationl;
    }

    void display(){
        super.display();
        System.out.println("Nationality : "+national);
    }
}
public class Example6 {
    public static void main(String[] args) {
        Nationality n = new Nationality(21,"maki","cse","21/1","mdu","india");
        Nationality n1 = new Nationality(22,"geto","It","A1","chn","ohio");
        n.display();
        n1.display();
    }
}
