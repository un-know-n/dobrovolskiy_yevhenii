package Task06;

import Task03.View;
import Task03.ViewableResult;
import Task05.ChangeConsoleCommand;
import Task05.GenerateConsoleCommand;
import Task05.Menu;
import Task05.ViewConsoleCommand;

public class Main {
    private View view = new ViewableResult().getView();

    private Menu menu = new Menu();

    public static void main(String[] args) {
        Main main = new Main();
        main.run();
    }

    public void run() {
        menu.add(new ViewConsoleCommand(view));
        menu.add(new GenerateConsoleCommand(view));
        menu.add(new ChangeConsoleCommand(view));
        menu.add(new ExecuteConsoleCommand(view));
        menu.execute();
    }
}
