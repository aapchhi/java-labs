// 1 практика

//1. @Override
//Назначение: Эта аннотация указывает, что метод переопределяет метод суперкласса. Она помогает избежать ошибок, связанных с неправильным переопределением методов, например, если метод не существует в суперклассе или если его сигнатура не совпадает.

class Parent {
    void display() {
        System.out.println("Display from Parent");
    }
}

class Child extends Parent {
    @Override
    void display() {
        System.out.println("Display from Child");
    }
}

// 2. @Deprecated
// Назначение: Эта аннотация указывает, что элемент (метод, класс, поле и т.д.) устарел и не рекомендуется к использованию. Это может быть связано с тем, что элемент был заменен более эффективным или безопасным вариантом. Компилятор может выдать предупреждение, если устаревший элемент используется.

class OldClass {
    @Deprecated
    void oldMethod() {
        System.out.println("This method is deprecated.");
    }
}

class NewClass {
    void newMethod() {
        System.out.println("This is the new method.");
    }
}

// 3. @SuppressWarnings
// Назначение: Эта аннотация используется для подавления предупреждений компилятора. Она позволяет разработчикам игнорировать определенные предупреждения, которые могут возникать в коде, например, связанные с использованием устаревших методов или неявным приведением типов.

import java.util.ArrayList;
import java.util.List;

class Example {
    @SuppressWarnings("unchecked")
    void exampleMethod() {
        List rawList = new ArrayList(); // Неявное приведение типов
        rawList.add("Hello");
        List<String> stringList = rawList; // Предупреждение о неявном приведении типов
    }
}
