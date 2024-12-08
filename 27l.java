// 1 практика

// Определяем интерфейс с вложенным классом
interface MyInterface {
    void interfaceMethod();

    // Вложенный статический класс
    class NestedClass {
        public void nestedMethod() {
            System.out.println("Method of Nested Class");
        }
    }
}

// Реализация интерфейса
class MyClass implements MyInterface {
    @Override
    public void interfaceMethod() {
        System.out.println("Implementation of interfaceMethod");
    }
}

public class Main {
    public static void main(String[] args) {
        // Создаем экземпляр внешнего класса
        MyClass myClass = new MyClass();
        myClass.interfaceMethod();

        // Создаем экземпляр вложенного класса
        MyInterface.NestedClass nestedClass = new MyInterface.NestedClass();
        nestedClass.nestedMethod(); // Вызов метода вложенного класса
    }
}

//Интерфейс MyInterface: В этом интерфейсе мы определяем метод interfaceMethod() и вложенный статический класс NestedClass.
//Вложенный класс NestedClass: Этот класс содержит метод nestedMethod(), который просто выводит сообщение на экран.
//Класс MyClass: Этот класс реализует интерфейс MyInterface и предоставляет реализацию метода interfaceMethod().
//Класс Main: В методе main мы создаем экземпляр MyClass и вызываем его метод interfaceMethod(). Затем мы создаем экземпляр вложенного класса NestedClass и вызываем его метод nestedMethod().
