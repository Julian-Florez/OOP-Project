public class Rhombus  extends Parallelogram{

    public Rhombus(double side1, double angle1, double angle2, double diagonal1, double diagonal2) {
        super(side1, side1, angle1, angle2, diagonal1, diagonal2);
    }

    @Override
    public double calculateArea() {
        return diagonal1 * diagonal2 / 2;
    }
}
