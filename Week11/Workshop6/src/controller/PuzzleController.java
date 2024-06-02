package controller;
import model.PuzzleModel;
import view.PuzzleView;
import javax.swing.JButton;
import java.util.ArrayList;

public class PuzzleController {

    private PuzzleModel model;
    private PuzzleView view;
    private ArrayList<JButton> buttons = new ArrayList<JButton>();

    public PuzzleController(PuzzleModel model, PuzzleView view) {
        this.model = model;
        this.view = view;
        view.displayBoard(model.getBoard(), view.getFrame());
        buttons = view.getButtons();
        addListeners();
    }


    public void addListeners(){
        for (JButton button : buttons){
            button.addActionListener(e -> {;
                int row = buttons.indexOf(button) / 4;
                int col = buttons.indexOf(button) % 4;
                model.move(row, col);
                view.updateBoard(model.getBoard());
                checkSolved();
            });
        }
    }
    

    public void checkSolved(){
        if (model.isSolved()){
            view.solved();
        }
    }

    public static void main(String[] args){
        PuzzleModel model = new PuzzleModel();
        PuzzleView view = new PuzzleView();
        new PuzzleController(model, view);
    }
}