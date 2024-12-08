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
