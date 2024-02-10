package Abstract;


abstract class Member{
    abstract void welcomeMessage();
}

class Student extends Member{

    @Override
    void welcomeMessage() {
        System.out.println("Welcome Student");
    }
}

class Teacher extends Member{
    @Override
    void welcomeMessage() {
        System.out.println("Welcome Teacher");
    }
}
public class Example4 {
    public static void main(String[] args) {
        Member m1 = new Student();
        m1.welcomeMessage();
        Member m2 = new Teacher();
        m2.welcomeMessage();;

        Member[] m = new Member[3];
        m[0] = new Teacher();
        m[1] = new Student();
        m[2] = new Teacher();

        for(Member mem : m){
            mem.welcomeMessage();
        }
    }
}
