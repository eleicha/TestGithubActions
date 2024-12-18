import org.example.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    @Test
    void testAddition() {
        assertEquals(5, Calculator.addition(3, 2), "Addition should return the sum of two numbers");
    }
}
