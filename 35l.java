// 1 практика

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        try {
            // Генерация первого исключения (ArithmeticException)
            int result = 10 / 0; // Деление на ноль, это будет перехвачено
        } catch (ArithmeticException e) {
            System.out.println("Перехвачено исключение: " + e.getMessage());
        }

        // Генерация второго исключения (NullPointerException)
        String str = null;
        // Попытка вызвать метод на null, это приведет к аварийной остановке
        int length = str.length(); // Это вызовет NullPointerException
        System.out.println("Длина строки: " + length); // Эта строка не будет выполнена
    }
}
