package algos.palindromes;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PalindromeShould {

    @Test
    void inverse_letters() {
        assertThat(new Palindrome("").isPalindrome()).isTrue();
        assertThat(new Palindrome("a").isPalindrome()).isTrue();
        assertThat(new Palindrome("ab").isPalindrome()).isFalse();
        assertThat(new Palindrome("aba").isPalindrome()).isTrue();
    }
}
