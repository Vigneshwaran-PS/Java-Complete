package Control_Statement;

import javax.management.relation.Role;
import java.util.Scanner;

public class Infinite_while_loop_2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Give input : ");

        while(s.hasNext()){
            String name = s.next();
            System.out.println("Name : "+name);
        }

//       This won't reach because the above loop is infinite
//        while(s.hasNext()){
//            int rollno = s.nextInt();
//            System.out.println("Roll No : "+ rollno);
//        }
    }
}
