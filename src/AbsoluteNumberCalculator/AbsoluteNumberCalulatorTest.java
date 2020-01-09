package AbsoluteNumberCalculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AbsoluteNumberCalulatorTest {

    @Test
    void testfindAbsolute() {
        int number = 0;
        int expected = 0;
        AbsoluteNumberCalulator abs = new AbsoluteNumberCalulator();
        int result = abs.findAbsolute(number);
        assertEquals(expected, result);
    }

    @Test
    void testfindAbsolute2() {
        int number = 1;
        int expected = 1;
        AbsoluteNumberCalulator abs2 = new AbsoluteNumberCalulator();
        int result = abs2.findAbsolute(number);
        assertEquals(expected,result);
    }

    @Test
    void testfindAbsolute3() {
        int number = -1;
        int expected = 1;
        AbsoluteNumberCalulator abs3 = new AbsoluteNumberCalulator();
        int result = abs3.findAbsolute(number);
        assertEquals(expected,result);
    }
}