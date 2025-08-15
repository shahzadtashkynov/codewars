package tm.shtashkynov.codewars;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EvenOrOddTest {

    @Test @DisplayName("Should return \"Odd\" for num = 1")
    public void testPositiveOddNumbers() {
        assertEquals("Odd", Kata.evenOrOdd(1));
    }

    @Test @DisplayName("Should return \"Even\" for num = 2")
    public void testPositiveEvenNumbers() {
        assertEquals("Even", Kata.evenOrOdd(2));
    }

    @Test @DisplayName("Should return \"Odd\" for num = -1")
    public void testNegativeOddNumbers() {
        assertEquals("Odd", Kata.evenOrOdd(-1));
    }

    @Test @DisplayName("Should return \"Even\" for num = -2")
    public void testNegativeEvenNumbers() {
        assertEquals("Even", Kata.evenOrOdd(-2));
    }

    @Test @DisplayName("Should return \"Even\" for num = 0")
    public void testZero() {
        assertEquals("Even", Kata.evenOrOdd(0));
    }

    @Test @DisplayName("Should return \"Even\" for number 6 ")
    public void testSix(){ assertEquals("Even", Kata.evenOrOdd(6));}
}