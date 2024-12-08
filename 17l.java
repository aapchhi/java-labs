// 1 практика

// 1
import java.util.ArrayList;
import java.util.List;

class Box<T> {
    private T item;

    public Box(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }
}

public class Main {
    public static void main(String[] args) {
        Box<String> stringBox = new Box<>("Hello");
        Box<Integer> integerBox = new Box<>(123);

        // Проверка с использованием instanceof
        if (stringBox instanceof Box) {
            System.out.println("stringBox is an instance of Box");
        }

        if (integerBox instanceof Box) {
            System.out.println("integerBox is an instance of Box");
        }

        // Проверка с использованием параметризованного типа
        if (stringBox instanceof Box<?>) {
            System.out.println("stringBox is an instance of Box<?>");
        }

        if (integerBox instanceof Box<?>) {
            System.out.println("integerBox is an instance of Box<?>");
        }
    }
}

// 2
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        List<Integer> integerList = new ArrayList<>();

        // Проверка с использованием instanceof
        if (stringList instanceof List) {
            System.out.println("stringList is an instance of List");
        }

        if (integerList instanceof List) {
            System.out.println("integerList is an instance of List");
        }

        // Проверка с использованием параметризованного типа
        if (stringList instanceof List<?>) {
            System.out.println("stringList is an instance of List<?>");
        }

        if (integerList instanceof List<?>) {
            System.out.println("integerList is an instance of List<?>");
        }
    }
}

// 3
class Animal {}
class Dog extends Animal {}

class Box<T extends Animal> {
    private T animal;

    public Box(T animal) {
        this.animal = animal;
    }

    public T getAnimal() {
        return animal;
    }
}

public class Main {
    public static void main(String[] args) {
        Box<Dog> dogBox = new Box<>(new Dog());

        // Проверка на базовый класс
        if (dogBox instanceof Box) {
            System.out.println("dogBox is an instance of Box");
        }

        // Проверка на конкретный параметризованный тип
        if (dogBox instanceof Box<?>) {
            System.out.println("dogBox is an instance of Box<?>");
        }
    }
}

// 2 практика

//1. <? extends T>
//Конструкция <? extends T> используется для обозначения верхней границы типа. Это означает, что вы можете использовать любой тип, который является подтипом T (включая сам T). Это полезно, когда вы хотите читать данные из структуры данных, но не собираетесь добавлять в нее элементы.

import java.util.ArrayList;
import java.util.List;

class Animal {}
class Dog extends Animal {}
class Cat extends Animal {}

public class Example {
    public static void printAnimals(List<? extends Animal> animals) {
        for (Animal animal : animals) {
            System.out.println(animal);
        }
    }

    public static void main(String[] args) {
        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog());
        List<Cat> cats = new ArrayList<>();
        cats.add(new Cat());

        printAnimals(dogs); // Можно передать список собак
        printAnimals(cats); // Можно передать список кошек
    }
}

//2. <? super T>
//Конструкция <? super T> используется для обозначения нижней границы типа. Это означает, что вы можете использовать любой тип, который является суперклассом T (включая сам T). Это полезно, когда вы хотите добавлять элементы в структуру данных, но не собираетесь их читать.

import java.util.ArrayList;
import java.util.List;

class Animal {}
class Dog extends Animal {}

public class Example {
    public static void addDog(List<? super Dog> animals) {
        animals.add(new Dog());
    }

    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        addDog(animals); // Можно передать список животных

        List<Object> objects = new ArrayList<>();
        addDog(objects); // Можно передать список объектов
    }
}
