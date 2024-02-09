package Polymorphism;


class Bank{
    float rateOfInterest(){
        return 0;
    }
}

class SBI extends Bank{
    float rateOfInterest(){
        return 4.5f;
    }
}

class ICICI extends Bank{
    float rateOfInterest(){
        return 5.6f;
    }
}

class AXIS extends Bank{
    float rateOfInterest(){
        return 9.5f;
    }
}

public class Example2 {
    public static void main(String[] args) {
        Bank b;
        b = new SBI();
        System.out.println("SBI Rate of Interest : "+b.rateOfInterest());
        b = new AXIS();
        System.out.println("AXIS Rate of Interest : "+b.rateOfInterest());
        b = new ICICI();
        System.out.println("ICICI Rate of Interest : "+b.rateOfInterest());
    }
}
