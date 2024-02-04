package Constuctor;

public class Parameterized_Constructor {

    String name;
    int rollNo;

    Parameterized_Constructor(String n , int r){
        name = n;
        rollNo = r;
    }

    public void display(){
        System.out.println("Name : "+name);
        System.out.println("Roll no : "+rollNo);
    }

    public static void main(String[] args) {
        Parameterized_Constructor obj = new Parameterized_Constructor("maki" , 23);
        obj.display();
        Parameterized_Constructor obj1 = new Parameterized_Constructor("toji" , 21);
        obj1.display();
    }
}
