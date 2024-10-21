import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class TriangleClassifierTest {

    @Test
    void isTriangle() {
        int a = 3;
        int b = 4;
        int c = 5;
        boolean output = TriangleClassifier.isTriangle(a, b, c);
        boolean expected = true;
        assertEquals(expected, output);
    }

    @Test
    void checkTriangle() {
        int a = 3;
        int b = 4;
        int c = 5;
        String output = TriangleClassifier.checkTriangle(a, b, c);
        String actrual = "tam giác thường";

        assertEquals(output, actrual);
    }
}