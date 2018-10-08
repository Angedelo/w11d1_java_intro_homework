import org.junit.*;

import static org.junit.Assert.assertEquals;

public class PrinterTest {
    Printer printer;

    @Before
    public void before(){
        printer = new Printer(100, 10);
    }

    @Test
    public void hasSheets(){
        assertEquals(100, printer.getSheets());
    }

    @Test
    public void canPrintIfSufficientSheets(){
        assertEquals(80, printer.print(2,10));
        assertEquals(9, printer.getToner());
    }

    @Test
    public void canRefill(){
        assertEquals(100, printer.refill());
    }

    @Test
    public void hasToner(){
        assertEquals(10, printer.getToner());
    }
}
