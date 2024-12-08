// 1 практика

// 1
class MathUtils {
    // Перегруженный метод для сложения двух целых чисел
    public int add(int a, int b) {
        return a + b;
    }

    // Перегруженный метод для сложения трех целых чисел
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Перегруженный метод для сложения двух чисел с плавающей запятой
    public double add(double a, double b) {
        return a + b;
    }
}

public class OverloadingExample {
    public static void main(String[] args) {
        MathUtils mathUtils = new MathUtils();

        System.out.println("Сумма двух целых: " + mathUtils.add(5, 10)); // 15
        System.out.println("Сумма трех целых: " + mathUtils.add(5, 10, 15)); // 30
        System.out.println("Сумма двух дробных: " + mathUtils.add(5.5, 10.5)); // 16.0
    }
}

// 2
class Animal {
    // Метод, который будет переопределен
    public void sound() {
        System.out.println("Животное издает звук");
    }
}

class Dog extends Animal {
    // Переопределение метода sound
    @Override
    public void sound() {
        System.out.println("Собака лает");
    }
}

class Cat extends Animal {
    // Переопределение метода sound
    @Override
    public void sound() {
        System.out.println("Кошка мяукает");
    }
}

public class OverridingExample {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        myDog.sound(); // Собака лает
        myCat.sound(); // Кошка мяукает
    }
}
