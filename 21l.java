// 1 практика

class SuperClass {
    // Метод, который нельзя переопределять
    public final void display() {
        System.out.println("This is a final method in the superclass.");
    }
}

class SubClass extends SuperClass {
    // Попытка переопределить final-метод приведет к ошибке компиляции
    /*
    @Override
    public void display() {
        System.out.println("Trying to override the final method.");
    }
    */
}

public class Main {
    public static void main(String[] args) {
        SuperClass superClass = new SuperClass();
        superClass.display(); // Вывод: This is a final method in the superclass.

        SubClass subClass = new SubClass();
        subClass.display(); // Вывод: This is a final method in the superclass.
    }
}

// 2 практика

// Объявляем класс как final
final class FinalClass {
    public void display() {
        System.out.println("This is a final class.");
    }
}

// Попытка создать подкласс от final-класса
class SubClass extends FinalClass { // Это вызовет ошибку компиляции
    public void show() {
        System.out.println("This is a subclass.");
    }
}

public class Main {
    public static void main(String[] args) {
        FinalClass finalClass = new FinalClass();
        finalClass.display(); // Вывод: This is a final class.

        // Создание экземпляра подкласса (если бы он был допустим)
        // SubClass subClass = new SubClass();
        // subClass.show();
    }
}
