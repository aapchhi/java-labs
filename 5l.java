// 1 практика

public class OperatorExamples {
    public static void main(String[] args) {
        // Базовые типы
        int a = 10;
        int b = 5;
        double c = 3.5;
        boolean d = true;
        boolean e = false;

        // Операторы присваивания (= и +=)
        a = b; // Присваивание
        System.out.println("a = " + a); // a = 5

        a += 2; // Увеличение a на 2
        System.out.println("a += 2: " + a); // a = 7

        // Операторы арифметики (+, -, *, /, %)
        int sum = a + b; // Сложение
        System.out.println("a + b = " + sum); // 7 + 5 = 12

        int difference = a - b; // Вычитание
        System.out.println("a - b = " + difference); // 7 - 5 = 2

        int product = a * b; // Умножение
        System.out.println("a * b = " + product); // 7 * 5 = 35

        double quotient = a / c; // Деление
        System.out.println("a / c = " + quotient); // 7 / 3.5 = 2.0

        int remainder = a % b; // Остаток от деления
        System.out.println("a % b = " + remainder); // 7 % 5 = 2

        // Операторы инкремента и декремента (префиксная и постфиксная форма)
        int preIncrement = ++a; // Префиксный инкремент
        System.out.println("Pre-increment: " + preIncrement); // a = 8

        int postIncrement = b++; // Постфиксный инкремент
        System.out.println("Post-increment: " + postIncrement); // b = 5
        System.out.println("After post-increment, b = " + b); // b = 6

        int preDecrement = --a; // Префиксный декремент
        System.out.println("Pre-decrement: " + preDecrement); // a = 7

        int postDecrement = b--; // Постфиксный декремент
        System.out.println("Post-decrement: " + postDecrement); // b = 6
        System.out.println("After post-decrement, b = " + b); // b = 5

        // Логические операторы (==, !=)
        boolean isEqual = (a == b); // Проверка на равенство
        System.out.println("a == b: " + isEqual); // false

        boolean isNotEqual = (a != b); // Проверка на неравенство
        System.out.println("a != b: " + isNotEqual); // true

        // Операторы сравнения (>, >=, <, <=)
        boolean isGreater = (a > b);
        System.out.println("a > b: " + isGreater); // true

        boolean isLessOrEqual = (a <= b);
        System.out.println("a <= b: " + isLessOrEqual); // false

        // Операторы побитового сдвига (>>, >>>, <<)
        int shiftRight = a >> 1; // Сдвиг вправо
        System.out.println("a >> 1: " + shiftRight); // 7 >> 1 = 3

        int shiftLeft = a << 1; // Сдвиг влево
        System.out.println("a << 1: " + shiftLeft); // 7 << 1 = 14

        // Операторы побитовых операций (&, |, ^)
        int bitwiseAnd = a & b; // Побитовое И
        System.out.println("a & b: " + bitwiseAnd); // 7 & 5 = 5

        int bitwiseOr = a | b; // Побитовое ИЛИ
        System.out.println("a | b: " + bitwiseOr); // 7 | 5 = 7

        int bitwiseXor = a ^ b; // Побитовое исключающее ИЛИ
        System.out.println("a ^ b: " + bitwiseXor); // 7 ^

  // 2 практика

  class Animal {
    // Базовый класс
}

class Dog extends Animal {
    // Подкласс
}

class Cat extends Animal {
    // Другой подкласс
}

public class InstanceofExample {
    public static void main(String[] args) {
        Animal animal = new Dog(); // Создаем объект типа Dog
        Dog dog = new Dog(); // Создаем объект типа Dog
        Cat cat = new Cat(); // Создаем объект типа Cat
        Animal nullAnimal = null; // null-объект

        // Примеры использования instanceof
        System.out.println("animal instanceof Dog: " + (animal instanceof Dog)); // true
        System.out.println("animal instanceof Animal: " + (animal instanceof Animal)); // true
        System.out.println("dog instanceof Dog: " + (dog instanceof Dog)); // true
        System.out.println("dog instanceof Animal: " + (dog instanceof Animal)); // true
        System.out.println("cat instanceof Cat: " + (cat instanceof Cat)); // true
        System.out.println("cat instanceof Animal: " + (cat instanceof Animal)); // true

        // Проверка на несовпадение
        System.out.println("dog instanceof Cat: " + (dog instanceof Cat)); // false
        System.out.println("cat instanceof Dog: " + (cat instanceof Dog)); // false

        // Применение instanceof к null-объекту
        System.out.println("nullAnimal instanceof Animal: " + (nullAnimal instanceof Animal)); // false
        System.out.println("nullAnimal instanceof Dog: " + (nullAnimal instanceof Dog)); // false
        System.out.println("nullAnimal instanceof Cat: " + (nullAnimal instanceof Cat)); // false
    }
}
