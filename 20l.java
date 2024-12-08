// 1 практика

// 1
//Ссылка на текущий объект: this используется для ссылки на текущий экземпляр класса. Это особенно полезно, когда имена параметров конструктора или методов совпадают с именами полей класса.
public class Parent {
    protected int value;

    public Parent(int value) {
        this.value = value; // Используем this для различения поля и параметра
    }
}

public class Child extends Parent {
    private int childValue;

    public Child(int value, int childValue) {
        super(value); // Вызов конструктора родительского класса
        this.childValue = childValue; // Используем this для установки значения поля
    }
}

// 2
//Вызов других конструкторов: this может использоваться для вызова другого конструктора в том же классе.
public class Example {
    private int a;
    private int b;

    public Example(int a) {
        this(a, 0); // Вызов другого конструктора
    }

    public Example(int a, int b) {
        this.a = a;
        this.b = b;
    }
}

// 3
//Ссылка на родительский класс: super используется для ссылки на родительский класс. Это позволяет вам обращаться к полям и методам родительского класса.
public class Parent {
    protected int value;

    public Parent(int value) {
        this.value = value;
    }

    public void display() {
        System.out.println("Value: " + value);
    }
}

public class Child extends Parent {
    private int childValue;

    public Child(int value, int childValue) {
        super(value); // Вызов конструктора родительского класса
        this.childValue = childValue;
    }

    public void display() {
        super.display(); // Вызов метода родительского класса
        System.out.println("Child Value: " + childValue);
    }
}

// 4
//Вызов конструктора родительского класса: super также используется для вызова конструктора родительского класса. Это необходимо, если родительский класс не имеет конструктора по умолчанию или если вы хотите инициализировать родительский класс с определенными значениями.
public class Parent {
    public Parent() {
        System.out.println("Parent constructor");
    }
}

public class Child extends Parent {
    public Child() {
        super(); // Явный вызов конструктора родительского класса
        System.out.println("Child constructor");
    }
}

// пример использования this и super
public class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name; // Инициализация поля
    }

    public void makeSound() {
        System.out.println(name + " makes a sound.");
    }
}

public class Dog extends Animal {
    private String breed;

    public Dog(String name, String breed) {
        super(name); // Вызов конструктора родительского класса
        this.breed = breed; // Инициализация поля
    }

    @Override
    public void makeSound() {
        super.makeSound(); // Вызов метода родительского класса
        System.out.println(name + " barks.");
    }

    public void display() {
        System.out.println("Breed: " + breed);
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy", "Golden Retriever");
        dog.makeSound(); // Выводит: Buddy makes a sound. Buddy barks.
        dog.display(); // Выводит: Breed: Golden Retriever
    }
}

// 2 практика

//private:

//Члены класса, объявленные с модификатором private, доступны только внутри самого класса. Они недоступны в подклассах и других классах.
//В примере, поле a4 и метод method4() являются private и не будут доступны в классах B и C.
//protected:

//Члены класса, объявленные с модификатором protected, доступны внутри самого класса, в подклассах (даже если они находятся в других пакетах) и в классах того же пакета.
//В примере, поле a3 и метод method3() будут доступны в классе B и в классе C.
//public:

//Члены класса, объявленные с модификатором public, доступны из любого другого класса, независимо от пакета.
//В примере, поле a2 и метод method2() будут доступны в классах B и C, а также из любого другого класса.
//Спецификатор по умолчанию (package-private):

//Если модификатор доступа не указан, то по умолчанию используется package-private. Это означает, что члены класса доступны только в пределах одного пакета.
//В примере, поле a1 и метод method1() будут доступны в классах B и C, если они находятся в том же пакете, что и класс A.
