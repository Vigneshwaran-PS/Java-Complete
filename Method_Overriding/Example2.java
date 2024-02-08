package Method_Overriding;

class Bank{
    int getRateOfInterest(){
        return 0;
    }
}

class SBI extends Bank{
    int getRateOfInterest(){
        return 6;
    }
}

class ICICI extends Bank{
    int getRateOfInterest(){
        return 7;
    }
}


class AXIS extends Bank{
    int getRateOfInterest(){
        return 12;
    }
}
public class Example2 {

    public static void main(String[] args) {
        SBI sbi = new SBI();
        AXIS axis = new AXIS();
        ICICI icici = new ICICI();
        System.out.println("SBI Rate of Interest : "+ sbi.getRateOfInterest());
        System.out.println("AXIS Rate of Interest : "+ axis.getRateOfInterest());
        System.out.println("ICICI Rate of Interest : "+ icici.getRateOfInterest());
    }
}
