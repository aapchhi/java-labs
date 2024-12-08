// 1 практика

// Определение иерархии исключений
class Ex1 extends Exception {
    public Ex1(String message) {
        super(message);
    }
}

class Ex2 extends Ex1 {
    public Ex2(String message) {
        super(message);
    }
}

class Ex3 extends Ex2 {
    public Ex3(String message) {
        super(message);
    }
}

public class ExceptionHierarchyExample {
    public static void main(String[] args) {
        try {
            // Генерация исключений
            throw new Ex3("Это исключение Ex3");
        } catch (Ex1 | Ex2 e) { // Обработка Ex1 и Ex2 одинаково
            System.out.println("Перехвачено исключение: " + e.getMessage());
        } catch (Ex3 e) { // Обработка Ex3 (не будет достигнута)
            System.out.println("Перехвачено исключение Ex3: " + e.getMessage());
        }

        try {
            // Генерация другого исключения
            throw new Ex2("Это исключение Ex2");
        } catch (Ex1 | Ex2 e) { // Обработка Ex1 и Ex2 одинаково
            System.out.println("Перехвачено исключение: " + e.getMessage());
        } catch (Ex3 e) { // Обработка Ex3 (не будет достигнута)
            System.out.println("Перехвачено исключение Ex3: " + e.getMessage());
        }
    }
}

// 2 практика

// В Java использование ключевого слова final в объявлении переменной в блоке catch означает, что эта переменная не может быть изменена после ее инициализации. 
// final Exception e означает, что переменная e, которая представляет собой объект исключения, не может быть переназначена внутри блока catch. 
