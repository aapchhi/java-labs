// 1 практика

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Переопределение метода equals()
    @Override
    public boolean equals(Object obj) {
        // Проверка на ссылку на себя
        if (this == obj) {
            return true;
        }
        // Проверка на null и тип объекта
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        // Приведение типа
        Person person = (Person) obj;
        // Сравнение полей
        return age == person.age && (name != null ? name.equals(person.name) : person.name == null);
    }

    // Переопределение метода hashCode() (рекомендуется при переопределении equals)
    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        return result;
    }

    // Геттеры для удобства
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

//Соглашения, которым должна следовать реализация метода equals()
//Рефлексивность: Для любого ненулевого ссылки x, x.equals(x) должно возвращать true.

//Симметричность: Для любых ссылок x и y, x.equals(y) должно возвращать true, если и только если y.equals(x) возвращает true.

//Транзитивность: Для любых ссылок x, y и z, если x.equals(y) возвращает true и y.equals(z) возвращает true, то x.equals(z) должно возвращать true.

//Согласованность: Если x и y равны, то несколько последовательных вызовов x.equals(y) должны возвращать одно и то же значение, при условии что поля, используемые для сравнения, не изменяются.

//Неравенство с null: Для любого ненулевого объекта x, x.equals(null) должно возвращать false.

//Согласованность с hashCode(): Если два объекта равны по методу equals(), то они должны возвращать одинаковые значения для метода hashCode(). Это важно для корректной работы объектов в коллекциях, таких как HashMap и HashSet.
