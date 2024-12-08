// 1 практика

public class Calculator {

    // Метод для сложения двух целых чисел
    public int add(int a, int b) {
        return a + b;
    }

    // Перегруженный метод для сложения трех целых чисел
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Перегруженный метод с переменным числом параметров
    public int add(int... numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        // Вызов метода с двумя параметрами
        System.out.println("Сумма двух чисел: " + calculator.add(5, 10)); // 15

        // Вызов метода с тремя параметрами
        System.out.println("Сумма трех чисел: " + calculator.add(5, 10, 15)); // 30

        // Вызов метода с переменным числом параметров
        System.out.println("Сумма нескольких чисел: " + calculator.add(1, 2, 3, 4, 5)); // 15
        System.out.println("Сумма без параметров: " + calculator.add()); // 0
    }
}
