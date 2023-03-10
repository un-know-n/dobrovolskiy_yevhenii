package Task05;

import Task03.View;

public class GenerateConsoleCommand implements ConsoleCommand {
    private View view;


    /**
     * Generate console command
     *
     * @param view the view
     * @return public
     */
    public GenerateConsoleCommand(View view) {

        this.view = view;
    }

    @Override

    /**
     * Execute
     */
    public void execute() {

        System.out.println("Random generation");
        view.viewInit();
        view.viewShow();
    }

    @Override

    /**
     * Gets the key
     *
     * @return the key
     */
    public char getKey() {

        return 'g';
    }

    @Override

    /**
     * To string
     *
     * @return String
     */
    public String toString() {

        return "'g'enerate";
    }
}

