package Static_Keyword;


class Bike{
    String name ;
    int topSpeed;
    int price;

    static int objCount;

    Bike(String n ,int s , int p){
        price = p;
        topSpeed = s;
        name = n;
        objCount++;
    }

    void display(){
        System.out.println("Name : "+name);
        System.out.println("Speed : "+ topSpeed);
        System.out.println("Price : "+price);
    }
}
public class Static_variable {
    public static void main(String[] args) {
        Bike obj1 = new Bike("Ninja",300,1800000);
        //obj1.display();
        Bike obj2 = new Bike("bmw",310,250000);
        //obj2.display();
        Bike obj3 = new Bike("Splender",110,100000);
        //obj3.display();
        Bike obj4 = new Bike("Tvs",90,60000);
        //obj4.display();
        Bike obj5 = new Bike("Vespa",140,20000);
        //obj5.display();
        Bike obj6 = new Bike("Hayabusa",350,4000000);
        //obj6.display();

        System.out.println("Number of object created is : "+Bike.objCount);
    }
}
