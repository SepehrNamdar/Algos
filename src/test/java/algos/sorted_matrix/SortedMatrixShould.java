package algos.sorted_matrix;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class SortedMatrixShould {

    @Test
    void sort_an_empty_matrix() {
        Integer[][] matrix = new Integer[0][0];

        SortedMatrix sm = new SortedMatrix(matrix);

        assertThat(sm.sort()).isEmpty();
    }

    @Test
    void sort_a_one_element_matrix() {
        Integer[][] matrix = new Integer[1][1];
        matrix[0][0] = 2;

        SortedMatrix sm = new SortedMatrix(matrix);

        List<Integer> result = new ArrayList<>();
        result.add(2);
        assertThat(sm.sort()).isEqualTo(result);
    }

    @Test
    void sort_a_1_2_dimension_matrix() {
        Integer[][] matrix = new Integer[1][2];
        matrix[0][0] = 1;
        matrix[0][1] = 2;

        SortedMatrix sm = new SortedMatrix(matrix);

        List<Integer> result = new ArrayList<>();
        result.add(1);
        result.add(2);
        assertThat(sm.sort()).isEqualTo(result);
    }

    @Test
    void sort_a_2_2_dimension_matrix() {
        Integer[][] matrix = new Integer[2][2];
        matrix[0][0] = 1;
        matrix[0][1] = 3;
        matrix[1][0] = 2;
        matrix[1][1] = 4;

        SortedMatrix sm = new SortedMatrix(matrix);

        List<Integer> result = new ArrayList<>();
        result.add(1);
        result.add(2);
        result.add(3);
        result.add(4);
        assertThat(sm.sort()).isEqualTo(result);
    }
}
