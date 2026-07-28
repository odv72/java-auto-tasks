package com.example;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Тесты для сравнения чисел")
class NumberComparatorTest {

    @Test
    @DisplayName("a > b возвращает 1")
    void testCompareGreater() {
        assertEquals(1, NumberComparator.compare(10, 5));
    }

    @Test
    @DisplayName("a == b возвращает 0")
    void testCompareEqual() {
        assertEquals(0, NumberComparator.compare(7, 7));
    }

    @Test
    @DisplayName("a < b возвращает -1")
    void testCompareLess() {
        assertEquals(-1, NumberComparator.compare(3, 8));
    }

    @ParameterizedTest
    @DisplayName("Параметризованный тест сравнения")
    @CsvSource({
            "5, 3, 1",
            "5, 5, 0",
            "3, 5, -1",
            "-5, -3, -1",
            "-3, -5, 1",
            "0, 0, 0"
    })
    void testCompareWithParameters(int a, int b, int expected) {
        assertEquals(expected, NumberComparator.compare(a, b));
    }

    @Test
    @DisplayName("Проверка isGreaterThan")
    void testIsGreaterThan() {
        assertAll("Метод isGreaterThan",
                () -> assertTrue(NumberComparator.isGreaterThan(10, 5)),
                () -> assertFalse(NumberComparator.isGreaterThan(5, 10)),
                () -> assertFalse(NumberComparator.isGreaterThan(5, 5))
        );
    }

    @Test
    @DisplayName("Проверка isLessThan")
    void testIsLessThan() {
        assertAll("Метод isLessThan",
                () -> assertTrue(NumberComparator.isLessThan(5, 10)),
                () -> assertFalse(NumberComparator.isLessThan(10, 5)),
                () -> assertFalse(NumberComparator.isLessThan(5, 5))
        );
    }

    @Test
    @DisplayName("Проверка areEqual")
    void testAreEqual() {
        assertAll("Метод areEqual",
                () -> assertTrue(NumberComparator.areEqual(5, 5)),
                () -> assertFalse(NumberComparator.areEqual(5, 6)),
                () -> assertFalse(NumberComparator.areEqual(-5, 5))
        );
    }
}