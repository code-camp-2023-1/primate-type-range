package com.jirengu;

public class PrimitiveDataTypesRange {
    // byte类型能表示的最大值/最小值
    public static byte MAX_BYTE = 127;
    public static byte MIN_BYTE = -128;

    // short类型能表示的最大值/最小值
    public static short MAX_SHORT = 32767;
    public static short MIN_SHORT = -32768;
    // int类型能表示的最大值/最小值
    public static int MAX_INT = 2147483647;
    public static int MIN_INT = -2147483648;
    // long类型能表示的最大值/最小值
    public static long MAX_LONG = 9223372036854775807L;
    public static long MIN_LONG = -9223372036854775808L;

    // float类型能表示的最大值/最小值
    public static float MAX_FLOAT = Float.MAX_VALUE;
    public static float MIN_FLOAT = Float.MIN_VALUE;

    // double类型能表示的最大值/最小值
    public static double MAX_DOUBLE = Double.MAX_VALUE;
    public static double MIN_DOUBLE = Double.MIN_VALUE;

    // char类型能表示的最大值/最小值？
    public static char MAX_CHAR = 65535;
    public static char MIN_CHAR = 0;

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
