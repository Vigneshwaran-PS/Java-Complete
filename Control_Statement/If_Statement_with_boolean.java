package Control_Statement;

public class If_Statement_with_boolean {


    static boolean b;//false

    //main method overload
    public static void main(){
        System.out.println("default value of boolean b is : "+b);
    }

    public static void main(String[] args) {
        main();
        if(b){
            System.out.println("true");
        }else{
            System.out.println("false");
        }

        if(!b){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}
