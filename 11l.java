// 1 практика

// Файл: AccessModifiersExample.java
package mypackage;

public class AccessModifiersExample {
    // public переменная
    public int publicVar = 1;

    // protected переменная
    protected int protectedVar = 2;

    // private переменная
    private int privateVar = 3;

    // пакетная переменная (по умолчанию)
    int defaultVar = 4;

    public void display() {
        System.out.println("Public: " + publicVar);
        System.out.println("Protected: " + protectedVar);
        System.out.println("Private: " + privateVar);
        System.out.println("Default: " + defaultVar);
    }
}

// Файл: TestAccessModifiers.java
package mypackage;

public class TestAccessModifiers {
    public static void main(String[] args) {
        AccessModifiersExample example = new AccessModifiersExample();
        example.display();

        // Доступ к переменным
        System.out.println("Доступ из другого класса в том же пакете:");
        System.out.println("Public: " + example.publicVar);
        System.out.println("Protected: " + example.protectedVar);
        System.out.println("Default: " + example.defaultVar);
        // System.out.println("Private: " + example.privateVar); // Ошибка: privateVar недоступна
    }
}

// Файл: TestAccessModifiersOutsidePackage.java
package anotherpackage;

import mypackage.AccessModifiersExample;

public class TestAccessModifiersOutsidePackage {
    public static void main(String[] args) {
        AccessModifiersExample example = new AccessModifiersExample();
        // Доступ к переменным
        System.out.println("Доступ из другого пакета:");
        System.out.println("Public: " + example.publicVar);
        // System.out.println("Protected: " + example.protectedVar); // Ошибка: protectedVar недоступна
        // System.out.println("Default: " + example.defaultVar); // Ошибка: defaultVar недоступна
        // System.out.println("Private: " + example.privateVar); // Ошибка: privateVar недоступна
    }
}
