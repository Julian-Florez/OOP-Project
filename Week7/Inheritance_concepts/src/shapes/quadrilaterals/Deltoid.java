package shapes.quadrilaterals;

public class Deltoid extends Quadrilateral {
    private double diagonal1;
    private double diagonal2;

    public Deltoid(double side1, double side2, double diagonal1, double diagonal2) {
        super(side1, side2, side1, side2);
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
    }

    @Override
    public double calculateArea() {
        return (diagonal1 * diagonal2) / 2;
    }
}
