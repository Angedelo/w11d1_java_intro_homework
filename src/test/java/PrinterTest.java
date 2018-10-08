import org.junit.*;

import static org.junit.Assert.assertEquals;

public class PrinterTest {
    Printer printer;

    @Before
    public void before(){
        printer = new Printer(100);
    }

    @Test
    public void hasSheets(){
        assertEquals(100, printer.getSheets());
    }
}
