package Runtime_Arguments_Passing;

public class Example5 {
    public static void main(String[] args) {
        String a = args[0];
        String b = args[1];
        System.out.println("Concat : "+(args[0] + args[1]));

        int c = Integer.parseInt(args[2]);
        int d = Integer.parseInt(args[3]);
        System.out.println("Addition : "+(c+d));

        float e = Float.parseFloat(args[4]);
        float f = Float.parseFloat(args[5]);
        System.out.println("Addition : "+(e+f));

        char g = args[6].charAt(0);//h
        char h = args[7].charAt(0);//i
        System.out.println("Concat : "+ g+h);// hi
        System.out.println("Concat : "+ (g+h));//209
    }
}
