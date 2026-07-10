package shapes;

public interface Shape {
    double getPerimeter();
    double getArea();
    String getFillColor();
    String getBorderColor();

    // Дефолтный метод для вывода информации
    default void printInfo() {
        System.out.println("Фигура: " + this.getClass().getSimpleName());
        System.out.println("Периметр: " + String.format("%.2f", getPerimeter()));
        System.out.println("Площадь: " + String.format("%.2f", getArea()));
        System.out.println("Цвет заливки: " + getFillColor());
        System.out.println("Цвет границы: " + getBorderColor());
        System.out.println("------------------------");
    }
}