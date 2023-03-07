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
    private Area result;

    /**
     * Default constructor
     */
    public Calc() {

        result = new Area();
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

        result.setBinarySide(binarySide);
        return result.setResult(calc(binarySide));
    }


    /**
     * Show the result
     */
    public void show() {

        System.out.println(result);
    }


    /**
     * Gets the result
     *
     * @return the result
     */
    public Area getResult() {

        return result;
    }


    /**
     * Serialize result
     *
     * @param IOException the  IO exception
     * @throws IOException
     */
    public void save() throws IOException {

        ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(FNAME));
        os.writeObject(result);
        os.flush();
        os.close();
    }


    /**
     * Deserialize result
     *
     * @param Exception the exception
     * @throws Exception
     */
    public void restore() throws Exception {

        ObjectInputStream is = new ObjectInputStream(new FileInputStream(FNAME));
        result = (Area) is.readObject();
        is.close();
    }
}
