package Interface;

interface Tree{
    default void tree(){
        System.out.println("Its a tree");
    }

    void display();
}

class MangoTree implements Tree{
    @Override
    public void display() {
        System.out.println("Its a Mango Tree");
    }
}
public class Default_Method_with_Body {
    public static void main(String[] args) {
        MangoTree m = new MangoTree();
        m.display();
        m.tree();
    }
}
