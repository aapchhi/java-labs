// 1 практика

// интерфейс
interface MyInterface {
    // Неабстрактный метод (метод по умолчанию)
    default void display() {
        System.out.println("Display from MyInterface");
    }

    // Статический метод
    static void staticMethod() {
        System.out.println("Static method in MyInterface");
    }
}

// класс, реализующий интерфейс
class MyClass implements MyInterface {
    // Можно переопределить метод display, если это необходимо
    @Override
    public void display() {
        System.out.println("Display from MyClass");
    }
}

// вызов методов интерфейса
public class Main {
    public static void main(String[] args) {
        // Создаем экземпляр класса MyClass
        MyClass myClass = new MyClass();

        // Вызов неабстрактного метода (метода по умолчанию)
        myClass.display(); // Вывод: Display from MyClass

        // Вызов статического метода интерфейса
        MyInterface.staticMethod(); // Вывод: Static method in MyInterface
    }
}

//Неабстрактный метод: В интерфейсе MyInterface определен метод display() как метод по умолчанию. Класс MyClass реализует этот интерфейс и может переопределить метод display(). В данном случае он переопределяет его, чтобы вывести другое сообщение.

//Статический метод: Статический метод staticMethod() в интерфейсе MyInterface может быть вызван без создания экземпляра класса, реализующего этот интерфейс. Он вызывается с помощью имени интерфейса: MyInterface.staticMethod().

//Вызов методов: В методе main создается экземпляр MyClass, и вызывается метод display(), который выводит сообщение, определенное в классе. Затем вызывается статический метод интерфейса, который выводит сообщение, определенное в интерфейсе.

// 2 практика

// Если класс реализует два интерфейса, которые содержат одинаковые неабстрактные методы (методы по умолчанию), то при компиляции возникнет ошибка, так как Java не сможет определить, какой именно метод должен быть использован. Это называется конфликтом методов по умолчанию.

// пример

interface InterfaceA {
    default void display() {
        System.out.println("Display from InterfaceA");
    }
}

interface InterfaceB {
    default void display() {
        System.out.println("Display from InterfaceB");
    }
}

class MyClass implements InterfaceA, InterfaceB {
    // Ошибка компиляции: метод display() конфликтует
}

// исправленный пример

interface InterfaceA {
    default void display() {
        System.out.println("Display from InterfaceA");
    }
}

interface InterfaceB {
    default void display() {
        System.out.println("Display from InterfaceB");
    }
}

class MyClass implements InterfaceA, InterfaceB {
    @Override
    public void display() {
        // Явно указываем, какой метод мы хотим использовать
        InterfaceA.super.display(); // Вызов метода из InterfaceA
        InterfaceB.super.display(); // Вызов метода из InterfaceB
    }
}

public class Main {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.display();
    }
}
