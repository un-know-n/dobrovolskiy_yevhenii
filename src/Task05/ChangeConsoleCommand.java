package Task05;

import Task03.Area;
import Task03.View;
import Task03.ViewResult;

public class ChangeConsoleCommand extends ChangeItemCommand implements ConsoleCommand {

    private View view;


    /**
     * Change console command
     *
     * @param view the view
     * @return public
     */
    public ChangeConsoleCommand(View view) {

        this.view = view;
    }


    /**
     * Gets the view
     *
     * @return the view
     */
    public View getView() {

        return view;
    }


    /**
     * Sets the V iew
     *
     * @param view the view
     * @return View
     */
    public View setVIew(View view) {

        return this.view = view;
    }

    @Override

    /**
     * Gets the key
     *
     * @return the key
     */
    public char getKey() {

        return 'c';
    }

    @Override

    /**
     * To string
     *
     * @return String
     */
    public String toString() {

        return "'c'hange";
    }

    @Override

    /**
     * Execute
     */
    public void execute() {

        System.out.println("Change result scale factor " + setFactor((int) (Math.random() * 10)));
        for (Area item : ((ViewResult) view).getItems()) {
            super.setItem(item);
            super.execute();
        }
        view.viewShow();
    }
}

