package Task04;

import Task03.Area;
import Task03.ViewResult;

import java.util.Formatter;

public class ViewTable extends ViewResult {
    private static final int DEFAULT_WIDTH = 30;
    private int width;

    public ViewTable() {
        width = DEFAULT_WIDTH;
    }

    public ViewTable(int width) {
        this.width = width;
    }

    public int setWidth(int width) {
        return this.width = width;
    }

    public int getWidth() {
        return width;
    }

    private void outLine() {
        for (int i = 0; i < width; i++) {
            System.out.print('-');
        }
        System.out.println();
    }

    private void outHeader() {
        Formatter fmt = new Formatter();
        fmt.format("%s%d%s%2$d%s", "%", (width - 3) / 2, "s | %", "s\n");
        System.out.printf(fmt.toString(), "Binary side", "Result");
    }

    private void outBody() {
        Formatter fmt = new Formatter();
        fmt.format("%s%d%s%2$d%s", "%", (width - 3) / 2, "s | %", "s\n");
        for (Area item : getItems()) {
            System.out.printf(fmt.toString(), item.getBinarySide(), item.getResult());
        }
    }

    public final void init(int width, int factor) {
        this.width = width;
        init(factor);
    }

    @Override
    public void init(int factor) {
        super.init(factor);
    }

    @Override
    public void viewShow() {
        outHeader();
        outLine();
        outBody();
        outLine();
    }
}
