package algos.palindromes;

public class Palindrome {
    private final String givenString;

    public Palindrome(final String givenString) {
        this.givenString = givenString;
    }

    public String getPalindrome() {
        return reverse(givenString);
    }

    private String reverse(String aString) {
        return new StringBuilder(aString).reverse().toString();
    }
}
