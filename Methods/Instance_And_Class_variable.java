package Methods;

public class Instance_And_Class_variable {
        static int a = 10;
        int b = 20;

        public static void main(String[] args) {
            Instance_And_Class_variable obj1 = new Instance_And_Class_variable();
            Instance_And_Class_variable obj2 = new Instance_And_Class_variable();

            obj1.a = 11;
            obj1.b = 21;

            System.out.println("a : "+obj1.a);
            System.out.println("a : "+obj1.a);
            System.out.println("b : "+obj1.b);
            System.out.println("b : "+obj1.b);
    }
}
