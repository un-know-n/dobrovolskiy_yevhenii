package Task05;

import Task03.View;

public class ViewConsoleCommand implements ConsoleCommand {
    private View view;

    public ViewConsoleCommand(View view) {
        this.view = view;
    }

    @Override
    public void execute() {
        System.out.println("View current");
        view.viewShow();
    }

    @Override
    public char getKey() {
        return 'v';
    }

    @Override
    public String toString() {
        return "'v'iew";
    }
}
