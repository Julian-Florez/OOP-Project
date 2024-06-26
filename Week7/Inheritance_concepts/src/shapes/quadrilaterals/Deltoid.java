package shapes.quadrilaterals;

public class Deltoid extends Quadrilateral {

    public Deltoid(double side1, double side2, double angle1, double angle2, double diagonal1, double diagonal2) {
        super(side1, side2, side1, side2, angle1, angle2, angle1, angle2, diagonal1, diagonal2);
    }

    @Override
    public double calculateArea() {
        return diagonal1 * diagonal2 / 2;
    }

}
