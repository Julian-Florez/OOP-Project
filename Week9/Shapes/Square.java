public class Square extends Rectangle{

    public Square(double side1) {
        super(side1, side1);
    }

    @Override
    public double calculateArea() {
        return side1 * side1;
    }

    @Override
    public Square clone() {
        return new Square(side1);
    }
}