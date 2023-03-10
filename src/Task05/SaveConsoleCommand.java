package Task05;

import Task03.View;

import java.io.IOException;

public class SaveConsoleCommand implements ConsoleCommand {
    private View view;


    /**
     * Save console command
     *
     * @param view the view
     */
    public SaveConsoleCommand(View view) {

        this.view = view;
    }

    @Override

    /**
     * Execute
     */
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

    /**
     * Gets the key
     *
     * @return the key
     */
    public char getKey() {

        return 's';
    }

    @Override

    /**
     * To string
     *
     * @return String
     */
    public String toString() {

        return "'s'ave";
    }
}

