package this_keyword;

class Student{
    String name ;
    int rollNo;

    Student(String name , int rollNo){
        this.name = name;  // "this" keyword is used to refer the current class instance variable
        this.rollNo = rollNo; // which removes the confusion between instance variable and parameter that having same name
    }

    void display(){
        System.out.println("Name : "+name);
        System.out.println("Roll No : "+rollNo);
    }
}
public class Example1 {
    public static void main(String[] args) {
        Student s = new Student("Geto" , 23);
        s.display();
    }
}
