package algos.tassement;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TassementShould {

    @Test
    void put_all_points_to_the_end_of_string() {
        assertThat(new Tassement("").putPointsToTheEnd()).isEqualTo("");
        assertThat(new Tassement("a").putPointsToTheEnd()).isEqualTo("a");
        assertThat(new Tassement(".").putPointsToTheEnd()).isEqualTo(".");
        assertThat(new Tassement("a.").putPointsToTheEnd()).isEqualTo("a.");
        assertThat(new Tassement(".a").putPointsToTheEnd()).isEqualTo("a.");
        assertThat(new Tassement("b.a").putPointsToTheEnd()).isEqualTo("ba.");
    }
}
