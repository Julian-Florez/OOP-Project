public class Scalene extends Triangle{
    public Scalene(double side1, double side2, double side3, double angle1, double angle2, double angle3) {
        super(side1, side2, side3, angle1, angle2, angle3);
    }

    @Override
    public double calculateArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
}
