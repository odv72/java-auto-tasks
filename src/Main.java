public class Main {
    public static void main(String[] args) {
        System.out.println("=== Задание 1 ===");
        printThreeWords();

        System.out.println("\n=== Задание 2 ===");
        checkSumSign();

        System.out.println("\n=== Задание 3 ===");
        printColor();

        System.out.println("\n=== Задание 4 ===");
        compareNumbers();

        System.out.println("\n=== Задание 5 ===");
        System.out.println("Сумма 5 и 10 в пределах 10-20: " + checkSumRange(5, 10));
        System.out.println("Сумма 5 и 3 в пределах 10-20: " + checkSumRange(5, 3));

        System.out.println("\n=== Задание 6 ===");
        checkPositiveNegative(5);
        checkPositiveNegative(-3);
        checkPositiveNegative(0);

        System.out.println("\n=== Задание 7 ===");
        System.out.println("Число -5 отрицательное? " + isNegative(-5));
        System.out.println("Число 3 отрицательное? " + isNegative(3));
        System.out.println("Число 0 отрицательное? " + isNegative(0));

        System.out.println("\n=== Задание 8 ===");
        printStringMultipleTimes("Привет!", 3);

        System.out.println("\n=== Задание 9 ===");
        System.out.println("2024 год високосный? " + isLeapYear(2024));
        System.out.println("2023 год високосный? " + isLeapYear(2023));
        System.out.println("1900 год високосный? " + isLeapYear(1900));
        System.out.println("2000 год високосный? " + isLeapYear(2000));

        System.out.println("\n=== Задание 10 ===");
        int[] binaryArray = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.print("Исходный массив: ");
        printArray(binaryArray);
        invertArray(binaryArray);
        System.out.print("Инвертированный массив: ");
        printArray(binaryArray);

        System.out.println("\n=== Задание 11 ===");
        int[] hundredArray = createArrayHundred();
        System.out.print("Массив 1-100: ");
        printArray(hundredArray);

        System.out.println("\n=== Задание 12 ===");
        int[] multiplyArray = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.print("Исходный массив: ");
        printArray(multiplyArray);
        multiplyLessThanSix(multiplyArray);
        System.out.print("Измененный массив: ");
        printArray(multiplyArray);

        System.out.println("\n=== Задание 13 ===");
        int[][] diagonalArray = createDiagonalArray(5);
        System.out.println("Квадратный массив с диагоналями:");
        print2DArray(diagonalArray);

        System.out.println("\n=== Задание 14 ===");
        int[] filledArray = createArrayWithValue(5, 7);
        System.out.print("Массив длиной 5 со значением 7: ");
        printArray(filledArray);
    }

    // Методы
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() {
        int a = 10;
        int b = -5;
        int sum = a + b;
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor() {
        int value = 50;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers() {
        int a = 15;
        int b = 10;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    public static boolean checkSumRange(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }

    public static void checkPositiveNegative(int number) {
        if (number >= 0) {
            System.out.println(number + " - положительное число");
        } else {
            System.out.println(number + " - отрицательное число");
        }
    }

    public static boolean isNegative(int number) {
        return number < 0;
    }

    public static void printStringMultipleTimes(String str, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(str);
        }
    }

    public static boolean isLeapYear(int year) {
        if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else if (year % 4 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void invertArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = 1;
            } else {
                array[i] = 0;
            }
        }
    }

    public static int[] createArrayHundred() {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        return array;
    }

    public static void multiplyLessThanSix(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] *= 2;
            }
        }
    }

    public static int[][] createDiagonalArray(int size) {
        int[][] array = new int[size][size];
        for (int i = 0; i < size; i++) {
            array[i][i] = 1; // Главная диагональ
            array[i][size - 1 - i] = 1; // Побочная диагональ
        }
        return array;
    }

    public static int[] createArrayWithValue(int len, int initialValue) {
        int[] array = new int[len];
        for (int i = 0; i < array.length; i++) {
            array[i] = initialValue;
        }
        return array;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void print2DArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}