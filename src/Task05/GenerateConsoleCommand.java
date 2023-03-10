package Task05;

import Task03.View;

public class GenerateConsoleCommand implements ConsoleCommand {
    private View view;

    public GenerateConsoleCommand(View view) {
        this.view = view;
    }

    @Override
    public void execute() {
        System.out.println("Random generation");
        view.viewInit();
        view.viewShow();
    }

    @Override
    public char getKey() {
        return 'g';
    }

    @Override
    public String toString() {
        return "'g'enerate";
    }
}
