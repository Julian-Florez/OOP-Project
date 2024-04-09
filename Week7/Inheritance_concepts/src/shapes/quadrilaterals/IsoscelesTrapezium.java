package shapes.quadrilaterals;

public class IsoscelesTrapezium extends Trapezium{

    public IsoscelesTrapezium(double side1, double side2, double side3, double angle1, double angle2, double diagonal1) {
        super(side1, side2, side3, side1, angle1, angle2, angle1, angle2, diagonal1, diagonal1);
        height = Math.sin(angle1) * side1;
    }

    @Override
    public double calculateArea() {
        return (side1 + side2) * height / 2;
    }
}