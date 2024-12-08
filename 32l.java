// 1 практика

public class StringBufferAndStringBuilderExample {
    public static void main(String[] args) {
        // Создаем экземпляр StringBuilder
        StringBuilder stringBuilder = new StringBuilder("Hello");
        
        // 1. append() - добавляет строку в конец
        stringBuilder.append(" World");
        System.out.println("После append: " + stringBuilder); // Hello World

        // 2. insert() - вставляет строку по указанному индексу
        stringBuilder.insert(5, ",");
        System.out.println("После insert: " + stringBuilder); // Hello, World

        // 3. delete() - удаляет часть строки от start до end
        stringBuilder.delete(5, 6);
        System.out.println("После delete: " + stringBuilder); // Hello World

        // 4. replace() - заменяет часть строки на другую строку
        stringBuilder.replace(6, 11, "Java");
        System.out.println("После replace: " + stringBuilder); // Hello Java

        // 5. reverse() - разворачивает строку
        stringBuilder.reverse();
        System.out.println("После reverse: " + stringBuilder); // avaJ olleH

        // Создаем экземпляр StringBuffer
        StringBuffer stringBuffer = new StringBuffer("Goodbye");

        // 6. append() - добавляет строку в конец
        stringBuffer.append(" World");
        System.out.println("После append: " + stringBuffer); // Goodbye World

        // 7. insert() - вставляет строку по указанному индексу
        stringBuffer.insert(7, ",");
        System.out.println("После insert: " + stringBuffer); // Goodbye, World

        // 8. delete() - удаляет часть строки от start до end
        stringBuffer.delete(7, 8);
        System.out.println("После delete: " + stringBuffer); // Goodbye World

        // 9. replace() - заменяет часть строки на другую строку
        stringBuffer.replace(8, 13, "Java");
        System.out.println("После replace: " + stringBuffer); // Goodbye Java

        // 10. capacity() - возвращает емкость буфера
        System.out.println("Емкость StringBuffer: " + stringBuffer.capacity()); // Показать емкость буфера

        // 11. length() - возвращает длину строки
        System.out.println("Длина StringBuffer: " + stringBuffer.length()); // Показать длину строки
    }
}

// 2 практика

// 1
String str = "Hello, World!";
StringBuffer stringBuffer = new StringBuffer(str); // Преобразование String в StringBuffer
StringBuilder stringBuilder = new StringBuilder(str); // Преобразование String в StringBuilder

// 2
StringBuffer stringBuffer = new StringBuffer("Hello, World!");
String strFromBuffer = stringBuffer.toString(); // Преобразование StringBuffer в String

StringBuilder stringBuilder = new StringBuilder("Hello, World!");
String strFromBuilder = stringBuilder.toString(); // Преобразование StringBuilder в String

// 3
StringBuffer stringBuffer = new StringBuffer("Hello, World!");
StringBuilder stringBuilderFromBuffer = new StringBuilder(stringBuffer.toString()); // StringBuffer в StringBuilder

StringBuilder stringBuilder = new StringBuilder("Hello, World!");
StringBuffer stringBufferFromBuilder = new StringBuffer(stringBuilder.toString()); // StringBuilder в StringBuffer
