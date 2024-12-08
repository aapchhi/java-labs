import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        // Создаем объект Scanner для чтения ввода пользователя
        Scanner scanner = new Scanner(System.in);

        // Запрашиваем у пользователя ввод имени
        System.out.print("Введите ваше имя: ");
        String name = scanner.nextLine();

        // Выводим приветственное сообщение
        System.out.println("Привет, " + name + "!");

        // Закрываем сканер
        scanner.close();
    }
}
