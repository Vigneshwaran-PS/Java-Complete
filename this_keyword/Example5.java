package this_keyword;

class L{

    M obj;
    L(M obj){
        this.obj = obj;
    }

    void display(){
        System.out.println(obj.data);
    }
}

class M{
    int data = 10;

    M(){
        L obj = new L(this);
        obj.display();
    }
}
public class Example5 {
    public static void main(String[] args) {
        M m = new M();
    }
}
