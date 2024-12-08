// 1 практика
public class DataTypesExample {
    public static void main(String[] args) {
        // Целочисленные типы
        byte byteValue = 10;          // Пример значения
        byte byteNull = 0;            // Нулевое значение

        short shortValue = 1000;      // Пример значения
        short shortNull = 0;           // Нулевое значение

        int intValue = 100000;         // Пример значения
        int intNull = 0;               // Нулевое значение

        long longValue = 10000000000L; // Пример значения
        long longNull = 0L;            // Нулевое значение

        // С плавающей точкой
        float floatValue = 10.5f;      // Пример значения
        float floatNull = 0.0f;         // Нулевое значение

        double doubleValue = 20.99;     // Пример значения
        double doubleNull = 0.0;         // Нулевое значение

        // Символьный тип
        char charValue = 'A';           // Пример значения
        char charNull = '\u0000';       // Нулевое значение (символ нуля)

        // Булевский тип
        boolean boolValue = true;       // Пример значения
        boolean boolNull = false;       // Нулевое значение

        // Вывод значений на консоль
        System.out.println("byte: " + byteValue + ", null: " + byteNull);
        System.out.println("short: " + shortValue + ", null: " + shortNull);
        System.out.println("int: " + intValue + ", null: " + intNull);
        System.out.println("long: " + longValue + ", null: " + longNull);
        System.out.println("float: " + floatValue + ", null: " + floatNull);
        System.out.println("double: " + doubleValue + ", null: " + doubleNull);
        System.out.println("char: " + charValue + ", null: " + charNull);
        System.out.println("boolean: " + boolValue + ", null: " + boolNull);
    }
}

// 2 практика

public class UnicodeExample {
    public static void main(String[] args) {
        // Используем символы в формате Unicode для имени "Анастасия"
        String name = "\u0410\u043D\u0430\u0441\u0442\u0430\u0441\u0438\u044F";
        
        // Выводим имя на консоль
        System.out.println(name);
    }
}

// 3 практика
// Когда мы пытаемся выполнить int c = a + b;, компилятор не может найти переменную b, так как она была объявлена в локальной области видимости блока и недоступна за его пределами. Это приведет к ошибке компиляции

// 4 практика 

public class OperatorOverloadingExample {
    public static void main(String[] args) {
        // Пример с базовыми типами
        int number = 10;
        double decimal = 5.5;
        
        // Конкатенация строки с базовыми типами
        String result1 = "The integer is: " + number; // Конкатенация с int
        String result2 = "The double is: " + decimal; // Конкатенация с double
        
        // Выводим результаты
        System.out.println(result1); // Вывод: The integer is: 10
        System.out.println(result2); // Вывод: The double is: 5.5

        // Пример с объектами
        String name = "Анастасия";
        String greeting = "Hello, " + name + "!"; // Конкатенация с объектом String
        
        // Выводим результат
        System.out.println(greeting); // Вывод: Hello, Анастасия!

        // Пример с другими объектами
        Person person = new Person("John", 30);
        String personInfo = "Person Info: " + person; // Конкатенация с объектом Person
        
        // Выводим результат
        System.out.println(personInfo); // Вывод: Person Info: Person{name='John', age=30}
    }
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Переопределяем метод toString для корректного отображения информации о человеке
    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}

// 5 практика

public class ArithmeticExample {
    public static void main(String[] args) {
        int intValue = 5;
        double doubleValue = 3.2;

        // Сложение int и double
        double result1 = intValue + doubleValue; // int автоматически преобразуется в double
        System.out.println("Result of int + double: " + result1); // Вывод: 8.2
    }
}

// объяснение: В этом примере переменная intValue (типа int) складывается с переменной doubleValue (типа double). Java автоматически преобразует int в double, чтобы выполнить операцию сложения. Результат будет типа double.

public class ArithmeticExample {
    public static void main(String[] args) {
        int intValue = 5;
        String stringValue = "10";

        // Конкатенация int и String
        String result2 = intValue + stringValue; // int преобразуется в String
        System.out.println("Result of int + String: " + result2); // Вывод: 510
    }
}

// объяснение: Здесь переменная intValue (типа int) складывается со строкой stringValue (типа String). В этом случае int автоматически преобразуется в String, и происходит конкатенация. Результат будет строкой "510".

// 6 практика

// 1
public class NarrowingConversionExample {
    public static void main(String[] args) {
        double doubleValue = 9.78;
        int intValue = (int) doubleValue; // Сужающее преобразование

        System.out.println("Original double value: " + doubleValue); // Вывод: 9.78
        System.out.println("Converted int value: " + intValue); // Вывод: 9
    }
}

// 2
public class NarrowingConversionExample {
    public static void main(String[] args) {
        float floatValue = 300.5f;
        byte byteValue = (byte) floatValue; // Сужающее преобразование

        System.out.println("Original float value: " + floatValue); // Вывод: 300.5
        System.out.println("Converted byte value: " + byteValue); // Вывод: 44
    }
}

// 3
public class NarrowingConversionExample {
    public static void main(String[] args) {
        long longValue = 100000L;
        short shortValue = (short) longValue; // Сужающее преобразование

        System.out.println("Original long value: " + longValue); // Вывод: 100000
        System.out.println("Converted short value: " + shortValue); // Вывод: -46
    }
}

// 7 практика 

int a = 120;
byte b = a + 10;           // Ошибка компиляции, так как результат должно быть int
byte c = (byte)(a + 10);   // c будет равно -126 (переполнение)
byte d = a + 1;            // Ошибка компиляции, так как a + 1 возвращает int

Произойдет ошибка компиляции.

// 8 практика

import java.util.List;

public class Main {
    public static void main(String[] args) {
        var list = List.of(1, 2, 3);
        for (var element : list) {
            System.out.print(element+" ");
        }
    }
}
