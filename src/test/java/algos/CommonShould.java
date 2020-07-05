package algos;

import algos.common.Commun;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;

public class CommonShould {

    @Test
    void find_common_characters_in_2_sorted_lists() {
        assertThat(new Commun(new ArrayList(), new ArrayList()).getCommonCharacters())
                .isEqualTo(new ArrayList<>());
        assertThat(new Commun(new ArrayList(), asList('a', 'b')).getCommonCharacters())
                .isEqualTo(new ArrayList<>());
        assertThat(new Commun(asList('a', 'b'), new ArrayList()).getCommonCharacters())
                .isEqualTo(new ArrayList<>());
    }
}
