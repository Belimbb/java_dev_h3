import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SumCalculatorTest {
    private SumCalculator calc;
    @BeforeEach
    public void beforeEach(){
        calc = new SumCalculator();
    }
    @Test
    public void testSum1(){
        //When
        int actual = calc.sum(1);

        //Then
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void testSum2(){
        //When
        int actual = calc.sum(3);

        //Then
        int expected = 6;
        assertEquals(expected, actual);
    }
    @Test
    public void testSum3(){
        // Then
        assertThrows(IllegalArgumentException.class, () -> {
            // When
            calc.sum(0);
        });
    }
}
