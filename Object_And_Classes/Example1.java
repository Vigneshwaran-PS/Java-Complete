package Object_And_Classes;

public class Example1 {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "sai";
        student1.rollno = 21;
        student1.display();

        Student student2 = new Student();
        student2.name = "raj";
        student2.rollno = 19;
        student2.display();
    }
}


class Student{
    String name;
    int rollno;

    void display(){
        System.out.println("Name : "+name);
        System.out.println("Roll No : "+rollno);
    }
}