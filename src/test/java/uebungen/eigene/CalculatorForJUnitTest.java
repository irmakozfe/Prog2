package uebungen.eigene;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorForJUnitTest {

    CalculatorForJUnit calculator = new CalculatorForJUnit();

    @BeforeEach
    public void setUp() {
        calculator = new CalculatorForJUnit();
        System.out.println("new calculator is ready for testing.");
    }

    @AfterEach
    public void tearDown() {
        System.out.println("test is completed");
    }

    @Test
    public void Addition(){
        int a = 5;
        int b = 3;
        int exp= 3 + 5;
        assertEquals(exp, calculator.add(a,b));
    }

    @Test
    public void Subtraction(){
        int a = 5;
        int b = 3;
        int exp= a - b;
        assertEquals(exp, calculator.subtract(a,b));
    }

}