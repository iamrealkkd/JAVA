
public class _02_0_full_ch {
    public static void main(String[] args) {

        // Integers --> byte, short, int, long
        // Binary (2), Octal (8), Hexadecimal (16) number system

        // byte b = 5;       // decimal
        // byte b = 0b101;    // Binary
        // byte b = 07;       // 0 - 7 --> octal

        byte b = 0XA;        // hexadecimal (0 - 15) --> 0-9, A, B, C, D, E, F
        short s = 10;
        int i = 4000;
        long l = 3412_56_789;

        // Real numbers
        float f = 10.54f;    // single precision
        // double d = 23.0987; // double precision --> standard way
        double d = 6.022e23; // 6.022 * 10^23

        // Characters
        char c = 'a';        // 'a' --> integer --> binary --> store

        // Boolean
        boolean bool = false;

        System.out.println("Integer values --> " + b + ", " + s + ", " + i + ", " + l);
        System.out.println("Floating values --> " + f + ", " + d);
        System.out.println("Character values --> " + c);
        System.out.println("Boolean values --> " + bool);
    }
}
