package Constuctor;


class Box{
    int length;
    int breadth;
    int height;

    Box(int l, int h ,int b){
        length = l;
        height = h;
        breadth = b;
    }

    public int volume(){
        return length*breadth*height;
    }
}
public class Example2 {
    public static void main(String[] args) {
        Box box = new Box(10,5,20);
        System.out.println("Volume of box is : "+box.volume());
        Box box1 = new Box(6,15,10);
        System.out.println("Volume of box is : "+box1.volume());
    }
}

