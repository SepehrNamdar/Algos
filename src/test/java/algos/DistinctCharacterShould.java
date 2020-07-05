package algos;

import algos.distinct_character.DistinctCharacter;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DistinctCharacterShould {

    @Test
    void get_a_non_redundant_string() {
        assertThat(new DistinctCharacter("").getCharacters()).isEqualTo("");
        assertThat(new DistinctCharacter("a").getCharacters()).isEqualTo("a");
        assertThat(new DistinctCharacter("aba").getCharacters()).isEqualTo("ab");
    }
}
