// 1 практика

public class FormatSpecifiersExample {
    public static void main(String[] args) {
        // Пример переменных для форматирования
        boolean isJavaFun = true; // Логическое значение
        char grade = 'A'; // Символьное значение
        int age = 25; // Целое значение
        double pi = 3.14159; // Десятичное значение с плавающей точкой
        String name = "Alice"; // Строковое значение

        // Использование спецификаторов формата
        System.out.printf("1. Логическое значение: %b%n", isJavaFun); // %b
        System.out.printf("2. Символ: %c%n", grade); // %c
        System.out.printf("3. Возраст: %d лет%n", age); // %d
        System.out.printf("4. Значение числа Пи: %.2f%n", pi); // %f (с округлением до 2 знаков после запятой)
        System.out.printf("5. Имя: %s%n", name); // %s

        // Дополнительно, можно показать использование %n для новой строки
        System.out.printf("6. Это новая строка:%n", name); // %n
    }
}

// 2 практика

// Метод flush() в Java используется для принудительной записи данных из буфера в целевое устройство или поток. Он является частью классов, которые работают с потоками ввода-вывода (I/O), таких как OutputStream, Writer, PrintWriter и других.

// 3 практика

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatExample {
    public static void main(String[] args) {
        // Получаем текущую дату и время
        Date now = new Date();

        // Форматируем дату и время с использованием различных спецификаторов
        String formattedDate = String.format("Текущая дата и время:\n" +
                "Час (00–23): %tH\n" +
                "Час (1–12): %tI\n" +
                "Минуты: %tM\n" +
                "Секунды: %tS\n" +
                "Год (четырехзначный): %tY\n" +
                "Полное название месяца: %tB\n" +
                "Полное название дня недели: %tA\n",
                now, now, now, now, now, now, now);

        // Выводим отформатированную строку
        System.out.println(formattedDate);
    }
}
