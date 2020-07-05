package algos.distinct_character;

public class DistinctCharacter {
    private final String aString;

    public DistinctCharacter(String aString) {
        this.aString = aString;
    }

    public String getCharacters() {
        StringBuilder result = new StringBuilder();
        String[] splicedString = aString.split("");
        for (String character : splicedString) {
            if (!result.toString().contains(character)) {
                result.append(character);
            }
        }
        return result.toString();
    }
}
