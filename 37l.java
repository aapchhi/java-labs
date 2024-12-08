// 1 практика

// Определение собственного класса исключения
public class InvalidAgeException extends Exception {
    // Конструктор без параметров
    public InvalidAgeException() {
        super("Возраст должен быть положительным числом.");
    }

    // Конструктор с параметром для передачи сообщения
    public InvalidAgeException(String message) {
        super(message);
    }
}
