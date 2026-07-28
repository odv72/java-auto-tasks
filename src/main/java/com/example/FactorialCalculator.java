package main.java.com.example;

public class FactorialCalculator {

    /**
     * Вычисляет факториал числа n
     * @param n неотрицательное целое число
     * @return факториал числа n
     * @throws IllegalArgumentException если n < 0
     */
    public static long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Факториал определён только для неотрицательных чисел");
        }
        if (n == 0 || n == 1) {
            return 1;
        }

        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}