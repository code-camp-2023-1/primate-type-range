package com.jirengu;

public class PrimitiveDataTypesRange {
    // byte类型能表示的最大值/最小值
    public static byte MAX_BYTE = 127;
    public static byte MIN_BYTE = -128;

    // short类型能表示的最大值/最小值
    public static short MAX_SHORT = 32767;
    public static short MIN_SHORT = -32768;
    // int类型能表示的最大值/最小值
    public static int MAX_INT = 0x7fffffff;
    public static int MIN_INT = 0x80000000;
    // long类型能表示的最大值/最小值
    public static long MAX_LONG = 0x7fffffffffffffffL;
    public static long MIN_LONG = 0x8000000000000000L;

    // float类型能表示的最大值/最小值
    public static float MAX_FLOAT = 0x1.fffffeP+127f;
    public static float MIN_FLOAT = 0x0.000002P-126f;

    // double类型能表示的最大值/最小值
    public static double MAX_DOUBLE = 0x1.fffffffffffffP+1023;
    public static double MIN_DOUBLE = 0x0.0000000000001P-1022;

    // char类型能表示的最大值/最小值？
    public static char MAX_CHAR = '\uFFFF';
    public static char MIN_CHAR = '\u0000';

    public static void main(String[] args) {
        System.out.println("Max byte: "+ MAX_BYTE);
        System.out.println("Min byte: "+ MIN_BYTE);
        System.out.println("Max short: "+ MAX_SHORT);
        System.out.println("Min short: "+ MIN_SHORT);
        System.out.println("Max int: "+ MAX_INT);
        System.out.println("Min int: "+ MIN_INT);
        System.out.println("Max long: "+ MAX_LONG);
        System.out.println("Min long: "+ MIN_LONG);
        System.out.println("Max float: "+ MAX_FLOAT);
        System.out.println("Min float: "+ MIN_FLOAT);
        System.out.println("Max double: "+ MAX_DOUBLE);
        System.out.println("Min double: "+ MIN_DOUBLE);
        System.out.println("Max char: "+ MAX_CHAR);
        System.out.println("Min char: "+ MIN_CHAR);
    }
}
