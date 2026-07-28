package main.java.com.example;

public class TriangleAreaCalculator {

    /**
     * Вычисляет площадь треугольника по трём сторонам (формула Герона)
     */
    public static double calculateArea(double sideA, double sideB, double sideC) {
        if (sideA <= 0 || sideB <= 0 || sideC <= 0) {
            throw new IllegalArgumentException("Длины сторон должны быть положительными числами");
        }

        if (sideA + sideB <= sideC || sideA + sideC <= sideB || sideB + sideC <= sideA) {
            throw new IllegalArgumentException("Стороны не образуют треугольник");
        }

        double semiPerimeter = (sideA + sideB + sideC) / 2;
        return Math.sqrt(semiPerimeter * (semiPerimeter - sideA) *
                (semiPerimeter - sideB) * (semiPerimeter - sideC));
    }
}