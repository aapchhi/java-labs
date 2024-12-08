// Базовый класс для фигур
abstract class Shape {
    public abstract double area();
}

// Подкласс для прямоугольника
class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }
}

// Подкласс для квадрата
class Square extends Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double area() {
        return side * side;
    }
}

// Класс для демонстрации использования
public class ShapeDemo {
    public static void printArea(Shape shape) {
        System.out.println("Area: " + shape.area());
    }

    public static void main(String[] args) {
        Shape rectangle = new Rectangle(5, 10);
        Shape square = new Square(4);

        printArea(rectangle); // Вывод: Area: 50.0
        printArea(square);    // Вывод: Area: 16.0
    }
}
