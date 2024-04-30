import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create instances of Rectangle and Square
        Rectangle rect1 = new Rectangle(4, 5);
        Rectangle rect2 = new Rectangle(3, 6);
        Square square1 = new Square(4);

        // Test compareTo method
        System.out.println("Comparing rect1 and rect2: " + rect1.compareTo(rect2)); // Expected output: Comparison based on area
        System.out.println("Comparing rect1 and square1: " + rect1.compareTo(square1)); // Expected output: Comparison based on area

        // Test sorting of a collection
        List<Quadrilateral> quads = new ArrayList<>();
        quads.add(rect1);
        quads.add(rect2);
        quads.add(square1);

        // Sort the list of quadrilaterals
        Collections.sort(quads);

        // Print sorted list
        System.out.println("Sorted quadrilaterals based on area:");
        for (Quadrilateral quad : quads) {
            System.out.println(quad + " - Area: " + quad.calculateArea());
        }

        // Test clone method
        Quadrilateral clone = rect1.clone();
        System.out.println("Original rectangle: " + rect1);
        System.out.println("Cloned rectangle: " + clone);
        System.out.println("Are original and clone the same object? " + (rect1 == clone)); // Expected output: false
        System.out.println("Do original and clone have the same properties? " + rect1.equals(clone)); // Expected output: true
    }
}

// Concrete subclass for Rectangle
class Rectangle extends Quadrilateral implements Comparable<Rectangle> {
    public Rectangle(double length, double width) {
        super(length, width, length, width, 90, 90, 90, 90, Math.sqrt(length * length + width * width), Math.sqrt(length * length + width * width));
    }

    @Override
    public double calculateArea() {
        return side1 * side2; // Area = length * width
    }

    @Override
    public Quadrilateral clone() {
        return new Rectangle(side1, side2);
    }

    @Override
    public int compareTo(Rectangle other) {
        return Double.compare(this.calculateArea(), other.calculateArea());
    }
}

// Concrete subclass for Square
class Square extends Rectangle {
    public Square(double side) {
        super(side, side);
    }

    @Override
    public Quadrilateral clone() {
        return new Square(side1);
    }
}

abstract class Quadrilateral {
    protected double side1;
    protected double side2;
    
    public abstract double calculateArea(); // Added calculateArea() method
    
    // ... rest of the code
}
