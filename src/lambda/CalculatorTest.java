package lambda;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

class CalculatorTest {

    Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    void add() {
        assertTrue(12 == calculator.add(5, 7));
    }

    @Test
    void substract() {
        assertTrue(-2 == calculator.substract(5, 7));
    }

    @Test
    void isOdd() {
        assertTrue(calculator.isOdd(5));
    }

    @Test
    void isPrime() {
        assertTrue(calculator.isPrime(2));
    }

    @Test
    void factorial() {
        assertTrue(24 == calculator.factorial(4));
    }
    
}
