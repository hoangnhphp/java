import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParenthesisCheckingTest {

    @Test
    void isParenthesis1() {
        String input = "(– b + (b2 – 4*a*c)^0.5) / 2*a";
        boolean isParenthesis = ParenthesisChecking.isParenthesis(input);
        assertTrue(isParenthesis);
    }

    @Test
    void isParenthesis2() {
        String input = "s * (s – a) * (s – b) * (s – c)";
        boolean isParenthesis = ParenthesisChecking.isParenthesis(input);
        assertTrue(isParenthesis);
    }

    @Test
    void isParenthesis3() {
        String input = "s * (s – a) * (s – b * (s – c)";
        boolean isParenthesis = ParenthesisChecking.isParenthesis(input);
        assertFalse(isParenthesis);
    }

    @Test
    void isParenthesis4() {
        String input = "s * (s – a) * s – b) * (s – c)";
        boolean isParenthesis = ParenthesisChecking.isParenthesis(input);
        assertFalse(isParenthesis);
    }

    @Test
    void isParenthesis5() {
        String input = "(– b + (b^2 – 4*a*c)^(0.5/ 2*a))";
        boolean isParenthesis = ParenthesisChecking.isParenthesis(input);
        assertTrue(isParenthesis);
    }
}