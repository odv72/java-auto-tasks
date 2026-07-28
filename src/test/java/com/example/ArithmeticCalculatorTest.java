package test.java.com.example;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Тесты для арифметического калькулятора")
class ArithmeticCalculatorTest {

    @Test
    @DisplayName("Сложение: 10 + 5 = 15")
    void testAddition() {
        assertEquals(15, ArithmeticCalculator.add(10, 5));
    }

    @Test
    @DisplayName("Вычитание: 10 - 5 = 5")
    void testSubtraction() {
        assertEquals(5, ArithmeticCalculator.subtract(10, 5));
    }

    @Test
    @DisplayName("Умножение: 10 * 5 = 50")
    void testMultiplication() {
        assertEquals(50, ArithmeticCalculator.multiply(10, 5));
    }

    @Test
    @DisplayName("Деление: 10 / 5 = 2.0")
    void testDivision() {
        assertEquals(2.0, ArithmeticCalculator.divide(10, 5));
    }

    @ParameterizedTest
    @DisplayName("Параметризованный тест арифметических операций")
    @CsvSource({
            "5, 3, 8, 2, 15, 1.6666666666666667",
            "10, 2, 12, 8, 20, 5.0"
    })
    void testAllOperations(int x, int y, int sum, int diff, int product, double quotient) {
        assertAll("Арифметические операции",
                () -> assertEquals(sum, ArithmeticCalculator.add(x, y)),
                () -> assertEquals(diff, ArithmeticCalculator.subtract(x, y)),
                () -> assertEquals(product, ArithmeticCalculator.multiply(x, y)),
                () -> assertEquals(quotient, ArithmeticCalculator.divide(x, y), 0.0001)
        );
    }

    @Test
    @DisplayName("Деление на ноль выбрасывает исключение")
    void testDivideByZero() {
        assertThrows(ArithmeticException.class,
                () -> ArithmeticCalculator.divide(10, 0));
    }
}