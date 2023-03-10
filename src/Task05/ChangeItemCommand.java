package Task05;


import Task03.Area;

public class ChangeItemCommand implements Command {
    private Area item;

    private int factor;


    /**
     * Sets the item
     *
     * @param item the item
     * @return Area
     */
    public Area setItem(Area item) {

        return this.item = item;
    }


    /**
     * Gets the item
     *
     * @return the item
     */
    public Area getItem() {

        return item;
    }


    /**
     * Sets the factor
     *
     * @param factor the factor
     * @return int
     */
    public int setFactor(int factor) {

        return this.factor = factor;
    }


    /**
     * Gets the factor
     *
     * @return the factor
     */
    public int getFactor() {

        return factor;
    }

    @Override

    /**
     * Execute
     */
    public void execute() {

        item.setResult(item.getResult() * factor);
    }
}

