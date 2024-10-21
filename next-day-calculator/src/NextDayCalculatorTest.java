import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class NextDayCalculatorTest {
    @Test
    void getNextDay() {
        LocalDate date = LocalDate.of(2020, 1, 1);
        LocalDate nextDay = NextDayCalculator.getNextDay(date);
        LocalDate actualDate = LocalDate.of(2020, 1, 2);
        assertEquals(actualDate, nextDay);
    }
}