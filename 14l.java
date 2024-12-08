// 1 практика

// 1
public class A {
    public final int a;

    // Конструктор
    public A(int value) {
        this.a = value; // Инициализация в конструкторе
    }
}

// Пример использования
public class Main {
    public static void main(String[] args) {
        A obj = new A(10);
        System.out.println("a: " + obj.a); // Вывод: a: 10
    }
}

// 2
public class A {
    public final int a = 5; // Инициализация в месте объявления
}

// Пример использования
public class Main {
    public static void main(String[] args) {
        A obj = new A();
        System.out.println("a: " + obj.a); // Вывод: a: 5
    }
}

// 3
public class A {
    public final int a;

    // Блок инициализации
    {
        a = 20; // Инициализация в блоке инициализации
    }
}

// Пример использования
public class Main {
    public static void main(String[] args) {
        A obj = new A();
        System.out.println("a: " + obj.a); // Вывод: a: 20
    }
}

// 4
public class A {
    public static final int a;

    // Статический блок
    static {
        a = 30; // Инициализация в статическом блоке
    }
}

// Пример использования
public class Main {
    public static void main(String[] args) {
        System.out.println("a: " + A.a); // Вывод: a: 30
    }
}
