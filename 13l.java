// 1 практика

// 1
public class Main {
    public static void main(String[] args) {
        A.printVars(); // Вызов метода через имя класса
    }
}

// 2
public class A {
    public static int a = 1;
    public static int b;

    public static void printVars() {
        System.out.println(a);
        System.out.println(b);
    }

    public static void anotherMethod() {
        printVars(); // Вызов метода из другого статического метода
    }

    public static void main(String[] args) {
        anotherMethod(); // Вызов другого статического метода
    }
}

// 3
public class Main {
    public static void main(String[] args) {
        A obj = new A();
        obj.printVars(); // Вызов статического метода через экземпляр (не рекомендуется)
    }
}

// 4
public class Main {
    public static void main(String[] args) {
        A.printVars(); // Вызов метода из другого класса
    }
}
