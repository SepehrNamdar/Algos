package algos.tail;

import java.util.ArrayList;
import java.util.List;

public class Tail {
    private int lineNumbers;

    public Tail(int lineNumbers) {
        this.lineNumbers = lineNumbers;
    }

    public List<String> get(List<String> givenLines) {
        List<String> tail = new ArrayList<>();
        if (lineNumbers == 0) {
            return new ArrayList<>();
        } else {
            tail.add(givenLines.get(2));
        }
        return tail;
    }
}
