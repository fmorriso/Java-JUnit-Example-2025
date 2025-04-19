import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SimpleCalculatorTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void add() {
        assertEquals(7, SimpleCalculator.add(3, 4));
    }

    @Test
    void subtract() {
        assertEquals(-1, SimpleCalculator.subtract(3, 4));
    }

    @Test
    void multiply() {
        assertEquals(12, SimpleCalculator.multiply(3, 4));
    }

    @Test
    void divide() {
        assertEquals(2, SimpleCalculator.divide(4, 2));
    }
}