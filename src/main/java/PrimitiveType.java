public class PrimitiveType {

    public static int byteValue() {
        return (int) Math.pow(2, 7) - 1;
    }

    public static int shortValue() {
        return (int) Math.pow(2, 15) - 1;
    }

    public static int intValue() {
        return (int) Math.pow(2, 31) - 1;
    }

    public static long longValue()    {
        return (long) Math.pow(2, 63) - 1;
    }
}
