// 1 практика

// 1
public class DecodeExample {
    public static void main(String[] args) {
        try {
            // Декодирование десятичного числа
            Integer decimal = Integer.decode("123");
            System.out.println("Десятичное число: " + decimal); // 123

            // Декодирование шестнадцатеричного числа
            Integer hex = Integer.decode("0x1A");
            System.out.println("Шестнадцатеричное число: " + hex); // 26

            // Декодирование восьмеричного числа
            Integer octal = Integer.decode("0123");
            System.out.println("Восьмеричное число: " + octal); // 83

            // Декодирование отрицательного числа
            Integer negative = Integer.decode("-123");
            System.out.println("Отрицательное число: " + negative); // -123

            // Декодирование числа с использованием префикса
            Integer prefixed = Integer.decode("+456");
            System.out.println("Число с префиксом: " + prefixed); // 456

            // Пример с некорректной строкой
            Integer invalid = Integer.decode("abc"); // Это вызовет NumberFormatException
        } catch (NumberFormatException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}

// 2
public class DoubleDecodeExample {
    public static void main(String[] args) {
        try {
            // Декодирование десятичного числа
            Double decimal = Double.decode("123.45");
            System.out.println("Десятичное число: " + decimal); // 123.45

            // Декодирование числа в научной нотации
            Double scientific = Double.decode("1.23e2");
            System.out.println("Научная нотация: " + scientific); // 123.0

            // Декодирование отрицательного числа
            Double negative = Double.decode("-123.45");
            System.out.println("Отрицательное число: " + negative); // -123.45

            // Пример с некорректной строкой
            Double invalid = Double.decode("abc"); // Это вызовет NumberFormatException
        } catch (NumberFormatException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}

// 2 практика

// 1
public class BooleanExample {
    public static void main(String[] args) {
        // Создание экземпляра с помощью конструктора
        Boolean bool1 = new Boolean(true); // Передача примитивного типа boolean
        Boolean bool2 = new Boolean(false); // Передача примитивного типа boolean

        System.out.println("bool1: " + bool1); // true
        System.out.println("bool2: " + bool2); // false
    }
}

// 2
public class BooleanExample {
    public static void main(String[] args) {
        // Использование метода valueOf
        Boolean bool3 = Boolean.valueOf(true);
        Boolean bool4 = Boolean.valueOf(false);

        System.out.println("bool3: " + bool3); // true
        System.out.println("bool4: " + bool4); // false
    }
}

// 3
public class BooleanExample {
    public static void main(String[] args) {
        // Использование метода valueOf с строкой
        Boolean bool5 = Boolean.valueOf("true");
        Boolean bool6 = Boolean.valueOf("false");
        Boolean bool7 = Boolean.valueOf("TRUE");
        Boolean bool8 = Boolean.valueOf("False");
        Boolean bool9 = Boolean.valueOf("anything else"); // Не "true", поэтому будет false

        System.out.println("bool5: " + bool5); // true
        System.out.println("bool6: " + bool6); // false
        System.out.println("bool7: " + bool7); // true
        System.out.println("bool8: " + bool8); // false
        System.out.println("bool9: " + bool9); // false
    }
}

// 4
public class BooleanExample {
    public static void main(String[] args) {
        // Использование литералов
        Boolean bool10 = Boolean.valueOf(true);
        Boolean bool11 = Boolean.valueOf(false);

        System.out.println("bool10: " + bool10); // true
        System.out.println("bool11: " + bool11); // false
    }
}

// 3 практика

// Исключение NullPointerException может быть выброшено во время автораспаковки, если вы пытаетесь распаковать значение null из объекта класса-оболочки.

public class AutoBoxingUnboxingExample {
    public static void main(String[] args) {
        // Создаем объект Integer, который равен null
        Integer integerValue = null;

        try {
            // Попытка распаковки null в примитивный тип int
            int intValue = integerValue; // Это вызовет автораспаковку
            System.out.println("Значение int: " + intValue);
        } catch (NullPointerException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}

// 4 практика

// вывод
a1==i1 false
b1==i1 false
a1==b1 false
a1.equals(i1) -> true
b1.equals(i1) -> true
a1.equals(b1) -> false
a2==i2 true
b2==i2 true
a2==b2 true
a2.equals(i2) -> true
b2.equals(i2) -> true
a2.equals(b2) -> true

//Кэширование объектов Integer: В Java класс Integer использует кэширование для значений от -128 до 127. Это означает, что все экземпляры Integer для этих значений будут ссылаться на один и тот же объект. Поэтому, когда вы создаете Integer для значений в этом диапазоне, они будут равны по ссылке.
//Автоупаковка и автораспаковка: При автоупаковке примитивного типа в объект Integer для значений, находящихся в диапазоне кэша, создается один и тот же объект. При значениях, выходящих за пределы этого диапазона, создаются новые объекты, что приводит к различию  
