package algos;

import algos.common.Common;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;

public class CommonShould {

    @Test
    void find_common_characters_in_2_sorted_lists() {
        assertThat(new Common(new ArrayList(), new ArrayList()).getCommonCharacters())
                .isEqualTo(new ArrayList<>());
        assertThat(new Common(new ArrayList(), asList('a', 'b')).getCommonCharacters())
                .isEqualTo(new ArrayList<>());
        assertThat(new Common(asList('a', 'b'), new ArrayList()).getCommonCharacters())
                .isEqualTo(new ArrayList<>());
        assertThat(new Common(asList('a'), asList('a')).getCommonCharacters())
                .isEqualTo(asList('a'));
    }
}
