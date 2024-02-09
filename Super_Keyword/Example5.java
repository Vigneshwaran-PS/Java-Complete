package Super_Keyword;


class Animal4{
    Animal4(){
        System.out.println("Animal 4 Constructor");
    }
}

class Cat1 extends Animal3{

    Cat1(){
        //super(); super keyword is provided by compiler implicitly
        System.out.println("Cat is Meowing...........");
    }
}
public class Example5 {
    public static void main(String[] args) {
        Cat1 c = new Cat1();
    }
}
