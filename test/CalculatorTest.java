import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    @Test
    public void checkSumInt() {
        CalculatorService calc = new CalculatorServiceImpl();
//        assertEquals(20,calc.sum(10,10));
        assertEquals(200, calc.sum(10, 10));

    }

    @Test
    public void checkProdInt() {
        CalculatorService calc = new CalculatorServiceImpl();
        assertEquals(50, calc.prod(10, 5));
//        assertEquals(500,calc.prod(10,5));
    }

    @Test
    public void checkProdDouble() {
        CalculatorService calc = new CalculatorServiceImpl();
        assertEquals(12.8, calc.prod(6.4, 2.0), 0.1);
//        assertEquals(17.7,calc.prod(6.4,6.4),0.1);
    }

    @Test
    public void checkSumDouble() {
        CalculatorService calc = new CalculatorServiceImpl();

        assertEquals(850.0, calc.sum(100.0, 600.0),2.0);
//        assertEquals(700.0, calc.sum(100.0, 600.0),1.0);

    }
}