// 1 практика

public class StringMethodsDemo {
    public static void main(String[] args) {
        String str = "Hello, World!";

        // 1. length() - возвращает длину строки
        int length = str.length();
        System.out.println("Длина строки: " + length); // 13

        // 2. charAt(int index) - возвращает символ по указанному индексу
        char charAtIndex = str.charAt(7);
        System.out.println("Символ на индексе 7: " + charAtIndex); // W

        // 3. substring(int beginIndex, int endIndex) - возвращает подстроку
        String substring = str.substring(7, 12);
        System.out.println("Подстрока с 7 по 12 индекс: " + substring); // World

        // 4. toLowerCase() - преобразует строку в нижний регистр
        String lowerCase = str.toLowerCase();
        System.out.println("Строка в нижнем регистре: " + lowerCase); // hello, world!

        // 5. toUpperCase() - преобразует строку в верхний регистр
        String upperCase = str.toUpperCase();
        System.out.println("Строка в верхнем регистре: " + upperCase); // HELLO, WORLD!

        // 6. trim() - удаляет пробелы в начале и конце строки
        String strWithSpaces = "   Hello, World!   ";
        String trimmed = strWithSpaces.trim();
        System.out.println("Строка без пробелов: '" + trimmed + "'"); // 'Hello, World!'

        // 7. replace(char oldChar, char newChar) - заменяет символы в строке
        String replaced = str.replace('o', '0');
        System.out.println("Строка после замены 'o' на '0': " + replaced); // Hell0, W0rld!

        // 8. split(String regex) - разбивает строку на массив строк по заданному разделителю
        String[] words = str.split(", ");
        System.out.println("Слова в строке: ");
        for (String word : words) {
            System.out.println(word); // Hello, World!
        }

        // 9. indexOf(String str) - возвращает индекс первого вхождения подстроки
        int index = str.indexOf("World");
        System.out.println("Индекс 'World': " + index); // 7

        // 10. contains(CharSequence sequence) - проверяет, содержит ли строка указанную последовательность
        boolean contains = str.contains("Hello");
        System.out.println("Содержит 'Hello': " + contains); // true
    }
}

// 2 практика

// 1
import java.util.StringJoiner;

public class StringJoinerExample {
    public static void main(String[] args) {
        // Создаем StringJoiner с разделителем ", "
        StringJoiner joiner = new StringJoiner(", ");

        // Добавляем строки
        joiner.add("Apple");
        joiner.add("Banana");
        joiner.add("Cherry");

        // Получаем результат
        String result = joiner.toString();
        System.out.println("Результат: " + result); // Результат: Apple, Banana, Cherry
    }
}

// 2
import java.util.StringJoiner;

public class StringJoinerWithPrefixSuffix {
    public static void main(String[] args) {
        // Создаем StringJoiner с разделителем ", ", префиксом "[" и суффиксом "]"
        StringJoiner joiner = new StringJoiner(", ", "[", "]");

        // Добавляем строки
        joiner.add("Red");
        joiner.add("Green");
        joiner.add("Blue");

        // Получаем результат
        String result = joiner.toString();
        System.out.println("Результат: " + result); // Результат: [Red, Green, Blue]
    }
}

// 3
import java.util.StringJoiner;

public class CombineStringJoiners {
    public static void main(String[] args) {
        // Создаем первый StringJoiner
        StringJoiner joiner1 = new StringJoiner(", ");
        joiner1.add("John");
        joiner1.add("Jane");

        // Создаем второй StringJoiner
        StringJoiner joiner2 = new StringJoiner(", ");
        joiner2.add("Doe");
        joiner2.add("Smith");

        // Объединяем два StringJoiner
        StringJoiner combinedJoiner = joiner1.merge(joiner2);

        // Получаем результат
        String result = combinedJoiner.toString();
        System.out.println("Объединенный результат: " + result); // Объединенный результат: John, Jane, Doe, Smith
    }
}

// 4
import java.util.StringJoiner;

public class EmptyStringJoiner {
    public static void main(String[] args) {
        // Создаем StringJoiner без элементов
        StringJoiner joiner = new StringJoiner(", ");

        // Получаем результат
        String result = joiner.toString();
        System.out.println("Результат для пустого StringJoiner: '" + result + "'"); // Результат для пустого StringJoiner: ''
    }
}

// 5
import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;

public class StringJoinerWithCollections {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("Mango", "Pineapple", "Grapes");

        // Создаем StringJoiner с разделителем ", "
        StringJoiner joiner = new StringJoiner(", ");

        // Добавляем все фрукты из списка
        for (String fruit : fruits) {
            joiner.add(fruit);
        }

        // Получаем результат
        String result = joiner.toString();
        System.out.println("Фрукты: " + result); // Фрукты: Mango, Pineapple, Grapes
    }
}

// 3 практика

//В языке программирования Java использование тройных двойных кавычек отсутствует, так как такие конструкции не поддерживаются.
//В Java можно использовать одну двойную кавычку для определения строковых литералов.

//Однако В Java 13 и выше появилась возможность использовать текстовые блоки, так называемые литералы блочной строки, которые позволяют определять многострочные строки более удобно.
//Текстовые блоки заключаются в три двойные кавычки:

      // String textBlock = """
                        //  Это текстовый блок,
                        //  который может занимать
                        //  несколько строк.
                        //  """;
