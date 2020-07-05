package algos.tassement;

public class Tassement {
    private final String aString;

    public Tassement(final String aString) {
        this.aString = aString;
    }

    public String putPointsToTheEnd() {
        String[] letters = aString.split("");
        for (int index = 0; index < letters.length; index++) {
            String letter = letters[index];
            if (letter.equals(".") && index != letters.length - 1) {
                for (int cloneIndex = index; cloneIndex < letters.length - 1; cloneIndex++) {
                    letters[cloneIndex] = letters[cloneIndex + 1];
                }
                letters[letters.length - 1] = letter;
            }
        }
        return String.join("", letters);
    }
}
