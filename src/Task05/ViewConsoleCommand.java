package Task05;

import Task03.View;

public class ViewConsoleCommand implements ConsoleCommand {
    private View view;


    /**
     * View console command
     *
     * @param view the view
     * @return public
     */
    public ViewConsoleCommand(View view) {

        this.view = view;
    }

    @Override

    /**
     * Execute
     */
    public void execute() {

        System.out.println("View current");
        view.viewShow();
    }

    @Override

    /**
     * Gets the key
     *
     * @return the key
     */
    public char getKey() {

        return 'v';
    }

    @Override

    /**
     * To string
     *
     * @return String
     */
    public String toString() {

        return "'v'iew";
    }
}
