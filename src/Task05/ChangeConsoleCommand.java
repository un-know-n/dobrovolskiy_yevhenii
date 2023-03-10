package Task05;

import Task03.Area;
import Task03.View;
import Task03.ViewResult;

public class ChangeConsoleCommand extends ChangeItemCommand implements ConsoleCommand {

    private View view;

    public ChangeConsoleCommand(View view) {
        this.view = view;
    }

    public View getView() {
        return view;
    }

    public View setVIew(View view) {
        return this.view = view;
    }

    @Override
    public char getKey() {
        return 'c';
    }

    @Override
    public String toString() {
        return "'c'hange";
    }

    @Override
    public void execute() {
        System.out.println("Change result scale factor " + setFactor((int) (Math.random() * 10)));
        for (Area item : ((ViewResult) view).getItems()) {
            super.setItem(item);
            super.execute();
        }
        view.viewShow();
    }
}
