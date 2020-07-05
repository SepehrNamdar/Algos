package algos.palindromes;

import java.util.ArrayList;
import java.util.List;

public class Palindrome {
    private final List<String> givenStrings;

    public Palindrome(final List<String> givenStrings) {
        this.givenStrings = givenStrings;
    }

    public List<String> getPalindrome() {
        List<String> results = new ArrayList<>();
        givenStrings.forEach(s -> results.add(reverse(s)));
        return results;
    }

    private String reverse(String aString) {
        return new StringBuilder(aString).reverse().toString();
    }
}
