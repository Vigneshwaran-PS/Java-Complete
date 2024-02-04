package Runtime_Arguments_Passing;


import java.io.DataInputStream;

public class DataInputStreamReader_Class {

    public static void main(String[] args)throws Exception {
        DataInputStream dis = new DataInputStream(System.in);
        System.out.println("Enter String : ");
        String str = dis.readLine();
        System.out.println("Enter Integer : ");
        int i = dis.readInt();
        dis.readLine();
        System.out.println("Enter float :");
        float f = dis.readFloat();
        System.out.println("Enter Double : ");
        double d = dis.readDouble();
        System.out.println("Enter Character : ");
        char c = dis.readChar();
        System.out.println("Enter Boolean : ");
        boolean b = dis.readBoolean();
    }
}
