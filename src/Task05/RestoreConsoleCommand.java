package Task05;

import Task03.View;

public class RestoreConsoleCommand implements ConsoleCommand {
    private View view;


    /**
     * Restore console command constructor
     *
     * @param view the view
     */
    public RestoreConsoleCommand(View view) {

        this.view = view;
    }

    @Override

    /**
     * Deserialize item
     */
    public void execute() {

        System.out.println("Restore last saved");
        try {
            view.viewRestore();
        } catch (Exception e) {
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

        return 'r';
    }

    @Override

    /**
     * To string
     *
     * @return String
     */
    public String toString() {

        return "'r'estore";
    }
}

