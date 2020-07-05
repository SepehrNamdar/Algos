package algos.palindromes;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;

public class PalindromeShould {

    @Test
    void inverse_letters() {
        assertThat(new Palindrome(asList("", "a", "ab", "aba")).getPalindrome())
                .isEqualTo(asList("", "a", "ba", "aba"));
    }
}
