package Task05;

/**
 * A base class that calls other classes
 */
public class Main {

    /**
     * A method to run the program
     *
     * @param args the arguments
     */
    public static void main(String[] args) {
        Application app = Application.getInstance();
        app.run();
    }
}
