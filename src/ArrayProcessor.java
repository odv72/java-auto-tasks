package src;

import exceptions.MyArrayDataException;
import exceptions.MyArraySizeException;

public class ArrayProcessor {

    // Основной метод, который обрабатывает массив
    public static int processArray(String[][] array) throws MyArraySizeException, MyArrayDataException {
        // Проверка размера массива
        if (array.length != 4) {
            throw new MyArraySizeException("Ожидается 4 строки, получено: " + array.length);
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i].length != 4) {
                throw new MyArraySizeException(String.format(
                        "Строка %d имеет неверную длину. Ожидается 4, получено: %d",
                        i, array[i].length
                ));
            }
        }

        int sum = 0;

        // Проход по всем элементам и суммирование
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j, array[i][j]);
                }
            }
        }

        return sum;
    }

    // Метод для демонстрации перехвата ArrayIndexOutOfBoundsException
    public static void demonstrateArrayIndexOutOfBounds() {
        System.out.println("\n--- Демонстрация ArrayIndexOutOfBoundsException ---");

        String[][] testArray = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        try {
            // Попытка получить доступ к несуществующему индексу
            System.out.println("Пытаемся получить элемент [4][0]...");
            String element = testArray[4][0]; // Индекс 4 не существует
            System.out.println("Элемент: " + element);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Поймано ArrayIndexOutOfBoundsException!");
            System.out.println("Сообщение: " + e.getMessage());
            System.out.println("Трассировка стека:");
            e.printStackTrace();
        }

        try {
            // Попытка получить доступ к несуществующему индексу в строке
            System.out.println("\nПытаемся получить элемент [0][4]...");
            String element = testArray[0][4]; // Индекс 4 не существует в строке
            System.out.println("Элемент: " + element);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Поймано ArrayIndexOutOfBoundsException!");
            System.out.println("Сообщение: " + e.getMessage());
        }
    }
}