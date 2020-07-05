package algos.common;

import java.util.ArrayList;
import java.util.List;

public class Common {
    private final List<Character> leftList;
    private final List<Character> rightList;

    public Common(final List<Character> leftList, final List<Character> rightList) {
        this.leftList = leftList;
        this.rightList = rightList;
    }

    public List<Character> getCommonCharacters() {
        List<Character> characters = new ArrayList<>();
        leftList.forEach(c -> {
            if (rightList.contains(c)) {
                characters.add(c);
            }
        });
        return characters;
    }
}
