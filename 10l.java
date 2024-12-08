// 1 практика

System.out.println(Arrays.toString(a1)); // Вывод: [6, 7, 8, 9, 10]

// Таким образом, a1 теперь ссылается на массив, который изначально был присвоен a2.

// 2 практика

// 1
import java.util.Arrays;

public class ToStringExample {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        String arrayString = Arrays.toString(array);
        System.out.println("Строковое представление массива: " + arrayString);
    }
}

// 2
import java.util.Arrays;

public class BinarySearchExample {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int index = Arrays.binarySearch(array, 3);
        System.out.println("Индекс элемента 3: " + index);
    }
}

// 3
import java.util.Arrays;

public class EqualsExample {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3};
        boolean areEqual = Arrays.equals(array1, array2);
        System.out.println("Массивы равны: " + areEqual);
    }
}

// 4
import java.util.Arrays;

public class CompareExample {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 4};
        int result = Arrays.compare(array1, array2);
        System.out.println("Результат сравнения: " + result);
    }
}

// 5
import java.util.Arrays;

public class SortExample {
    public static void main(String[] args) {
        int[] array = {5, 3, 1, 4, 2};
        Arrays.sort(array);
        System.out.println("Отсортированный массив: " + Arrays.toString(array));
    }
}
