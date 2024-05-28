package controller;
import java.util.ArrayList;
import javax.swing.JButton;
import model.PuzzleModel;

public class PuzzleController {

    private ArrayList<ArrayList<Integer>> board;

    public PuzzleController(ArrayList<JButton> buttons, PuzzleModel model){
        for (JButton button : buttons) {
            button.addActionListener(e -> {
                System.out.println(model.checkMoveVertical(Integer.parseInt(button.getText())));
            });
        }
    }

    public void setBoard(ArrayList<ArrayList<Integer>> board){
        this.board = board;
    }

}
