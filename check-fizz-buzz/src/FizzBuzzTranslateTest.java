import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTranslateTest {

    @org.junit.jupiter.api.Test
    void fizzBuzz() {
        int n = 15;
        String result = FizzBuzzTranslate.fizzBuzz(n);
        String expected = "FizzBuzz";
        assertEquals(expected, result);
    }

    @org.junit.jupiter.api.Test
    void numToWord() {
        int n = 26;
        String result = FizzBuzzTranslate.numToWord(n);
        String expected = "hai sáu";
        assertEquals(expected, result);
    }
}