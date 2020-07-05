package algos.common;

import java.util.ArrayList;
import java.util.List;

public class Commun {
    private final List leftList;
    private final List rightList;

    public Commun(final List leftList, final List rightList) {
        this.leftList = leftList;
        this.rightList = rightList;
    }

    public List<Character> getCommonCharacters() {
        return new ArrayList<>();
    }
}
