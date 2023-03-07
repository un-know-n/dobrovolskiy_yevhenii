package Task03;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MainTest {
    /**
     * Main functionality test
     */
    @Test
    public void testCalc() {
        ViewResult view = new ViewResult(3);
        view.init(2);
        Area item = new Area();
        int ctr = 0;
        item.setResult(view.calc(Integer.toBinaryString(0)));
        assertEquals(view.getItems().get(ctr).getResult(), item.getResult(), .1e-10);
        ctr++;
        item.setResult(view.calc(Integer.toBinaryString(2)));
        assertEquals(view.getItems().get(ctr).getResult(), item.getResult(), .1e-10);
        ctr++;
        item.setResult(view.calc(Integer.toBinaryString(4)));
        assertEquals(view.getItems().get(ctr).getResult(), item.getResult(), .1e-10);
    }

    /**
     * Serialization test
     */
    @Test
    public void testRestore() {
        ViewResult view1 = new ViewResult(10);
        ViewResult view2 = new ViewResult();

        view1.init(1);

        try {
            view1.viewSave();
        } catch (IOException e) {
            Assert.fail(e.getMessage());
        }

        try {
            view2.viewRestore();
        } catch (Exception e) {
            Assert.fail(e.getMessage());
        }

        assertEquals(view1.getItems().size(), view2.getItems().size());

        assertTrue("containsAll()", view1.getItems().containsAll(view2.getItems()));
    }
}