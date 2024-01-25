import java.util.Arrays;
import java.util.List;

public class UniqueElements {

    public static long countUniqueElements(List<Integer> numbers) {
        return numbers.stream()
                .distinct()
                .count();
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(8, 2, 3, 10, 4, 5, 5, 9, 6);
        long uniqueCount = countUniqueElements(numbers);
        System.out.println("Кількість унікальних елементів: " + uniqueCount);
    }
}