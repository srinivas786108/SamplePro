package Pack3;

public class DataTypeRange {
    public static void main(String[] args) {
        byte a=10;
        System.out.println(Byte.MIN_VALUE);
        System.out.println(Byte.MAX_VALUE);

        short b=20;
        System.out.println(Short.MIN_VALUE);
        System.out.println(Short.MAX_VALUE);

        System.out.println("Size of byte: " + (Byte.SIZE/8) + " bytes.");
        System.out.println("Size of short: " + (Short.SIZE/8) + " bytes.");
        System.out.println("Size of int: " + (Integer.SIZE/8) + " bytes.");
        System.out.println("Size of long: " + (Long.SIZE/8) + " bytes.");
        System.out.println("Size of char: " + (Character.SIZE/8) + " bytes.");
        System.out.println("Size of float: " + (Float.SIZE/8) + " bytes.");
        System.out.println("Size of double: " + (Double.SIZE/8) + " bytes.");


    }
}
