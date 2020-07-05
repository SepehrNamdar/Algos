package algos.palindromes;

public class Palindrome {
    private final String givenString;

    public Palindrome(final String givenString) {
        this.givenString = givenString;
    }

    public boolean isPalindrome() {
        return reverse(givenString).equals(givenString);
    }

    private String reverse(String aString) {
        return new StringBuilder(aString).reverse().toString();
    }
}
