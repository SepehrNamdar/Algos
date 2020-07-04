package algos.tail;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class TailShould {

    private List<String> givenLines;

    @BeforeEach
    public void init() {
        givenLines = new ArrayList<>();
    }

    @Test
    void return_nothing_for_0_line_numbers() {
        Tail tail = new Tail(0);

        List<String> tailRes = tail.get(givenLines);

        assertThat(tailRes).isEmpty();
    }

    @Test
    void return_last_line_for_1_line_numbers() {
        Tail tail = new Tail(1);
        givenLines.add("line 1");
        givenLines.add("line 2");
        givenLines.add("line 3");

        List<String> tailRes = tail.get(givenLines);

        assertThat(tailRes).isEqualTo(Arrays.asList(givenLines.get(2)));
    }
}
