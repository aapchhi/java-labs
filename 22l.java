// 1 практика

// Родительский класс
class Parent {
    String name;

    // Конструктор родительского класса
    Parent(String name) {
        this.name = name;
        System.out.println("Parent constructor called: " + name);
    }

    // Метод родительского класса
    void display() {
        System.out.println("Parent name: " + name);
    }
}

// Дочерний класс
class Child extends Parent {
    String name;

    // Конструктор дочернего класса
    Child(String parentName, String childName) {
        // Вызов конструктора родительского класса
        super(parentName);
        this.name = childName;
        System.out.println("Child constructor called: " + childName);
    }

    // Метод дочернего класса
    void display() {
        // Вызов метода родительского класса
        super.display(); // Вызов метода родительского класса
        System.out.println("Child name: " + name);
    }

    void showNames() {
        // Доступ к полю родительского класса
        System.out.println("Accessing parent name: " + super.name);
        System.out.println("Accessing child name: " + this.name);
    }
}

public class Main {
    public static void main(String[] args) {
        Child child = new Child("ParentName", "ChildName");
        child.display(); // Выводит имена родителя и ребенка
        child.showNames(); // Показывает доступ к полям
    }
}

// 2 практика

//В примере, если переменная a и метод method() определены только в классе A, а класс B не добавляет никаких новых полей или методов, то при вызове метода method() объекта класса C произойдет следующее:

//Доступ к переменной a:

//В методе method() класса C используется super.a. Это обращение к переменной a родительского класса A через super. Поскольку a определена в классе A, это обращение будет корректным, и вы сможете получить доступ к значению a из класса A. Если a не инициализирована, то она будет иметь значение по умолчанию для типа int, то есть 0.
//Вызов метода method():

//В методе method() класса C вызывается super.method(). Это обращение к методу method() родительского класса A. Поскольку метод method() определен в классе A, этот вызов также будет корректным. Если в методе method() класса A есть какой-то код, он будет выполнен.

// 3 практика

class A {
    int a;
    int b;
    int c;
    int z;

    // Конструктор по умолчанию
    public A() {
        this(0, 0, 0); // Вызов конструктора с тремя параметрами
    }

    // Конструктор с одним параметром
    public A(int a) {
        this(a, 0, 0); // Вызов конструктора с тремя параметрами
    }

    // Конструктор с двумя параметрами
    public A(int a, int b) {
        this(a, b, 0); // Вызов конструктора с тремя параметрами
    }

    // Конструктор с тремя параметрами
    public A(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        z = 1; // Инициализация z
    }
}
