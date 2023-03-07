package Task03;

import java.io.IOException;

/**
 * View interface
 */
public interface View {

    /**
     * Display header
     */
    public void viewHeader();

    /**
     * Display body
     */
    public void viewBody();

    /**
     * Display footer
     */
    public void viewFooter();

    /**
     * Show whole carcass
     */
    public void viewShow();

    /**
     * Initialize view
     */
    public void viewInit();

    /**
     * Serialize view
     */
    public void viewSave() throws IOException;

    /**
     * Deserialize view
     */
    public void viewRestore() throws Exception;
}
