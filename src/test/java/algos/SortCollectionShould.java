package algos;

import org.assertj.core.api.Assertions;
import org.assertj.core.util.Lists;
import org.assertj.core.util.Sets;
import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.stream.Collectors;

public class SortCollectionShould {

    @Test
    void sort_a_list() {
        List<Integer> list = Lists.list( 5, 1, 89, 255, 7, 88, 200, 123, 66 );

        Collections.sort(list);

        List<Integer> sortedList = Lists.list(1, 5, 7, 66, 88, 89, 123, 200, 255);
        Assertions.assertThat(list).isEqualTo(sortedList);
    }

    @Test
    void sort_a_set() {
        LinkedHashSet<Integer> set = Sets.newLinkedHashSet(5, 1, 89, 7, 7, 88, 7, 7, 66);

        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list);
        LinkedHashSet<Integer> sortedSet = new LinkedHashSet<>(list);

        LinkedHashSet<Integer> expectedSortedList = Sets.newLinkedHashSet(1, 5, 7, 66, 88, 89);
        Assertions.assertThat(sortedSet).isEqualTo(expectedSortedList);
    }

    @Test
    void sort_a_map() {
        Map<String, Employee> map = new HashMap<>();
        Employee milad = new Employee(1, "Milad");
        map.put(milad.getName(), milad);
        Employee annie = new Employee(22, "Annie");
        map.put(annie.getName(), annie);
        Employee john = new Employee(8, "John");
        map.put(john.getName(), john);
        Employee george = new Employee(2, "George");
        map.put(george.getName(), george);

        HashMap<String, Employee> sortedMap = map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey()) // Use comparingByValue() to sort by values
                                                    // In this case Employee should implement Comparable
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue, HashMap::new));

        Map<String, Employee> expectedMap = new HashMap<>();
        expectedMap.put(annie.getName(), annie);
        expectedMap.put(george.getName(), george);
        expectedMap.put(john.getName(), john);
        expectedMap.put(milad.getName(), milad);
        Assertions.assertThat(sortedMap).isEqualTo(expectedMap);
    }

}
