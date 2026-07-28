package test.java.com.example;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Тесты для калькулятора площади треугольника")
class TriangleAreaCalculatorTest {

    private static final double DELTA = 0.0001;

    @Test
    @DisplayName("Площадь прямоугольного треугольника 3-4-5")
    void testRightTriangle() {
        assertEquals(6.0, TriangleAreaCalculator.calculateArea(3, 4, 5), DELTA);
    }

    @Test
    @DisplayName("Площадь равностороннего треугольника")
    void testEquilateralTriangle() {
        assertEquals(0.4330, TriangleAreaCalculator.calculateArea(1, 1, 1), DELTA);
    }

    @ParameterizedTest
    @DisplayName("Параметризованный тест площади треугольника")
    @CsvSource({
            "3, 4, 5, 6.0",
            "5, 5, 6, 12.0",
            "6, 8, 10, 24.0"
    })
    void testTriangleAreaWithParameters(double a, double b, double c, double expected) {
        assertEquals(expected, TriangleAreaCalculator.calculateArea(a, b, c), DELTA);
    }

    @Test
    @DisplayName("Отрицательная сторона выбрасывает исключение")
    void testNegativeSide() {
        assertThrows(IllegalArgumentException.class,
                () -> TriangleAreaCalculator.calculateArea(-1, 2, 3));
    }

    @Test
    @DisplayName("Стороны не образуют треугольник")
    void testNotATriangle() {
        assertThrows(IllegalArgumentException.class,
                () -> TriangleAreaCalculator.calculateArea(1, 2, 10));
    }
}