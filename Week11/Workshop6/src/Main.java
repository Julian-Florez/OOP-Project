import controller.*;
import model.*;
import view.*;

public class Main {
    public static void main(String[] args) {
        PuzzleModel model = new PuzzleModel();
        PuzzleView view = new PuzzleView(model.getNumlist());

        System.out.println(model.getBoard());
    }
}
