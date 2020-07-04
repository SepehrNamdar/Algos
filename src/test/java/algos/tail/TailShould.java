package algos.tail;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;
import static java.util.Collections.singletonList;
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
    void return_given_last_lines() {
        assertThat(new Tail(0).get(givenLines))
                .isEmpty();
        assertThat(new Tail(1).get(givenLines))
                .isEqualTo(singletonList(givenLines.get(2)));
        assertThat(new Tail(2).get(givenLines))
                .isEqualTo(asList(givenLines.get(1), givenLines.get(2)));
        assertThat(new Tail(3).get(givenLines))
                .isEqualTo(asList(givenLines.get(0), givenLines.get(1), givenLines.get(2)));
    }
}
