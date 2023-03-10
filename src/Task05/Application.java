package Task05;

import Task03.View;
import Task04.ViewTable;

public class Application {
    private static Application instance = new Application();
    private View view = new ViewTable();
    private Menu menu = new Menu();


    /**
     * Default constructor
     */
    private Application() {

    }


    /**
     * Take app instance
     */
    public static Application getInstance() {

        return instance;
    }


    /**
     * Run the app
     */
    public void run() {
        menu.add(new ViewConsoleCommand(view));
        menu.add(new GenerateConsoleCommand(view));
        menu.add(new ChangeConsoleCommand(view));
        menu.add(new SaveConsoleCommand(view));
        menu.add(new RestoreConsoleCommand(view));
        menu.execute();
    }
}
