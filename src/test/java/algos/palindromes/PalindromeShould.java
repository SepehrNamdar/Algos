package algos.palindromes;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PalindromeShould {

    @Test
    void inverse_letters() {
        assertThat(new Palindrome("").getPalindrome()).isEqualTo("");
        assertThat(new Palindrome("a").getPalindrome()).isEqualTo("a");
        assertThat(new Palindrome("ab").getPalindrome()).isEqualTo("ba");
        assertThat(new Palindrome("aba").getPalindrome()).isEqualTo("aba");
    }
}
