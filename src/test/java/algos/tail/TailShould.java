package algos.tail;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;

public class TailShould {

    private List<String> givenLines;

    @BeforeEach
    public void init() {
        givenLines = new ArrayList<>();
        givenLines.add("line 1");
        givenLines.add("line 2");
        givenLines.add("line 3");
    }

    @Test
    void return_nothing_for_0_line_numbers() {
        Tail tail = new Tail(0);

        assertThat(tail.get(givenLines)).isEmpty();
    }

    @Test
    void return_last_line_for_1_line_numbers() {
        Tail tail = new Tail(1);

        assertThat(tail.get(givenLines)).isEqualTo(asList(givenLines.get(2)));
    }

    @Test
    void return_2_last_line_for_2_line_numbers() {
        Tail tail = new Tail(2);

        assertThat(tail.get(givenLines)).isEqualTo(asList(givenLines.get(1), givenLines.get(2)));
    }
}
