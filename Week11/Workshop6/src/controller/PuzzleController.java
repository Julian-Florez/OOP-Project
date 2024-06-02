package controller;
import java.util.ArrayList;
import javax.swing.JButton;
import model.PuzzleModel;
import view.PuzzleView;

public class PuzzleController {

    public PuzzleController(PuzzleView view, PuzzleModel model){
        ArrayList<JButton> buttons = view.getButtons();
        for (JButton button : buttons) {
            button.addActionListener(e -> {
                System.out.println(model.checkMoveVertical(Integer.parseInt(button.getText())));
            });
        }
    }

    public static void main(String[] args) {
        PuzzleModel model = new PuzzleModel();
        PuzzleView view = new PuzzleView(model.getNumlist());
        new PuzzleController(view, model);
    }

}
