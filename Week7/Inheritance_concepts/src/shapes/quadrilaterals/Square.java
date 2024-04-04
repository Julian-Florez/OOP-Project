package shapes.quadrilaterals;

public class Square extends Rectangle{
    
    public Square(double side) {
        super(side, side);
    }

    @Override
    public double calculateArea() {
        return side1 * side2;
    }
}
