package Task05;

import Task03.View;

import java.io.IOException;

public class SaveConsoleCommand implements ConsoleCommand {
    private View view;

    public SaveConsoleCommand(View view) {
        this.view = view;
    }

    @Override
    public void execute() {
        System.out.println("Save current");
        try {
            view.viewSave();
        } catch (IOException e) {
            System.err.println("Serialization error: " + e);
        }
        view.viewShow();
    }

    @Override
    public char getKey() {
        return 's';
    }

    @Override
    public String toString() {
        return "'s'ave";
    }
}
