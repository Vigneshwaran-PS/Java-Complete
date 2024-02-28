package Interface;
interface Printable{
    void print();
}
interface Showable{
    void show();
}
class Example3 implements Printable,Showable{
    public void print(){
        System.out.println("Hello");
    }
    public void show(){
        System.out.println("Welcome");
    }

    public static void main(String args[]){
        Example3 obj = new Example3();
        obj.print();
        obj.show();
    }
}

