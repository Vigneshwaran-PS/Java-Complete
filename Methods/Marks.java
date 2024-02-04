package Methods;

public class Marks {
    public static void main(String[] args) {
        int id = Integer.parseInt(args[0]);
        String name = args[1];
        int social = Integer.parseInt(args[2]);
        int science = Integer.parseInt(args[3]);
        int maths = Integer.parseInt(args[4]);
        get(name,id,social,science,maths);
    }

    static void get(String name , int id , int social ,int science , int maths){
        float total = social+science+maths;
        float avg = total/3;
        out(name , id ,total , avg);
    }

    static void out(String name , int id , float total , float avg){
        System.out.println("Name : "+name);
        System.out.println("Id : "+id);
        System.out.println("Total Marks : "+total);
        System.out.println("Average : "+avg);
    }
}
