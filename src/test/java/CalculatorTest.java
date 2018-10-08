import org.junit.*;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calc;

    @Before
    public void before(){
        calc = new Calculator(10, 5);
    }

    @Test
    public void canAdd(){
        assertEquals(15, calc.add());
    }

    @Test
    public void canSub(){
        assertEquals(5, calc.sub());
    }

    @Test
    public void canMultiply(){
        assertEquals(50, calc.multiply());
    }

    @Test
    public void canDivide(){
        assertEquals(2, calc.divide());
    }

}
