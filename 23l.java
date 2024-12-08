// 1 практика

class Calculator {

    // Метод для сложения двух целых чисел
    public int add(int a, int b) {
        return a + b;
    }

    // Метод для сложения трех целых чисел
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Метод для сложения двух чисел с плавающей запятой
    public double add(double a, double b) {
        return a + b;
    }

    // Метод для сложения массива целых чисел
    public int add(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        // Вызов перегруженных методов
        System.out.println("Сумма двух целых чисел: " + calculator.add(5, 10)); // 15
        System.out.println("Сумма трех целых чисел: " + calculator.add(5, 10, 15)); // 30
        System.out.println("Сумма двух чисел с плавающей запятой: " + calculator.add(5.5, 10.5)); // 16.0

        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Сумма массива целых чисел: " + calculator.add(numbers)); // 15
    }
}

// 2 практика

class Animal {
    // Метод, который будет переопределен
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    // Переопределение метода makeSound
    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        myAnimal.makeSound(); // Вывод: Animal makes a sound

        Dog myDog = new Dog();
        myDog.makeSound(); // Вывод: Dog barks

        Animal myDogAsAnimal = new Dog();
        myDogAsAnimal.makeSound(); // Вывод: Dog barks (позволяет полиморфизм)
    }
}

//Если у переопределенного метода и метода суперкласса не совпадает тип возвращаемого значения, это может привести к ошибке компиляции, если тип возвращаемого значения не является подтипом (или тем же типом) возвращаемого значения суперкласса. Однако, если тип возвращаемого значения в подклассе является подтипом возвращаемого значения суперкласса, это допустимо и называется ковариантным возвращаемым типом.

// 3 практика

class Animal {
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }

    // Ошибка: метод не переопределяет метод суперкласса
    // @Override
    public void bark() {
        System.out.println("Woof!");
    }
}

class Cat extends Animal {
    // Ошибка: неправильная сигнатура метода
    // @Override
    public void makeSound(String sound) { // Ошибка компиляции
        System.out.println(sound);
    }
}

public class Main {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        myDog.makeSound(); // Вывод: Dog barks
    }
}

//Когда использование аннотации @Override помогает обнаружить ошибку:
//Неправильное имя метода: Если вы ошиблись в написании имени метода, компилятор выдаст ошибку, если вы используете @Override. Например, если вы напишете makeSoud вместо makeSound, компилятор сообщит об ошибке.

//Неправильные параметры: Если вы измените параметры метода (например, добавите или измените тип параметра), компилятор также выдаст ошибку, указывая, что метод не переопределяет метод суперкласса.

//Неправильный тип возвращаемого значения: Если вы измените тип возвращаемого значения на несовместимый, компилятор выдаст ошибку.
