package Task03;

import java.io.*;
import java.util.ArrayList;

public class ViewResult implements View {
    private static final String FNAME = "AreaItems.bin";
    private static final int DEFAULT_NUM = 10;

    private ArrayList<Area> items = new ArrayList<Area>();

    public ViewResult() {
        this(DEFAULT_NUM);
    }

    public ViewResult(int n) {
        for (int ctr = 0; ctr < n; ctr++) {
            items.add(new Area());
        }
    }

    public ArrayList<Area> getItems() {
        return items;
    }

    /**
     * Calculates the sum of the areas of square and equilateral triangle
     *
     * @param binarySide the binary side
     * @return double
     */
    public double calc(String binarySide) {

        int decimalSide = Integer.parseInt(binarySide, 2);
        double sumOfAreas = 0;

        // Area of the equilateral triangle
        sumOfAreas += (Math.sqrt(3) / 4) * Math.pow(decimalSide, 2);

        // Area of the square
        sumOfAreas += Math.pow(decimalSide, 2);


        return Double.valueOf(String.format("%.2f", sumOfAreas));
    }


    public void init(int factor) {
        int iterative = 1;
        for (Area item : items) {
            item.setResult(calc(Integer.toBinaryString(iterative)));
            iterative += factor;
        }
    }

    @Override
    public void viewInit() {
        init((int) (Math.random() * 10));
    }

    @Override
    public void viewHeader() {
        System.out.println("Results: ");
    }

    @Override
    public void viewBody() {
        for (int i = 0; i < items.size(); i++) {
            System.out.printf("\n" + items.get(i).toString());
        }
        System.out.println();
    }

    @Override
    public void viewFooter() {
        System.out.println("End");
    }

    @Override
    public void viewShow() {
        viewHeader();
        viewBody();
        viewFooter();
    }

    @Override
    public void viewSave() throws IOException {
        ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(FNAME));
        os.writeObject(items);
        os.flush();
        os.close();
    }

    @Override
    public void viewRestore() throws Exception {
        ObjectInputStream is = new ObjectInputStream(new FileInputStream(FNAME));
        items = (ArrayList<Area>) is.readObject();
        is.close();
    }
}
