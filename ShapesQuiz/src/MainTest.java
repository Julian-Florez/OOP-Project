import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void testSquareArea() {
        Square square = new Square(5);
        assertEquals(25, square.calculateArea(), 0.001);
    }

    @Test
    public void testDeltoidArea() {
        Deltoid deltoid = new Deltoid(3, 4, 60, 120, 5, 6);
        assertEquals(12, deltoid.calculateArea(), 0.001);
    }

    // Add more test methods for other shapes...

    @Test
    public void testSquareClone() {
        Square square = new Square(5);
        Square square2 = square.clone();
        assertTrue(square.equals(square2));
    }

    // Add more test methods for other shape operations...

}