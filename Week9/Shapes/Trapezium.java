import java.lang.Math;

/**
 * The Trapezium class represents a trapezium shape, which is a quadrilateral with one pair of parallel sides.
 * It extends the Quadrilateral class and inherits its properties and methods.
 */
public class Trapezium extends Quadrilateral{

    protected double height;
    protected double rads;

    /**
     * Constructs a Trapezium object with the specified side lengths, angles, and diagonals.
     * 
     * @param side1 the length of the first side
     * @param side2 the length of the second side
     * @param side3 the length of the third side
     * @param side4 the length of the fourth side
     * @param angle1 the measure of the first angle in degrees
     * @param angle2 the measure of the second angle in degrees
     * @param angle3 the measure of the third angle in degrees
     * @param angle4 the measure of the fourth angle in degrees
     * @param diagonal1 the length of the first diagonal
     * @param diagonal2 the length of the second diagonal
     */
    public Trapezium(double side1, double side2, double side3, double side4, double angle1, double angle2, double angle3, double angle4, double diagonal1, double diagonal2) throws InvalidQuadrilateralException{
        super(side1, side2, side3, side4, angle1, angle2, angle3, angle4, diagonal1, diagonal2);
        this.rads = Math.toRadians(angle1);
        this.height = Math.sin(rads) * side1;
    }

   /**
    * Calculates the area of the trapezium.
    * 
    * @return the area of the trapezium
    */
   @Override
   public double calculateArea() {
       return (side1 + side2) * height / 2;
   } 

    /**
     * Creates and returns a deep copy of the Trapezium object.
     * 
     * @return a new Trapezium object with the same property values as this object
     */
    public Trapezium clone() {
         try {
            return new Trapezium(side1, side2, side3, side4, angle1, angle2, angle3, angle4, diagonal1, diagonal2);
        } catch (InvalidQuadrilateralException e) {
            return null;
        }
    }
}
