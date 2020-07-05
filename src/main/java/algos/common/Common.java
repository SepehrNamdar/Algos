package algos.common;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Common {
    private final List<Character> leftList;
    private final List<Character> rightList;

    public Common(final List<Character> leftList, final List<Character> rightList) {
        this.leftList = leftList;
        this.rightList = new LinkedList<>(rightList);
    }

    public List<Character> getCommonCharacters() {
        final List<Character> characters = new ArrayList<>();
        leftList.forEach(c -> addCharacterToListIfInCommon(c, characters));
        return characters;
    }

    private void addCharacterToListIfInCommon(final Character c, final List<Character> characters) {
        if (rightList.contains(c)) {
            characters.add(c);
            rightList.remove(c);
        }
    }
}
