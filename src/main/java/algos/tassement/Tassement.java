package algos.tassement;

public class Tassement {
    private final String aString;

    public Tassement(final String aString) {
        this.aString = aString;
    }

    public String putPointsToTheEnd() {
        long numberOfPoints = aString.chars().filter(ch -> ch == '.').count();
        return aString.replaceAll("\\.", "") + addPointsToTheEnd(numberOfPoints);
    }

    private StringBuilder addPointsToTheEnd(long numberOfPoints) {
        StringBuilder result = new StringBuilder();
        for (int index = 0; index < numberOfPoints; index++) {
            result.append(".");
        }
        return result;
    }
}
