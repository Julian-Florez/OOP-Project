/**
 * The Deltoid class represents a deltoid shape, which is a type of quadrilateral.
 * It extends the Quadrilateral class and provides methods to calculate the area and create a clone of the deltoid.
 */
public class Deltoid extends Quadrilateral {

    /**
     * Constructs a new Deltoid object with the specified side lengths, angles, and diagonals.
     *
     * @param side1     the length of the first side
     * @param side2     the length of the second side
     * @param angle1    the measure of the first angle in degrees
     * @param angle2    the measure of the second angle in degrees
     * @param diagonal1 the length of the first diagonal
     * @param diagonal2 the length of the second diagonal
     */
    public Deltoid(double side1, double side2, double angle1, double angle2, double diagonal1, double diagonal2) throws InvalidQuadrilateralException{
        super(side1, side2, side1, side2, angle1, angle2, angle1, angle2, diagonal1, diagonal2);
        if (!isValidQuadrilateral()) {
            throw new InvalidQuadrilateralException("Invalid quadrilateral");
        }
    }

    /**
     * Calculates the area of the deltoid.
     *
     * @return the area of the deltoid
     */
    @Override
    public double calculateArea() {
        return diagonal1 * diagonal2 / 2;
    }

    /**
     * Creates a clone of the deltoid.
     *
     * @return a new Deltoid object with the same property values as this deltoid
     */
    public Deltoid clone() {
        try {
            return new Deltoid(side1, side2, angle1, angle2, diagonal1, diagonal2);
        } catch (InvalidQuadrilateralException e) {
            return null;
        }
    }

}
