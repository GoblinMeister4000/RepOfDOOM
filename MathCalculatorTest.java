package assignments.testing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathCalculatorTest {
    @Test
    void sum() {
        MathCalculator math = new MathCalculator();
        int result = math.sum(-10);
        int expected = 0;
        System.out.println("Testing sum();");
        assertEquals(expected, result);
    }

    @Test
    void factorial() {
        MathCalculator math = new MathCalculator();
        int result = math.factorial(-1);
        int expected = 1;
        System.out.println("Testing factorial();");
        assertEquals(expected, result);
    }

    @Test
    void area() {
        MathCalculator math = new MathCalculator();
        int result = math.area(3, 5);
        int expected = 15;
        assertEquals(expected, result);
    }

    @Test
    void triangleArea() {
        MathCalculator math = new MathCalculator();
        int result = math.triangleArea(3, 4, 5);
        int expected = 6;
        assertEquals(expected, result);
    }
}