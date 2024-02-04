package Constuctor;

import java.util.Scanner;

class Student{
    String name ;
    int rollNo;
    int sportsMark;

    int social , science , maths;

    Student(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Sports Marks : ");
        sportsMark = s.nextInt();
    }

    Student(String n , int r){
        name = n;
        rollNo = r;
        System.out.println("Name : "+name);
        System.out.println("Roll No : "+rollNo);
    }

    Student(int soc , int sci , int math){
        social= soc;
        science = sci;
        maths = math;
        System.out.println("Social mark : "+social);
        System.out.println("Science mark : "+science);
        System.out.println("maths mark : "+maths);
    }

    Student(Student s1 , Student s2){
        float total = s1.sportsMark + s2.maths + s2.social + s2.science;
        float avg = total/4;
        System.out.println("Total Marks Bro Obtained :"+total);
        System.out.println("Average mark Bro Obtained : "+avg);
    }
}
public class Example1 {
    public static void main(String[] args) {
        Student obj1 = new Student();
        Student obj2 = new Student("Mei" , 101);
        Student obj3 = new Student(89,69,60);
        Student obj4 = new Student(obj1,obj3);
    }
}
