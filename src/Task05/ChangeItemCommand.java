package Task05;


import Task03.Area;

public class ChangeItemCommand implements Command {
    private Area item;

    private int factor;

    public Area setItem(Area item) {
        return this.item = item;
    }

    public Area getItem() {
        return item;
    }

    public int setFactor(int factor) {
        return this.factor = factor;
    }

    public int getFactor() {
        return factor;
    }

    @Override
    public void execute() {
        item.setResult(item.getResult() * factor);
    }
}
