import java.util.Arrays;
import java.util.List;

public class MinValue {

    public static int findMinValue(List<Integer> numbers) {
        return numbers.stream()
                .min(Integer::compareTo)
                .orElseThrow(() -> new IllegalArgumentException("Список порожній"));
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(8, 2, 3, 10, 4, 5, 5, 9, 6);
        int minValue = findMinValue(numbers);
        System.out.println("Мінімальне значення: " + minValue);
    }
}