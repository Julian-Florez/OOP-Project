/**
 * The PuzzleController class is responsible for controlling the puzzle game logic.
 * It connects the PuzzleModel and PuzzleView classes and handles user interactions.
 */
package controller;

import model.PuzzleModel;
import view.PuzzleView;
import javax.swing.JButton;
import java.util.ArrayList;

public class PuzzleController {

    private PuzzleModel model;
    private PuzzleView view;
    private ArrayList<JButton> buttons = new ArrayList<JButton>();

    /**
     * Constructs a PuzzleController object with the specified PuzzleModel and PuzzleView.
     * Initializes the view and adds action listeners to the buttons.
     * @param model the PuzzleModel object
     * @param view the PuzzleView object
     */
    public PuzzleController(PuzzleModel model, PuzzleView view) {
        this.model = model;
        this.view = view;
        view.displayBoard(model.getBoard(), view.getFrame());
        buttons = view.getButtons();
        addListeners();
    }

    /**
     * Adds action listeners to the buttons.
     * When a button is clicked, it retrieves the row and column of the button,
     * moves the puzzle piece accordingly, updates the board view, and checks if the puzzle is solved.
     */
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

    /**
     * Checks if the puzzle is solved.
     * If the puzzle is solved, it calls the solved() method in the view to display a message.
     */
    public void checkSolved(){
        if (model.isSolved()){
            view.solved();
        }
    }

    /**
     * The main method of the PuzzleController class.
     * Creates a new PuzzleModel, PuzzleView, and PuzzleController object to start the puzzle game.
     * @param args the command line arguments
     */
    public static void main(String[] args){
        PuzzleModel model = new PuzzleModel();
        PuzzleView view = new PuzzleView();
        new PuzzleController(model, view);
    }
}