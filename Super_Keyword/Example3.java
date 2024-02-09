package Super_Keyword;

class Animal2{
    void bark(){
        System.out.println("Animal is Barking");
    }
}

class Dog extends Animal2{

    void bark(){
        super.bark();
        //this.bark(); this leads to be infinite method call
        System.out.println("Dog is Barking");
    }
}
public class Example3 {
    public static void main(String[] args) {
        Dog d = new Dog();
       d.bark();
    }
}
