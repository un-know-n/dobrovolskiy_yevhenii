package Task02;

import java.io.*;


/**
 * The class Calc
 */
public class Calc {

    /**
     * Filename when serialization
     */
    private static final String FNAME = "Area.bin";

    /**
     * Calculation results
     */
    private Area area;

    /**
     * Default constructor
     */
    public Calc() {

        area = new Area();
    }


    /**
     * Calculates the sum of the areas of square and equilateral triangle
     *
     * @param binarySide the binary side
     * @return double
     */
    public static double calc(String binarySide) {

        int decimalSide = Integer.parseInt(binarySide, 2);
        double sumOfAreas = 0;

        // Area of the equilateral triangle
        sumOfAreas += (Math.sqrt(3) / 4) * Math.pow(decimalSide, 2);

        // Area of the square
        sumOfAreas += Math.pow(decimalSide, 2);


        return Double.valueOf(String.format("%.2f", sumOfAreas));
    }


    /**
     * Init
     *
     * @param binarySide the binary side
     * @return double
     */
    public double init(String binarySide) {

        area.setBinarySide(binarySide);
        return area.setResult(calc(binarySide));
    }


    /**
     * Show the area
     */
    public void show() {

        System.out.println(area);
    }


    /**
     * Gets the area
     *
     * @return the area
     */
    public Area getArea() {

        return area;
    }


    /**
     * Serialize area
     *
     * @throws IOException
     */
    public void save() throws IOException {

        ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(FNAME));
        os.writeObject(area);
        os.flush();
        os.close();
    }


    /**
     * Deserialize area
     *
     * @throws Exception
     */
    public void restore() throws Exception {

        ObjectInputStream is = new ObjectInputStream(new FileInputStream(FNAME));
        area = (Area) is.readObject();
        is.close();
    }
}
