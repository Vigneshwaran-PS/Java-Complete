package Runtime_Arguments_Passing;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Buffered_Reader_Class {

    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter String : ");
        String s = br.readLine();
        System.out.println("Enter Integer : ");
        int i = Integer.parseInt(br.readLine());
        System.out.println("Enter Float : ");
        float f = Float.parseFloat(br.readLine());
        System.out.println("Enter Double : ");
        double d = Double.parseDouble(br.readLine());
        System.out.println("Enter Character : ");
        char c = br.readLine().charAt(0);
        System.out.println("Enter booelan :");
        boolean b = Boolean.parseBoolean(br.readLine());
    }
}
