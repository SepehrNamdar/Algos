package algos.tail;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class TailShould {

    @Test
    void return_given_number_elements() {
        Tail tail = new Tail(0);
        List<String> givenLines = new ArrayList<>();

        List<String> tailRes = tail.get(givenLines);

        assertThat(tailRes).isEmpty();
    }
}
