package Task04;

import Task03.Area;
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
        ViewTable table_1 = new ViewTable(35, 5);
        assertEquals(35, table_1.getWidth());
        assertEquals(5, table_1.getItems().size());
        table_1.init(25, 2);
        Area item = new Area();
        int ctr = 0;
        item.setResult(table_1.calc(Integer.toBinaryString(0)));
        assertEquals(table_1.getItems().get(ctr).getResult(), item.getResult(), .1e-10);
        ctr++;
        item.setResult(table_1.calc(Integer.toBinaryString(2)));
        assertEquals(table_1.getItems().get(ctr).getResult(), item.getResult(), .1e-10);
        ctr++;
        item.setResult(table_1.calc(Integer.toBinaryString(4)));
        assertEquals(table_1.getItems().get(ctr).getResult(), item.getResult(), .1e-10);
    }

    /**
     * Serialization test
     */
    @Test
    public void testRestore() {

        ViewTable table_1 = new ViewTable(30, 10);
        ViewTable table_2 = new ViewTable();

        table_1.init(30, 2);

        try {
            table_1.viewSave();
        } catch (IOException e) {
            Assert.fail(e.getMessage());
        }

        try {
            table_2.viewRestore();
        } catch (Exception e) {
            Assert.fail(e.getMessage());
        }

        assertEquals(table_1.getItems().size(), table_2.getItems().size());

        assertTrue("containsAll()", table_1.getItems().containsAll(table_2.getItems()));
    }
}