// 1 практика

public class Main {

    // Определение перечисления с инициализацией элементов
    public enum Day {
        SUNDAY("Воскресенье"),
        MONDAY("Понедельник"),
        TUESDAY("Вторник"),
        WEDNESDAY("Среда"),
        THURSDAY("Четверг"),
        FRIDAY("Пятница"),
        SATURDAY("Суббота");

        private String russianName;

        // Конструктор перечисления
        Day(String russianName) {
            this.russianName = russianName;
        }

        // Метод для получения русского названия дня
        public String getRussianName() {
            return russianName;
        }
    }

    public static void main(String[] args) {
        // Перебор всех элементов перечисления
        for (Day day : Day.values()) {
            System.out.println(day + " - " + day.getRussianName());
        }
    }
}

// 2 практика

public class Main {

    // Определение перечисления для цветов
    public enum Color {
        RED("Красный"),
        GREEN("Зеленый"),
        BLUE("Синий"),
        YELLOW("Желтый");

        private String russianName;

        // Конструктор перечисления
        Color(String russianName) {
            this.russianName = russianName;
        }

        // Метод для получения русского названия цвета
        public String getRussianName() {
            return russianName;
        }

        // Дополнительный метод для получения длины названия цвета
        public int getNameLength() {
            return russianName.length();
        }
    }

    public static void main(String[] args) {
        // Перебор всех элементов перечисления
        for (Color color : Color.values()) {
            System.out.println(color + " - " + color.getRussianName() + 
                               " (длина названия: " + color.getNameLength() + ")");
        }
    }
}
