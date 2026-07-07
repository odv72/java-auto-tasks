public class HomeWorkApp {

    // 1
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    // 2
    public static void checkSumSign() {
        int a = 5;
        int b = -3;
        int sum = a + b;
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    // 3
    public static void printColor() {
        int value = 50; // любое значение
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    // 4
    public static void compareNumbers() {
        int a = 10;
        int b = 7;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    // 5
    public static boolean isSumInRange(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }

    // 6
    public static void printPositiveOrNegative(int number) {
        if (number >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    // 7
    public static boolean isNegative(int number) {
        return number < 0;
    }

    // 8
    public static void printStringMultipleTimes(String str, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(str);
        }
    }

    // 9
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

    // 10
    public static void invertArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = 1;
            } else if (array[i] == 1) {
                array[i] = 0;
            }

        }
    }

    // 11
    public static int[] createArrayWithNumbers() {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        return array;
    }

    // 12
    public static void multiplyLessThanSix(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] *= 2;
            }
        }
    }

    // 13
    public static void fillDiagonalWithOnes(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            array[i][i] = 1; // Главная диагональ
            // Побочная диагональ (если нужна)
            array[i][array.length - 1 - i] = 1;
        }
    }

    // 14
    public static int[] createArray(int len, int initialValue) {
        int[] array = new int[len];
        for (int i = 0; i < array.length; i++) {
            array[i] = initialValue;
        }
        return array;
    }


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
        System.out.println("Сумма 5 и 10 в диапазоне 10-20: " + isSumInRange(5, 10));
        System.out.println("Сумма 2 и 3 в диапазоне 10-20: " + isSumInRange(2, 3));

        System.out.println("\n=== Задание 6 ===");
        printPositiveOrNegative(5);
        printPositiveOrNegative(-3);
        printPositiveOrNegative(0);

        System.out.println("\n=== Задание 7 ===");
        System.out.println("Число -5 отрицательное? " + isNegative(-5));
        System.out.println("Число 5 отрицательное? " + isNegative(5));

        System.out.println("\n=== Задание 8 ===");
        printStringMultipleTimes("Hello, World!", 3);

        System.out.println("\n=== Задание 9 ===");
        System.out.println("2020 год високосный? " + isLeapYear(2020));
        System.out.println("2021 год високосный? " + isLeapYear(2021));
        System.out.println("2000 год високосный? " + isLeapYear(2000));
        System.out.println("1900 год високосный? " + isLeapYear(1900));

        System.out.println("\n=== Задание 10 ===");
        int[] binaryArray = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.print("Исходный массив: ");
        printArray(binaryArray);
        invertArray(binaryArray);
        System.out.print("Инвертированный: ");
        printArray(binaryArray);

        System.out.println("\n=== Задание 11 ===");
        int[] numbersArray = createArrayWithNumbers();
        System.out.print("Массив от 1 до 100: первые 10 элементов: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(numbersArray[i] + " ");
        }
        System.out.println("...");

        System.out.println("\n=== Задание 12 ===");
        int[] multiplyArray = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.print("Исходный массив: ");
        printArray(multiplyArray);
        multiplyLessThanSix(multiplyArray);
        System.out.print("После умножения: ");
        printArray(multiplyArray);

        System.out.println("\n=== Задание 13 ===");
        int[][] squareArray = new int[5][5];
        fillDiagonalWithOnes(squareArray);
        System.out.println("Квадратный массив 5x5 с единицами на диагоналях:");
        print2DArray(squareArray);

        System.out.println("\n=== Задание 14 ===");
        int[] customArray = createArray(10, 7);
        System.out.print("Массив длиной 10 со значением 7: ");
        printArray(customArray);
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