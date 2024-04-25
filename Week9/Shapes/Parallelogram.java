public class Parallelogram extends Quadrilateral {

    public Parallelogram(double side1, double side2, double angle1, double angle2, double diagonal1, double diagonal2) {
        super(side1, side2, side1, side2, angle1, angle2, angle1, angle2, diagonal1, diagonal2);
    }

    @Override
    public double calculateArea() {
        double base = side1; // Assuming side1 is the base
        double height = Math.abs(diagonal2 * Math.sin(angle1)); // Assuming diagonal2 is the height
        return base * height;
    }
    
    @Override
    public Parallelogram clone() {
        return new Parallelogram(side1, side2, angle1, angle2, diagonal1, diagonal2);
    }
}
