package Task04;

import Task03.Area;
import Task03.ViewResult;

import java.util.Formatter;


/**
 * The class View table extends view result
 */
public class ViewTable extends ViewResult {

    /**
     * Default table width
     */
    private static final int DEFAULT_WIDTH = 30;

    /**
     * Current table with
     */
    private int width;


    /**
     * Default constructor
     */
    public ViewTable() {

        width = DEFAULT_WIDTH;
    }


    /**
     * Constructor with parameter
     *
     * @param width the width of the table
     */
    public ViewTable(int width) {

        this.width = width;
    }

    /**
     * Constructor with parameters
     *
     * @param width the width of the table
     * @param n     amount of items
     */
    public ViewTable(int width, int n) {
        super(n);
        this.width = width;
    }


    /**
     * Sets the width
     *
     * @param width the width
     * @return int
     */
    public int setWidth(int width) {

        return this.width = width;
    }


    /**
     * Gets the width
     *
     * @return the width
     */
    public int getWidth() {

        return width;
    }


    /**
     * Print delimiter
     */
    private void outLine() {

        for (int i = 0; i < width; i++) {
            System.out.print('-');
        }
        System.out.println();
    }


    /**
     * Print table header
     */
    private void outHeader() {

        Formatter fmt = new Formatter();
        fmt.format("%s%d%s%2$d%s", "%", (width - 3) / 2, "s | %", "s\n");
        System.out.printf(fmt.toString(), "Binary side", "Result");
    }


    /**
     * Print table body
     */
    private void outBody() {

        Formatter fmt = new Formatter();
        fmt.format("%s%d%s%2$d%s", "%", (width - 3) / 2, "s | %", "s\n");
        for (Area item : getItems()) {
            System.out.printf(fmt.toString(), item.getBinarySide(), item.getResult());
        }
    }


    /**
     * Default initializer
     *
     * @param width  the width
     * @param factor the factor
     */
    public final void init(int width, int factor) {

        this.width = width;
        init(factor);
    }

    @Override

    /**
     * Parent factory initializer
     *
     * @param factor  the factor
     */
    public void init(int factor) {

        super.init(factor);
    }

    @Override

    /**
     * Show table with data to user
     */
    public void viewShow() {

        outHeader();
        outLine();
        outBody();
        outLine();
    }
}
