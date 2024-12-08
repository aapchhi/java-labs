// 1 практика

// 1
while (true) {
    System.out.println("Это бесконечный цикл с использованием while.");
}

// 2
do {
    System.out.println("Это бесконечный цикл с использованием do-while.");
} while (true);

// 2 практика

public class BreakExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                System.out.println("Найдено число: " + i);
                break; // Выход из цикла, когда i равно 5
            }
            System.out.println("Текущее число: " + i);
        }
        System.out.println("Цикл завершен.");
    }
}
