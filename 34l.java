// 1 практика

// В Java классы исключений используются для обработки ошибок и исключительных ситуаций, которые могут возникнуть во время выполнения программы. Исключения позволяют разработчикам управлять ошибками более эффективно и обеспечивать стабильность и предсказуемость работы приложений.

// 2 практика

// 1
public class ArithmeticExceptionExample {
    public static void main(String[] args) {
        try {
            int result = 10 / 0; // Деление на ноль
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}

// 2
public class ArrayIndexOutOfBoundsExceptionExample {
    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        try {
            int value = array[5]; // Доступ к недопустимому индексу
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}

// 3
public class IllegalArgumentExceptionExample {
    public static void main(String[] args) {
        try {
            setAge(-5); // Неправильный возраст
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    public static void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Возраст не может быть отрицательным.");
        }
        System.out.println("Возраст установлен: " + age);
    }
}

// 4
public class ClassCastExceptionExample {
    public static void main(String[] args) {
        Object obj = new Integer(100);
        try {
            String str = (String) obj; // Неверное приведение типов
        } catch (ClassCastException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}

// 5
public class NullPointerExceptionExample {
    public static void main(String[] args) {
        String str = null;
        try {
            int length = str.length(); // Попытка вызвать метод на null
        } catch (NullPointerException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
