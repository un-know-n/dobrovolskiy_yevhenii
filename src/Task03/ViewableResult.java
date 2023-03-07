package Task03;

public class ViewableResult implements Viewable {
    /**
     * Create view object
     */
    @Override
    public View getView() {
        return new ViewResult();
    }
}
