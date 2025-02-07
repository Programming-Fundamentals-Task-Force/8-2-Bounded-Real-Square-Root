package org.test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import com.lab.*;

class MathUtilsTest {
    @Test void
    square_root_of_a_positive_integer_is_valid() {
        double result = MathUtils.squareRoot(36);
        assertEquals(6.0, result, 0.0001, "Square root of 36 should be 6.0");
    }

    @Test void
    square_root_of_zero_is_valid() {
        double result = MathUtils.squareRoot(0);
        assertEquals(0.0, result, 0.0001, "Square root of 0 should be 0.0");
    }

    @Test void
    square_root_of_a_positive_decimal_is_valid() {
        double result = MathUtils.squareRoot(2.25);
        assertEquals(1.5, result, 0.0001, "Square root of 2.25 should be 1.5");
    }

    @Test void
    square_root_of_a_negative_number_is_invalid() {
        Exception exception = assertThrows(NegativeValueException.class, () -> {
            MathUtils.squareRoot(-100);
        });

        assertEquals("Cannot compute square root of a negative number.", exception.getMessage());
    }
}
