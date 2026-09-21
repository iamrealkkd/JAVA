import java.util.Scanner;

class _01_0_ip_op_type {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter byte: ");
        byte b = sc.nextByte();

        System.out.print("Enter short: ");
        short s = sc.nextShort();

        System.out.print("Enter int: ");
        int i = sc.nextInt();

        System.out.print("Enter long: ");
        long l = sc.nextLong();

        System.out.print("Enter float: ");
        float f = sc.nextFloat();

        System.out.print("Enter double: ");
        double d = sc.nextDouble();

        System.out.print("Enter char: ");
        char c = sc.next().charAt(0);

        System.out.print("Enter boolean: ");
        boolean bool = sc.nextBoolean();

        System.out.print("Enter a word: ");
        String word = sc.next();

        sc.nextLine(); // consume leftover newline

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();


        // Showing values and sizes
        System.out.println("\n========== DATA ==========");

        System.out.println("byte     : " + b
                + " | Size: " + Byte.BYTES + " byte");

        System.out.println("short    : " + s
                + " | Size: " + Short.BYTES + " bytes");

        System.out.println("int      : " + i
                + " | Size: " + Integer.BYTES + " bytes");

        System.out.println("long     : " + l
                + " | Size: " + Long.BYTES + " bytes");

        System.out.println("float    : " + f
                + " | Size: " + Float.BYTES + " bytes");

        System.out.println("double   : " + d
                + " | Size: " + Double.BYTES + " bytes");

        System.out.println("char     : " + c
                + " | Size: " + Character.BYTES + " bytes");

        System.out.println("boolean  : " + bool
                + " | Size: Not specified");

        System.out.println("word     : " + word
                + " | Size: Variable");

        System.out.println("sentence : " + sentence
                + " | Size: Variable");

        sc.close();
    }
}