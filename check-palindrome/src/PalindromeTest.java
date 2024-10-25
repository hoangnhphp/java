import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {

    @Test
    void isPalindrome1() {
        String testString = "I am a Palindrome";
        boolean isPalindrome = Palindrome.isPalindrome(testString);
        assertFalse(isPalindrome);
    }

    @Test
    void isPalindrome2() {
        String testString = "I am ma I";
        boolean isPalindrome = Palindrome.isPalindrome(testString);
        assertTrue(isPalindrome);
    }
}