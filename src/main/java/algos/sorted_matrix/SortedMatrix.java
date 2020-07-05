package algos.sorted_matrix;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;
import static java.util.Comparator.naturalOrder;

public class SortedMatrix {
    private final Integer[][] matrix;

    public SortedMatrix(Integer[][] matrix) {
        this.matrix = matrix;
    }

    public List<Integer> sort() {
        List<Integer> list = new ArrayList<>();
        for (Integer[] array : matrix) {
            list.addAll(asList(array));
        }
        list.sort(naturalOrder());
        return list;
    }
}
