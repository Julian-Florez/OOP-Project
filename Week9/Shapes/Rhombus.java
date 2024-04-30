/**
 * The Rhombus class represents a rhombus shape, which is a parallelogram with equal sides.
 * It extends the Parallelogram class and inherits its properties and methods.
 */
public class Rhombus extends Parallelogram {

    /**
     * Constructs a new Rhombus object with the specified side length, angles, and diagonals.
     *
     * @param side1     the length of the first side of the rhombus
     * @param angle1    the measure of the first angle of the rhombus
     * @param angle2    the measure of the second angle of the rhombus
     * @param diagonal1 the length of the first diagonal of the rhombus
     * @param diagonal2 the length of the second diagonal of the rhombus
     */
    public Rhombus(double side1, double angle1, double angle2, double diagonal1, double diagonal2) {
        super(side1, side1, angle1, angle2, diagonal1, diagonal2);
    }

    /**
     * Calculates and returns the area of the rhombus.
     *
     * @return the area of the rhombus
     */
    @Override
    public double calculateArea() {
        return diagonal1 * diagonal2 / 2;
    }

    /**
     * Creates and returns a clone of the rhombus object.
     *
     * @return a clone of the rhombus object
     */
    public Rhombus clone() {
        return new Rhombus(side1, angle1, angle2, diagonal1, diagonal2);
    }
}
