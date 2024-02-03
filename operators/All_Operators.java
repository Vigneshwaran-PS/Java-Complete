package operators;

public class All_Operators {
    public static void main(String ar[]) {

        int a = 10;
        System.out.println(a++);//10
        System.out.println(a);//11

        System.out.println("-------------------------------------------------------");

        int b=a++;      //b = a = 11 // post decrement , so it will assign the value first
        System.out.println(b);  // 11
        System.out.println(b);  // 11
        System.out.println(a);  // 12
        System.out.println(++a); //13
        System.out.println(--a);  //12

        System.out.println("-------------------------------------------------------");

        int x = 100;
        int y = ++x;   // y = 101
        System.out.println(y); //101
        System.out.println(y); //101
        System.out.println(x); //101

        System.out.println("-------------------------------------------------------");

        System.out.println(23>>5);  //0
        System.out.println(23<<5);  //736
        System.out.println(-23>>4);  //=2
        System.out.println(-23<<4);  //-368
        System.out.println(00001011<<5);  //16672
        System.out.println(00001011>>5);  //16

        System.out.println("-------------------------------------------------------");

        System.out.println(5&5);  //5
        System.out.println(10|5);  //15

        System.out.println("-------------------------------------------------------");

        int $ = 10;
        short d = (short)$;//Explicit type conversion
        System.out.println(d);

        System.out.println("-------------------------------------------------------");

        int e = 0b1010;
        System.out.println(e);
        byte f = (byte)256>>1;
        System.out.println(f);
        byte f1 = (byte)(256>>1);
        System.out.println(f1);
        byte g = (byte)256<<1;
        System.out.println(g);
        byte g1 = (byte)(256<<1);
        System.out.println(g1);

        System.out.println("-------------------------------------------------------");

        int i = 045;   //37
        System.out.println(i);
        int decimalValue = 37; // Your decimal value
        String octalValue = Integer.toOctalString(decimalValue);
        System.out.println(octalValue);

        System.out.println("-------------------------------------------------------");

        int j = 0xACAAAAD;
        System.out.println(j);
        int decimal_vale = 10;
        String hexaDecimal = Integer.toHexString(decimal_vale);
        System.out.println(hexaDecimal);

        System.out.println("-------------------------------------------------------");

        System.out.println(0b1000>2);
        System.out.println(01000>512);
        System.out.println(010<9);

        System.out.println("-------------------------------------------------------");

        int h = 'a';
        System.out.println(h);
        System.out.println(+h);
        char k = 65;
        System.out.println(k);
        System.out.println(+k);
        char l = 'a';
        System.out.println(l);
        System.out.println(+l);

        System.out.println("-------------------------------------------------------");

        System.out.println('A'==-65);
        System.out.println(~2);  //-(n+1)


        //Unicode character encoding
        //\u000dSystem.out.println("hello world");


        // decimal - form literal
        float m = 01.0f;
        System.out.println(m);
        //It's also act as decimal literal
        float n = 013.45f;
        System.out.println(n);

        //hexadecimal from error

//        float o = 0x123.45f;
//        System.out.println(o);
    }
}
