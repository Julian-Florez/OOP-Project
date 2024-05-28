import controller.*;
import model.*;
import view.*;

public class Main {
    public static void main(String[] args) {
        
        PuzzleModel model = new PuzzleModel();
        PuzzleView view = new PuzzleView(model.getNumlist());
        PuzzleController controller = new PuzzleController(view.getButtons(), model);

        System.out.println(model.getBoard());
    }
}
