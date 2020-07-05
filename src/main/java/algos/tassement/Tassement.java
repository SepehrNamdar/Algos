package algos.tassement;

public class Tassement {
    private final String aString;

    public Tassement(final String aString) {
        this.aString = aString;
    }

    public String putPointsToTheEnd() {
        String[] letters = aString.split("");
        String[] clone = letters.clone();
        for (int index = 0; index < letters.length; index++) {
            String letter = letters[index];
            if (letter.equals(".")) {
                String lastChar = clone[clone.length - 1];
                clone[index] = lastChar;
                clone[clone.length - 1] = letter;
            }
        }
        return String.join("", clone);
    }
}
