// 1 практика

public class OuterClass {
    public class PublicInnerClass {
        public void display() {
            System.out.println("This is a public inner class.");
        }
    }
}

// объяснение: Публичный внутренний класс может быть доступен из любого другого класса в любом пакете. Вы можете создать экземпляр PublicInnerClass из другого класса следующим образом:

public class Test {
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        OuterClass.PublicInnerClass inner = outer.new PublicInnerClass();
        inner.display(); // Вывод: This is a public inner class.
    }
}

public class OuterClass {
    protected class ProtectedInnerClass {
        public void display() {
            System.out.println("This is a protected inner class.");
        }
    }
}

// объяснение: Защищенный внутренний класс может быть доступен только из подклассов и из классов в том же пакете. Если вы попытаетесь создать экземпляр ProtectedInnerClass из класса, который не является подклассом и находится в другом пакете, это вызовет ошибку компиляции.

public class OuterClass {
    private class PrivateInnerClass {
        public void display() {
            System.out.println("This is a private inner class.");
        }
    }

    public void createInner() {
        PrivateInnerClass inner = new PrivateInnerClass();
        inner.display(); // Доступно внутри внешнего класса
    }
}

// объяснение: Приватный внутренний класс доступен только внутри внешнего класса. Вы не сможете создать экземпляр PrivateInnerClass из другого класса, даже если он находится в том же пакете.

public class Test {
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        outer.createInner(); // Вывод: This is a private inner class.
    }
}

public class OuterClass {
    class PackagePrivateInnerClass {
        public void display() {
            System.out.println("This is a package-private inner class.");
        }
    }
}

// объяснение: Внутренний класс без спецификатора доступа (пакетный) доступен только из классов в том же пакете. Вы не сможете получить доступ к PackagePrivateInnerClass из другого пакета.

public class Test {
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        OuterClass.PackagePrivateInnerClass inner = outer.new PackagePrivateInnerClass();
        inner.display(); // Вывод: This is a package-private inner class.
    }
}

// 2 практика

// Да, внутренний класс в Java имеет доступ к полям и методам внешнего класса, независимо от спецификаторов доступа. Это одно из ключевых свойств внутренних классов.

// 1
public class OuterClass {
    private String outerField = "Outer Field";
    
    public void outerMethod() {
        System.out.println("Outer Method");
    }

    // Внутренний класс
    public class InnerClass {
        public void accessOuter() {
            // Доступ к полю внешнего класса
            System.out.println("Accessing: " + outerField);
            // Доступ к методу внешнего класса
            outerMethod();
        }
    }
}

class Test {
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        OuterClass.InnerClass inner = outer.new InnerClass();
        inner.accessOuter();
    }
}

// 2
public class OuterClass {
    private String privateField = "Private Field";
    protected String protectedField = "Protected Field";
    public String publicField = "Public Field";
    String packagePrivateField = "Package Private Field"; // Пакетный доступ

    public void outerMethod() {
        System.out.println("Outer Method");
    }

    public class InnerClass {
        public void accessOuter() {
            // Доступ к полям внешнего класса
            System.out.println("Accessing: " + privateField); // Доступ к private
            System.out.println("Accessing: " + protectedField); // Доступ к protected
            System.out.println("Accessing: " + publicField); // Доступ к public
            System.out.println("Accessing: " + packagePrivateField); // Доступ к package-private

            // Доступ к методу внешнего класса
            outerMethod();
        }
    }
}

class Test {
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        OuterClass.InnerClass inner = outer.new InnerClass();
        inner.accessOuter();
    }
}

//Private: Внутренний класс имеет доступ к полю privateField, даже если оно объявлено как private.
//Protected: Внутренний класс также имеет доступ к полю protectedField, так как он находится в том же классе.
//Public: Внутренний класс может получить доступ к полю publicField без ограничений.
//Package-private: Внутренний класс может получить доступ к полю с пакетным доступом packagePrivateField, так как он находится в том же классе.

// 3 практика

// Да, внешний класс в Java имеет доступ к полям и методам внутреннего класса. Однако доступ зависит от спецификаторов доступа, которые используются для определения полей и методов внутреннего класса. 

// 1
public class OuterClass {
    // Внешний класс может создавать экземпляр внутреннего класса
    public class InnerClass {
        private String privateField = "Private Inner Field";
        protected String protectedField = "Protected Inner Field";
        public String publicField = "Public Inner Field";
        String packagePrivateField = "Package Private Inner Field"; // Пакетный доступ

        public void innerMethod() {
            System.out.println("Inner Method");
        }
    }

    public void accessInnerClass() {
        InnerClass inner = new InnerClass();
        
        // Доступ к полям внутреннего класса
        System.out.println(inner.privateField); // Доступ к private
        System.out.println(inner.protectedField); // Доступ к protected
        System.out.println(inner.publicField); // Доступ к public
        System.out.println(inner.packagePrivateField); // Доступ к package-private

        // Доступ к методу внутреннего класса
        inner.innerMethod();
    }
}

class Test {
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        outer.accessInnerClass();
    }
}

// 2
public class OuterClass {
    public class InnerClass {
        public void innerMethod() {
            System.out.println("Inner Method");
        }
    }

    public void callInnerMethod() {
        InnerClass inner = new InnerClass();
        inner.innerMethod(); // Внешний класс может вызывать метод внутреннего класса
    }
}

class Test {
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        outer.callInnerMethod();
    }
}
