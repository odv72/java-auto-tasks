package src;

import exceptions.MyArrayDataException;
import exceptions.MyArraySizeException;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Демонстрация обработки исключений ===\n");

        // Тест 1: Корректный массив 4x4
        testCorrectArray();

        // Тест 2: Массив неправильного размера
        testWrongSizeArray();

        // Тест 3: Массив с некорректными данными
        testInvalidDataArray();

        // Тест 4: Демонстрация ArrayIndexOutOfBoundsException
        ArrayProcessor.demonstrateArrayIndexOutOfBounds();

        System.out.println("\n=== Программа завершена ===");
    }

    private static void testCorrectArray() {
        System.out.println("--- Тест 1: Корректный массив 4x4 ---");
        String[][] correctArray = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        try {
            int result = ArrayProcessor.processArray(correctArray);
            System.out.println("Сумма всех элементов: " + result + "\n");
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println("Ошибка: " + e.getMessage() + "\n");
        }
    }

    private static void testWrongSizeArray() {
        System.out.println("--- Тест 2: Массив неправильного размера ---");
        String[][] wrongSizeArray = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"}
        };

        try {
            int result = ArrayProcessor.processArray(wrongSizeArray);
            System.out.println("Сумма всех элементов: " + result + "\n");
        } catch (MyArraySizeException e) {
            System.out.println("Поймано MyArraySizeException!");
            System.out.println("Ошибка: " + e.getMessage() + "\n");
        } catch (MyArrayDataException e) {
            System.out.println("Ошибка данных: " + e.getMessage() + "\n");
        }
    }

    private static void testInvalidDataArray() {
        System.out.println("--- Тест 3: Массив с некорректными данными ---");
        String[][] invalidDataArray = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "abc"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        try {
            int result = ArrayProcessor.processArray(invalidDataArray);
            System.out.println("Сумма всех элементов: " + result + "\n");
        } catch (MyArrayDataException e) {
            System.out.println("Поймано MyArrayDataException!");
            System.out.println("Ошибка: " + e.getMessage());
            System.out.println("Строка: " + e.getRow() + ", Колонка: " + e.getCol());
            System.out.println("Некорректное значение: '" + e.getInvalidValue() + "'\n");
        } catch (MyArraySizeException e) {
            System.out.println("Ошибка размера: " + e.getMessage() + "\n");
        }
    }
}