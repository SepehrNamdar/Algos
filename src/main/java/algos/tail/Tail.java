package algos.tail;

import java.util.ArrayList;
import java.util.List;

public class Tail {
    private final int lineNumbers;

    public Tail(int lineNumbers) {
        this.lineNumbers = lineNumbers;
    }

    public List<String> get(final List<String> givenLines) {
        List<String> tail = new ArrayList<>();
        int givenLinesLength = givenLines.size();
        int remainingLines = givenLinesLength - lineNumbers;
        for (int index = 0; index < givenLinesLength - remainingLines; index++) {
            tail.add(givenLines.get(remainingLines + index));
        }
        return tail;
    }
}
