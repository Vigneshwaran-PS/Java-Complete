package Methods;

public class Instance_variable {

    int a;

    void display(){
        System.out.println(a++);
    }

    public static void main(String ar[]){
        Instance_variable obj1 = new Instance_variable();
        obj1.display();
        obj1.display();
        obj1.display();

        Instance_variable obj2 = new Instance_variable();
        obj2.display();
        obj2.display();
        obj2.display();
    }
}
