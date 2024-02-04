package Methods;

public class Static_class_variable {

    static int a;

    void display(){
        System.out.println(a++);
    }


    public static void main(String[] args) {
        Static_class_variable obj1 = new Static_class_variable();
        obj1.display();
        obj1.display();
        obj1.display();

        Static_class_variable obj2 = new Static_class_variable();
        obj2.display();
        obj2.display();
        obj2.display();
    }
}
