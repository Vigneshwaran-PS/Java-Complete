package Object_And_Classes;

public class Example2 {

    void display(String name , int rollno){
        System.out.println("Name : "+name);
        System.out.println("Roll no : "+rollno);
    }
    public static void main(String[] args) {
        Example2 ex = new Example2();
//        String name = args[0];
//        int roll = Integer.parseInt(args[1]);
//        ex.display(name , roll);

        ex.display(args[0],Integer.parseInt(args[1]));
    }
}
