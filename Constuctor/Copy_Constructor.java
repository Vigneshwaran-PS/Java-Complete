package Constuctor;

public class Copy_Constructor {
    String name;
    int rollNo;

    Copy_Constructor(String n , int r){
        name = n;
        rollNo = r;
    }

    Copy_Constructor(Copy_Constructor c){
        System.out.println("Name : "+c.name);
        System.out.println("Roll No : "+c.rollNo);
    }

    public static void main(String[] args) {
        Copy_Constructor obj1 = new Copy_Constructor("sai" , 21);
        Copy_Constructor obj2 = new Copy_Constructor(obj1);
    }
}
