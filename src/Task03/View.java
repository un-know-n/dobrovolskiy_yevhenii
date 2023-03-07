package Task03;

import java.io.IOException;

/**
 * View interface
 */
public interface View {

    public void viewHeader();

    public void viewBody();

    public void viewFooter();

    public void viewShow();

    public void viewInit();

    public void viewSave() throws IOException;

    public void viewRestore() throws Exception;
}
