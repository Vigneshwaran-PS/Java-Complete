package Inheritance;


class Student{
    float maths , science , social;

    void details(String name , float rollno){
        System.out.println("Name : "+name);
        System.out.println("Roll No : "+rollno);
    }

    void marks(int sci , int sc ,int math){
        details("Maki",1);
        maths = math;
        science = sci;
        social = sc;
        System.out.println("Maths mark : "+maths);
        System.out.println("social mark : "+social);
        System.out.println("Science mark : "+science);
    }
}
class Result extends Student{

    void calc(){
        marks(60,91,76);
        float total = maths+science+social;
        float average = total / 3;
        System.out.println("Total : "+total);
        System.out.println("Average : "+average);
    }
}
public class Example3 {
    public static void main(String[] args) {
        Result r = new Result();
        r.calc();
    }
}
