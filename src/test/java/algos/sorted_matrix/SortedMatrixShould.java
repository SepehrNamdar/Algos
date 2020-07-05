package algos.sorted_matrix;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SortedMatrixShould {

    @Test
    void sort_an_empty_matrix() {
        int[][] matrix = new int[0][0];

        SortedMatrix sm = new SortedMatrix(matrix);

        assertThat(sm.sort()).isEmpty();
    }
}
