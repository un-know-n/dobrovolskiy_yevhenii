package Task05;

import Task03.Area;
import Task03.ViewResult;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MainTest {

    /**
     * Main functionality test
     */
    @Test
    public void testExecute() {
        ChangeItemCommand cmd = new ChangeItemCommand();
        cmd.setItem(new Area());
        String binarySide;
        int factor;
        for (int ctr = 0; ctr < 5; ctr++) {
            binarySide = Integer.toBinaryString((int) (Math.random() * 10));
            cmd.getItem().setBinarySide(binarySide);
            cmd.getItem().setResult(Integer.parseInt(binarySide));
            factor = (int) (Math.random() * 10);
            cmd.setFactor(factor);
            cmd.execute();
            assertEquals(binarySide, cmd.getItem().getBinarySide());
            assertEquals(Integer.parseInt(binarySide) * factor, cmd.getItem().getResult(), .1e-10);
        }
    }

    /**
     * Console command test
     */
    @Test
    public void testChangeConsoleCommand() {
        ChangeConsoleCommand cmd = new ChangeConsoleCommand(new ViewResult());
        cmd.getView().viewInit();
        cmd.execute();
        assertEquals("'c'hange", cmd.toString());
        assertEquals('c', cmd.getKey());
    }
}
