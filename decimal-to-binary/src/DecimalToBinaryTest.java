import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class DecimalToBinaryTest {

    @Test
    void decimalToBinary1() {
        int num = 10;
        String actual = Integer.toBinaryString(num);
        String res = DecimalToBinary.decimalToBinary(num);
        assertEquals(res, actual);
    }

    @Test
    void decimalToBinary2() {
        int num = 100;
        String actual = Integer.toBinaryString(num);
        String res = DecimalToBinary.decimalToBinary(num);
        assertEquals(res, actual);
    }
}