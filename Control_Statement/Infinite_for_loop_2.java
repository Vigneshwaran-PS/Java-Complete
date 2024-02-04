package Control_Statement;

import java.util.Scanner;

public class Infinite_for_loop_2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        for(;s.hasNext();){
            String name = s.next();
            System.out.println("Name : "+name);
        }

//        for(int i=0;i<args.length; System.out.println("hi")){
//
//        }

        // No error , loop will terminated
        for(int i=0;i< args.length;i++);
    }
}
