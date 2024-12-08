// 1 практика

import java.io.FileInputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        FileInputStream fileInputStream = null;

        try {
            // Создаем экземпляр FileInputStream, указывая путь к файлу
            fileInputStream = new FileInputStream("example.txt");

            int byteData;

            // Читаем байты из файла до конца
            while ((byteData = fileInputStream.read()) != -1) {
                // Преобразуем байт в символ и выводим на экран
                char character = (char) byteData;
                System.out.print(character);
            }

        } catch (IOException e) {
            // Обрабатываем возможные исключения, возникающие во время чтения файла
            System.out.println("Произошла ошибка при чтении файла: " + e.getMessage());
        } finally {
            // Закрываем FileInputStream в блоке finally
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    System.out.println("Ошибка при закрытии файла: " + e.getMessage());
                }
            }
        }
    }
}

// 2 практика

import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        FileOutputStream fileOutputStream = null;

        try {
            // Создаем экземпляр FileOutputStream, указывая путь к файлу
            fileOutputStream = new FileOutputStream("output.txt");

            String data = "Привет, мир!"; // Данные для записи

            // Перебираем каждый символ строки и записываем его в файл
            for (char character : data.toCharArray()) {
                // Преобразуем символ в байт и записываем в файл
                fileOutputStream.write(character);
            }

            fileOutputStream.write('\n');

        } catch (IOException e) {
            // Обрабатываем возможные исключения, возникающие во время записи в файл
            System.out.println("Произошла ошибка при записи в файл: " + e.getMessage());
        } finally {
            // Закрываем FileOutputStream в блоке finally
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    System.out.println("Ошибка при закрытии файла: " + e.getMessage());
                }
            }
        }
    }
}

// 3 практика

// Иерархии классов Reader и Writer предназначены для работы с символьными потоками, в отличие от InputStream и OutputStream, которые работают с байтовыми потоками.
// Основные причины для использования Reader и Writer включают:
// * Работа с текстовыми данными:
// Классы Reader и Writer обеспечивают удобные методы для работы с текстовыми данными, поддерживая кодировки символов, что позволяет правильно обрабатывать различные языки и символы.
// * Упрощение работы с символами:
// Классы Reader и Writer могут принимать кодировку, которая автоматически используется для преобразования байтов в символы и обратно. Это помогает избежать проблем с кодировками, когда текст записывается или считывается.

// 4 практика

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        // Используем try-with-resources для автоматического закрытия BufferedReader
        try (BufferedReader reader = new BufferedReader(new FileReader("example.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Ошибка при чтении файла: " + e.getMessage());
        }
    }
}

/**
 * Зачем нужен интерфейс AutoCloseable?
 * Упрощение управления ресурсами: Вместо того чтобы вручную закрывать ресурсы, интерфейс позволяет использовать конструкцию try-with-resources, которая автоматически закрывает ресурс в конце блока try.
 * Обработка исключений: Если внутри блока try происходит исключение, ресурс всё равно будет закрыт, что обеспечивает большую стабильность кода.
 * Чистота кода: Автоматическое закрытие ресурсов делает код более чистым и читабельным.
 */
