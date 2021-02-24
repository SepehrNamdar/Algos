package algos;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SortArrayShould {

    @Test
    void sort_int_array_in_ascending_order() {
        int[] numbers = new int[] { -8, 7, 5, 9, 10, -2, 3 };

        Arrays.sort(numbers);

        assertArrayEquals(new int[] { -8, -2, 3, 5, 7, 9, 10 }, numbers);
    }

    @Test
    void sort_object_array_in_ascending_order() {
        String[] strings = new String[] { "learning", "java", "with", "7learn" };

        Arrays.sort(strings);

        assertArrayEquals(new String[] { "7learn", "java", "learning", "with" }, strings);
    }

    @Test
    void sort_object_array_that_not_implements_comparable_in_ascending_order() {
        Employee john = new Employee(6, "John");
        Employee mary = new Employee(3, "Mary");
        Employee david = new Employee(4, "David");
        Employee[] employees = new Employee[] { john, mary, david };

        Arrays.sort(employees, Comparator.comparing(Employee::getName));

        assertArrayEquals(new Employee[] { david, john, mary }, employees);

        // We can also sort our objects on more that one attribute
        // Arrays.sort(employees, Comparator.comparing(Employee::getName).thenComparing(Employee::getId));
    }

    @Test
    void sort_int_array_in_descending_order() {
        int[] numbers = new int[] { -8, 7, 5, 9, 10, -2, 3 };

        numbers = IntStream.of(numbers)
                .boxed()    // convert int to Integer
                .sorted(Comparator.reverseOrder())
                .mapToInt(i -> i)
                .toArray();

        assertArrayEquals(new int[] { 10, 9, 7, 5, 3, -2, -8 }, numbers);
    }

    @Test
    void sort_object_array_in_descending_order() {
        String[] strings = new String[] { "learning", "java", "with", "7learn" };

        Arrays.sort(strings, Comparator.reverseOrder());

        assertArrayEquals(new String[] { "with", "learning", "java", "7learn" }, strings);
    }

    @Test
    void sort_object_array_that_not_implements_comparable_in_descending_order() {
        Employee john = new Employee(6, "John");
        Employee mary = new Employee(3, "Mary");
        Employee david = new Employee(4, "David");
        Employee[] employees = new Employee[] { john, mary, david };

        Arrays.sort(employees, Comparator.comparing(Employee::getName).reversed());

        assertArrayEquals(new Employee[] { mary, john, david }, employees);
    }
}
