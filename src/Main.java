import animals.*;
import shapes.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("========== ЗАДАНИЕ 1: ЖИВОТНЫЕ ==========\n");

        // Создаем животных
        Cat cat1 = new Cat("Мурзик");
        Cat cat2 = new Cat("Барсик");
        Cat cat3 = new Cat("Васька");
        Dog dog1 = new Dog("Бобик");
        Dog dog2 = new Dog("Шарик");

        // Проверяем движение
        System.out.println("--- Проверка движения ---");
        cat1.run(150);
        cat1.run(250);
        cat2.swim(5);
        dog1.run(400);
        dog1.run(600);
        dog2.swim(8);
        dog2.swim(15);

        // Создаем миску с едой
        Bowl bowl = new Bowl(30);
        System.out.println("\n--- Проверка миски ---");
        bowl.printInfo();

        // Коты едят
        System.out.println("\n--- Коты кушают ---");
        cat1.eat(bowl, 15);
        cat2.eat(bowl, 10);
        cat3.eat(bowl, 10); // Должно не хватить

        // Добавляем еду и кормим оставшегося кота
        System.out.println("\n--- Добавляем еду ---");
        bowl.addFood(15);
        cat3.eat(bowl, 10);

        // Выводим информацию о сытости
        System.out.println("\n--- Информация о сытости котов ---");
        System.out.println(cat1.getName() + " сыт: " + cat1.isFull());  // Было cat1.name
        System.out.println(cat2.getName() + " сыт: " + cat2.isFull());  // Было cat2.name
        System.out.println(cat3.getName() + " сыт: " + cat3.isFull());  // Было cat3.name

        // Статистика
        System.out.println("\n--- Статистика ---");
        System.out.println("Всего животных: " + Animal.getAnimalCount());
        System.out.println("Всего котов: " + Cat.getCatCount());
        System.out.println("Всего собак: " + Dog.getDogCount());

        // ============================================

        System.out.println("\n\n========== ЗАДАНИЕ 2: ГЕОМЕТРИЧЕСКИЕ ФИГУРЫ ==========\n");

        // Создаем фигуры
        Circle circle = new Circle(5.0, "Красный", "Черный");
        Rectangle rectangle = new Rectangle(4.0, 6.0, "Синий", "Зеленый");
        Triangle triangle = new Triangle(3.0, 4.0, 5.0, "Желтый", "Оранжевый");

        // Выводим информацию
        System.out.println("--- Круг ---");
        circle.printInfo();

        System.out.println("--- Прямоугольник ---");
        rectangle.printInfo();

        System.out.println("--- Треугольник ---");
        triangle.printInfo();
    }
}