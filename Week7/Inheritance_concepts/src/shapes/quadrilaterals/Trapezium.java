package shapes.quadrilaterals;
import java.lang.Math;

public class Trapezium extends Quadrilateral{

    protected double height;

    public Trapezium(double side1, double side2, double side3, double side4, double angle1, double angle2, double angle3, double angle4, double diagonal1, double diagonal2) {
        super(side1, side2, side3, side4, angle1, angle2, angle3, angle4, diagonal1, diagonal2);
        this.height = Math.sin(angle1) * side1;
    }

   @Override
   public double calculateArea() {
       return (side1 + side2) * height / 2;
   } 
}
