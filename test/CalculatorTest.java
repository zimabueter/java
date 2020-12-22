import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    @Test
    public void checkSum( ){
        CalculatorService calc = new CalculatorServiceImpl();
//        assertEquals(20,calc.sum(10,10));
        assertEquals(200,calc.sum(10,10));

    }
    @Test
    public void checkProd(){
        CalculatorService calc = new CalculatorServiceImpl();
        assertEquals(50,calc.prod(10,5));
//        assertEquals(500,calc.prod(10,5));
    }
}
