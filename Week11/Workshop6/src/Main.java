import controller.*;
import model.*;
import view.*;

public class Main {
    public static void main(String[] args) {
        PuzzleController controller = new PuzzleController();
        PuzzleModel model = new PuzzleModel();
        PuzzleView view = new PuzzleView(model.getNumlist(), model.getBoard(), controller);

        System.out.println(model.getBoard());
    }
}
