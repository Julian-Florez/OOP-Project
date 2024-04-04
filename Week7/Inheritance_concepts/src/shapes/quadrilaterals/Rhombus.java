package shapes.quadrilaterals;

public class Rhombus  extends Parallelogram{

    private double diagonal1;
    private double diagonal2;

    public Rhombus(double side1, double diagonal1, double diagonal2) {
        super(side1, side1, side1, side1);
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
    }

    @Override
    public double calculateArea() {
        return (diagonal1 * diagonal2) / 2;
    }


}
