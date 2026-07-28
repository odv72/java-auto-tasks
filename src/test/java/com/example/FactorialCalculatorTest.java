package com.example;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Тесты для калькулятора факториала")
class FactorialCalculatorTest {

    @Test
    @DisplayName("Факториал 0 должен быть равен 1")
    void testFactorialZero() {
        assertEquals(1, FactorialCalculator.factorial(0));
    }

    @Test
    @DisplayName("Факториал 1 должен быть равен 1")
    void testFactorialOne() {
        assertEquals(1, FactorialCalculator.factorial(1));
    }

    @ParameterizedTest
    @DisplayName("Параметризованный тест факториала")
    @CsvSource({
            "2, 2",
            "3, 6",
            "4, 24",
            "5, 120",
            "6, 720"
    })
    void testFactorialWithParameters(int input, long expected) {
        assertEquals(expected, FactorialCalculator.factorial(input));
    }

    @Test
    @DisplayName("Факториал отрицательного числа выбрасывает исключение")
    void testFactorialNegative() {
        assertThrows(IllegalArgumentException.class,
                () -> FactorialCalculator.factorial(-1));
    }
}