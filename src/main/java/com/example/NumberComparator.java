package main.java.com.example;

public class NumberComparator {

    public static int compare(int a, int b) {
        if (a > b) {
            return 1;
        } else if (a == b) {
            return 0;
        } else {
            return -1;
        }
    }

    public static boolean isGreaterThan(int a, int b) {
        return a > b;
    }

    public static boolean isLessThan(int a, int b) {
        return a < b;
    }

    public static boolean areEqual(int a, int b) {
        return a == b;
    }
}