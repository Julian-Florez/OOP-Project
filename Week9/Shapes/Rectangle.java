public class Rectangle extends Parallelogram{

    public Rectangle(double side1, double side2) {
        super(side1, side2, 90, 90, 0, 0);
        this.diagonal1 = Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2));
        this.diagonal2 = Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2));
    }

    @Override
    public double calculateArea() {
        return side1 * side2;
    }

    @Override
    public Rectangle clone() {
        return new Rectangle(side1, side2);
    }
}
